using System;
using System.Linq;
using System.Collections.Generic;
using System.Threading.Tasks;
using UnityEngine;

public abstract class Ability : MonoBehaviour
{
    public Battlefield Battlefield;
    public Ability(Battlefield battlefield)
    {
        Battlefield = battlefield;
    }
    public abstract void Activate();

    protected async void MoveAUnit(int speed)
    {
        Func<Square, bool> hasUnit = s => s.Unit != null;
        Unit unit = (await Battlefield.UserSelectSquare(hasUnit)).Unit;

        Func<Square, bool> reachable = s => Battlefield.Distance(s, unit.Square) <= speed;
        Square target = await Battlefield.UserSelectSquare(reachable);

        unit.GoTo(target);
    }
}
