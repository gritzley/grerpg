using System.Collections;
using System.Collections.Generic;
using UnityEngine;


public abstract class Ability
{
    private Battlefield Battlefield;

    public Ability(Battlefield battlefield)
    {
        Battlefield = battlefield;
    }
    // Abstract Methods
    public abstract void Activate();

    // Protected Methods
    protected async void Move()
    {
        Square square = await Battlefield.UserSelectSquare(s => s.transform.position.x > 0);
    }
}
