using System;
using System.Linq;
using System.Collections.Generic;
using System.Threading.Tasks;
using UnityEngine;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

public class Unit : MonoBehaviour
{
    [HideInInspector] public List<string> Types;
    public Square Square;
    public int Health, Damage;
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
        Health = INTValue(_unitTree.stats().INT(1));
        Damage = INTValue(_unitTree.stats().INT(0));
        Name = name;
        Description = unitDefinition.text;

        _battlefield = battlefield;
        _battlefield.Units.Add(this);

        return this;
    }
    public void GoTo(Square square, bool animated = true)
    {
        if (Square != null && Square.Unit == this) Square.Unit = null;

        if (animated) transform.LeanMove(square.transform.position, 0.1f);
        else transform.position = square.transform.position;

        square.Unit = this;
        Square = square;
    }
    public void TakeDamage(int amount)
    {
        Health -= amount;
        if (Health <= 0) Die();
    }
    public async Task TriggerBehaviour(int trigger)
    {
        IEnumerable<RulesParser.InstructionContext> instructions = _unitTree.behaviour().instruction()
            .Where(instruction => instruction.trigger().GetToken(trigger, 0) != null);

        foreach (RulesParser.InstructionContext instruction in instructions)
        {
            foreach (RulesParser.ActionContext action in instruction.action())
            {
                IParseTree child = action.GetChild(0);
                if (child is RulesParser.MoveContext) await Move(action.move());
                if (child is RulesParser.TurnContext) Turn(action.turn());
            }
        }
    }
    public Vector3 GetDirectionVector(RulesParser.DirectionContext context)
    {
        switch (Symbol(context))
        {
            case RulesLexer.FORWARDS: return transform.up;
            case RulesLexer.BACKWARDS: return -transform.up;
            case RulesLexer.RIGHT: return transform.right;
            case RulesLexer.LEFT: return -transform.right;

            case RulesLexer.FORWARDS_RIGHT: return transform.up + transform.right;
            case RulesLexer.FORWARDS_LEFT: return transform.up - transform.right;
            case RulesLexer.BACKWARDS_RIGHT: return -transform.up + transform.right;
            case RulesLexer.BACKWARDS_LEFT: return -(transform.up + transform.right);
        }
        throw new UnreachableCodeException();
    }

    private RulesParser.UnitContext _unitTree;
    private Battlefield _battlefield;
    private int INTValue(ITerminalNode n) => Int32.Parse(n.GetText());
    private async Task Move(RulesParser.MoveContext context)
    {
        int stepAmount = Helpers.GetStepAmount(context.stepAmount());
        Vector3 direction = GetDirectionVector(context.direction());
        Square target = null;
        foreach (Square step in _battlefield.GetSquaresInDirection(Square, direction, stepAmount))
        {
            if (step == null) break;
            if (step.Unit != null) await Fight(step.Unit);
            if (step.Unit != null) break;
            target = step;
        }

        if (target == null) return;
        GoTo(target);
    }
    private void Turn(RulesParser.TurnContext context)
    {
        transform.LeanRotateAround(transform.forward, GetTurnAmount(context), 0.1f);
    }
    private float GetTurnAmount(RulesParser.TurnContext context)
    {
        switch (Symbol(context))
        {
            case RulesParser.LEFT:   return -90;
            case RulesParser.RIGHT:  return 90;
            case RulesParser.AROUND: return 180;
        }
        throw new UnreachableCodeException();
    }
    private async Task Fight(Unit enemy)
    {
        transform.LeanMove(transform.position + (enemy.transform.position - transform.position) * 0.1f, 0.05f);
        await Task.Delay(50);
        transform.LeanMove(Square.transform.position, 0.05f);
        await Task.Delay(50);
        enemy.TakeDamage(Damage);
    }
    private int Symbol(IParseTree context, int i = 0) => ((ITerminalNode)context.GetChild(i)).Symbol.Type;
    private void Die()
    {
        _battlefield.Units.Remove(this);
        DestroyImmediate(gameObject);
    }
}
