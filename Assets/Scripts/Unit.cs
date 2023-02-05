using System;
using System.Linq;
using System.Collections.Generic;
using UnityEngine;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

public class Unit : MonoBehaviour
{
    [HideInInspector] public List<string> Types;
    [HideInInspector] public Square Square;
    [HideInInspector] public int Health, Speed;
    [HideInInspector] public string Name, Description;
    public Unit Init(Battlefield battlefield, string name)
    {
        TextAsset unitDefinition = Resources.Load<TextAsset>("units/" + name);
        if (unitDefinition == null) throw new NoUnitDefinition(name);

        AntlrInputStream inputStream = new AntlrInputStream(unitDefinition.text);
        RulesLexer lexer = new RulesLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RulesParser parser = new RulesParser(tokenStream);

        _unitTree = parser.unit();

        Types = _unitTree.type().Select(t => t.GetText()).ToList();
        Health = intValue(_unitTree.stats().INT(1));
        Speed = intValue(_unitTree.stats().INT(0));
        Name = name;
        Description = unitDefinition.text;

        return this;
    }
    public void GoTo(Square square, bool animated = true)
    {
        if (Square != null) Square.Unit = null;

        if (animated) transform.LeanMove(square.transform.position, 0.1f);
        else transform.position = square.transform.position;

        square.Unit = this;
        Square = square;
    }
    public void Damage(int amount)
    {
        Health -= amount;
    }

    private RulesParser.UnitContext _unitTree;
    private Battlefield _battlefield;
    private int intValue(ITerminalNode n) => Int32.Parse(n.GetText());
}

public class NoUnitDefinition : Exception
{
    public NoUnitDefinition(string name) : base($"There is no definition for a unit called {name}.") { }
}
