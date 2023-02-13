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
    public Card Init(Battlefield battlefield, Player player, string name)
    {
        TextAsset spellDefiniton = Resources.Load<TextAsset>("spells/" + name);
        if (spellDefiniton == null) throw new NoSpellDefinitionException(name);

        AntlrInputStream inputStream = new AntlrInputStream(spellDefiniton.text);
        RulesLexer lexer = new RulesLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RulesParser parser = new RulesParser(tokenStream);
        _spellTree = parser.spell();

        _name = name;
        GetComponentInChildren<TMP_Text>().text = _name;

        _battlefield = battlefield;
        _player = player;

        MouseEventHandler = GetComponent<MouseEventHandler>();

        return this;
    }
    public async Task Cast()
    {
        foreach (RulesParser.ImperativeContext imperative in _spellTree.imperative())
        {
            await ExecuteImperative(imperative);
        }
    }

    public async Task ExecuteImperative(RulesParser.ImperativeContext imperative)
    {
        switch(imperative.GetChild(0))
        {
            case RulesParser.MoveUnitContext:           await MoveUnit(imperative.moveUnit()); break;
            case RulesParser.SpawnUnitContext:          await SpawnUnit(imperative.spawnUnit()); break;
            case RulesParser.SummonCardInHandContext:   SummonCard(imperative.summonCardInHand()); break;
            case RulesParser.DestroyUnitsContext:       DestroyUnits(imperative.destroyUnits()); break;
            case RulesParser.ChooseUnitContext:         await ChooseUnit(imperative.chooseUnit()); break;
            case RulesParser.UnitFightsUnitContext:     await UnitsFight(imperative.unitFightsUnit()); break;
        }
    }

    private RulesParser.SpellContext _spellTree;
    private string _name;
    private Battlefield _battlefield;
    private Player _player;
    private Unit unit;
    private async Task MoveUnit(RulesParser.MoveUnitContext context)
    {
        unit = await TargetUnit(context.targetUnit());
        int distance = Helpers.GetStepAmount(context.stepAmount());
        Square target = await _battlefield.GetUserSelectedSquare(square => _battlefield.GetDistance(square, unit.Square) <= distance && square.Unit == null);
        unit.GoTo(target);
    }
    private async Task SpawnUnit(RulesParser.SpawnUnitContext context)
    {
        Square target = await _battlefield.GetUserSelectedSquare(square => square.Unit == null);
        string unitName = Helpers.NameValue(context.NAME());
        Instantiate(_battlefield.UnitPrefab).GetComponent<Unit>().Init(_battlefield, unitName).GoTo(target, false);
    }
    private void DestroyUnits(RulesParser.DestroyUnitsContext context)
    {
        Func<Unit, bool> restriction = Helpers.GetUnitSelector(context.unitSelector());
        IEnumerable<Unit> units = new List<Unit>(_battlefield.Units.Where(restriction));
        foreach (Unit unit in units) unit.Die();
    }
    private async Task ChooseUnit(RulesParser.ChooseUnitContext context)
    {
        unit = await TargetUnit(context.targetUnit());
    }
    private async Task UnitsFight(RulesParser.UnitFightsUnitContext context)
    {
        Unit attacker = await TargetUnit(context.targetUnit(0));
        Unit defender = await TargetUnit(context.targetUnit(1));
        await attacker.Fight(defender);
    }
    private async Task<Unit> TargetUnit(RulesParser.TargetUnitContext context)
    {
        if (context.IT() != null) return unit;
        return await SelectUnit(context.unitDescription());
    }
    private async Task<Unit> SelectUnit(RulesParser.UnitDescriptionContext context)
    {
        Func<Unit, bool> hasTypes = _ => true;
        if (context.type() != null)
        {
            List<string> types = context.type().Select(t => t.GetText()).ToList();
            hasTypes = unit => types.All(unit.Types.Contains);
        }
        return (await _battlefield.GetUserSelectedSquare( square => square.Unit != null && hasTypes(square.Unit) ))?.Unit;
    }
    private void SummonCard(RulesParser.SummonCardInHandContext context)
    {
        string cardName = Helpers.NameValue(context.NAME());
        int n = 1;
        if (context.INT() != null) n = Helpers.IntValue(context.INT());
        for (int i = 0; i < n; i++) _player.CreateCard(cardName, Player.Zone.Hand);
    }
}
