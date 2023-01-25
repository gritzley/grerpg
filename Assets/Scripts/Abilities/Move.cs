using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MoveAbility : Ability
{
    public MoveAbility(Battlefield b) : base(b) { }
    public override void Activate()
    {
        Move();
    }
}
