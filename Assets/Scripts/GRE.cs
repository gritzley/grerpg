using System;
using System.Threading.Tasks;
using UnityEngine;
public static class GRE
{
    public static async Task<bool> MoveAUnit(Battlefield battlefield, int speed)
    {
        Unit unit = (await battlefield.UserSelectSquare(s => s.Unit != null))?.Unit;
        if (unit == null) return false;

        Square target = await battlefield.UserSelectSquare(s => battlefield.Distance(s, unit.Square) <= speed);
        if (target == null) return false;

        unit.GoTo(target);
        return true;
    }
    public static async Task<bool> SpawnUnit(Battlefield battlefield, string name, Func<Square, bool> placementRestriction = null)
    {

        Square target = await battlefield.UserSelectSquare(placementRestriction ?? (s => true));
        if (target == null) return false;

        Unit unit = Unit.Spawn(name);
        unit.GoTo(target);

        return true;
    }
}
