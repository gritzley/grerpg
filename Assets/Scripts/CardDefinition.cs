using System;
using System.Threading.Tasks;

public abstract class CardDefinition
{
    protected Battlefield battlefield;
    public abstract Task<bool> Activate(Battlefield b);
    protected async Task<bool> MoveAUnit(int speed)
    {
        Unit unit = (await battlefield.UserSelectSquare(s => s.Unit != null))?.Unit;
        Square target = await battlefield.UserSelectSquare(s => battlefield.Distance(s, unit.Square) <= speed);

        if (unit == null) return false;
        if (target == null) return false;

        unit.GoTo(target);
        return true;
    }
}
