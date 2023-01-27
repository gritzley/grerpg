using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class A_Charge : Ability
{
    public A_Charge(Battlefield b) : base(b) { }
    public override void Activate()
    {
        MoveAUnit(3);
    }
}
