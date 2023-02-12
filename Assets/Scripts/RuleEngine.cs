using System;
using System.Linq;
using System.Threading.Tasks;
using System.Collections.Generic;
using UnityEngine;
using TMPro;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
public static class Helpers
{
    private static Unit unit;
    public static Battlefield Battlefield;
    public static int IntValue(ITerminalNode n) => Int32.Parse(n.GetText());
    public static int Symbol(IParseTree context, int i = 0) => ((ITerminalNode)context.GetChild(i)).Symbol.Type;
    public static int GetStepAmount(RulesParser.StepAmountContext context)
    {
        switch (Symbol(context))
        {
            case RulesLexer.ONE: return 1;
            case RulesLexer.INT: return IntValue(context.INT());
        }
        throw new UnreachableCodeException();
    }
}
