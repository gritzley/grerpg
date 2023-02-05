using System;
using System.Collections.Generic;
using UnityEngine;
using Antlr4.Runtime;
using System.Linq;
using Antlr4.Runtime.Tree;

public class Unit : MonoBehaviour
{
    [HideInInspector] public List<string> Types;
    [HideInInspector] public Square Square;
    [HideInInspector] public int Health = 100;
    public Unit Init(Battlefield battlefield, string name)
    {
        TextAsset unitDefinition = Resources.Load<TextAsset>("units/" + name);
        if (unitDefinition == null) throw new NoUnitDefinition(name);

        AntlrInputStream inputStream = new AntlrInputStream(unitDefinition.text);
        UnitsLexer lexer = new UnitsLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        UnitsParser parser = new UnitsParser(tokenStream);

        _unitTree = parser.unit();

        Types = _unitTree.unitType().Select(t => t.GetText()).ToList();
        Health = intValue(_unitTree.INT());

        return this;
    }
    public void GoTo(Square square)
    {
        if (Square != null) Square.Unit = null;
        transform.position = square.transform.position;
        square.Unit = this;
        Square = square;
    }
    public void Damage(int amount)
    {
        Health -= amount;
    }

    private UnitsParser.UnitContext _unitTree;
    private Battlefield _battlefield;
    private int intValue(ITerminalNode n) => Int32.Parse(n.GetText());

}

public class NoUnitDefinition : Exception
{
    public NoUnitDefinition(string name) : base($"There is no definition for a unit called {name}.") { }
}
