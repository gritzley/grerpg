using System;
using UnityEngine;
using TMPro;
using System.Threading.Tasks;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System.Linq;
using System.Collections.Generic;

[RequireComponent(typeof(BoxCollider2D))]
public class Card : MonoBehaviour
{
    public event Action OnMouseEnterEvent, OnMouseExitEvent, OnMouseDownEvent;
    public string Name { get => GetComponentInChildren<TMP_Text>().text; }
    public Card Init(Battlefield battlefield, string name)
    {
        TextAsset spellDefiniton = Resources.Load<TextAsset>("spells/" + name);
        if (spellDefiniton == null) throw new NoSpellDefinition(name);

        AntlrInputStream inputStream = new AntlrInputStream(spellDefiniton.text);
        SpellsLexer lexer = new SpellsLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SpellsParser parser = new SpellsParser(tokenStream);
        _spellTree = parser.spell();

        _name = name;
        GetComponentInChildren<TMP_Text>().text = _name;

        _battlefield = battlefield;

        return this;
    }
    public async Task Cast()
    {
        foreach (SpellsParser.ImperativeContext imperative in _spellTree.imperative())
        {
            IParseTree child = imperative.GetChild(0);

            if (child is SpellsParser.MoveUnitContext) await MoveUnit((SpellsParser.MoveUnitContext)child);
            if (child is SpellsParser.SpawnUnitContext) await SpawnUnit((SpellsParser.SpawnUnitContext)child);
        }
    }

    private SpellsParser.SpellContext _spellTree;
    private string _name;
    private Battlefield _battlefield;
    private static int intValue(ITerminalNode n) => Int32.Parse(n.GetText());
    private async Task MoveUnit(SpellsParser.MoveUnitContext context)
    {
        Unit unit = await SelectUnit(context.unitDescription());

        int distance = intValue(context.INT());
        Square target = await _battlefield.UserSelectSquare(s => _battlefield.Distance(s, unit.Square) <= distance);

        unit.GoTo(target);
    }
    // Spawn a Unit
    private async Task SpawnUnit(SpellsParser.SpawnUnitContext context)
    {
        Square target = await _battlefield.UserSelectSquare();

        string unitName = String.Join(" ", context.unitName().children);

        Instantiate(_battlefield.UnitPrefab).GetComponent<Unit>().Init(_battlefield, unitName).GoTo(target);
    }
    // Internal Methods
    private async Task<Unit> SelectUnit(SpellsParser.UnitDescriptionContext context)
    {
        List<string> types = context.unitType().Select(t => t.GetText()).ToList();

        Unit unit = (await _battlefield.UserSelectSquare(s =>
        {
            if (s.Unit == null) return false;
            foreach (string type in types) if (!s.Unit.Types.Contains(type)) return false;
            return true;
        }))?.Unit;

        return unit;
    }
    private void OnMouseDown() => OnMouseDownEvent?.Invoke();
    private void OnMouseEnter() => OnMouseEnterEvent?.Invoke();
    private void OnMouseExit() => OnMouseExitEvent?.Invoke();
}

public class NoSpellDefinition : Exception
{
    public NoSpellDefinition(string name) : base($"There is no definition for a spell called {name}.") { }
}
