using System;
using System.Linq;
using System.Threading.Tasks;
using System.Collections.Generic;
using UnityEngine;
using TMPro;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

[RequireComponent(typeof(MouseEventHandler))]
public class Card : MonoBehaviour
{
    public MouseEventHandler MouseEventHandler;
    public string Name { get => GetComponentInChildren<TMP_Text>().text; }
    public Card Init(Battlefield battlefield, string name)
    {
        TextAsset spellDefiniton = Resources.Load<TextAsset>("spells/" + name);
        if (spellDefiniton == null) throw new NoSpellDefinition(name);

        AntlrInputStream inputStream = new AntlrInputStream(spellDefiniton.text);
        RulesLexer lexer = new RulesLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RulesParser parser = new RulesParser(tokenStream);
        _spellTree = parser.spell();

        _name = name;
        GetComponentInChildren<TMP_Text>().text = _name;

        _battlefield = battlefield;

        MouseEventHandler = GetComponent<MouseEventHandler>();

        return this;
    }
    public async Task Cast()
    {
        foreach (RulesParser.ImperativeContext imperative in _spellTree.imperative())
        {
            IParseTree child = imperative.GetChild(0);

            if (child is RulesParser.MoveUnitContext) await MoveUnit((RulesParser.MoveUnitContext)child);
            if (child is RulesParser.SpawnUnitContext) await SpawnUnit((RulesParser.SpawnUnitContext)child);
        }
    }

    private RulesParser.SpellContext _spellTree;
    private string _name;
    private Battlefield _battlefield;
    private static int intValue(ITerminalNode n) => Int32.Parse(n.GetText());
    private async Task MoveUnit(RulesParser.MoveUnitContext context)
    {
        Unit unit = await SelectUnit(context.targetUnit().unitDescription());
        int distance = intValue(context.INT());
        Square target = await _battlefield.GetUserSelectedSquare(square => _battlefield.GetDistance(square, unit.Square) <= distance && square.Unit == null);
        unit.GoTo(target);
    }
    // Spawn a Unit
    private async Task SpawnUnit(RulesParser.SpawnUnitContext context)
    {
        Square target = await _battlefield.GetUserSelectedSquare(square => square.Unit == null);
        string unitName = String.Join(" ", context.name().children);
        Instantiate(_battlefield.UnitPrefab).GetComponent<Unit>().Init(_battlefield, unitName).GoTo(target, false);
    }
    // Internal Methods
    private async Task<Unit> SelectUnit(RulesParser.UnitDescriptionContext context)
    {
        List<string> types = context.type().Select(t => t.GetText()).ToList();
        return (await _battlefield.GetUserSelectedSquare( square => square.Unit != null && types.All(square.Unit.Types.Contains) ))?.Unit;
    }
}

public class NoSpellDefinition : Exception
{
    public NoSpellDefinition(string name) : base($"There is no definition for a spell called {name}.") { }
}
