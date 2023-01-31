using System;
using System.Collections.Generic;
using UnityEngine;

public abstract class Unit : MonoBehaviour
{
    [HideInInspector] public List<string> Tags;
    [HideInInspector] public Square Square;
    private int Health = 100;
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
    public static Unit Spawn(string name, Battlefield battlefield)
    {
        Type type = Type.GetType($"U_{name}");

        if (type == null || !typeof(Unit).IsAssignableFrom(type)) throw new Exception($"There is no definition for a unit called {name}");

        Unit unit = (Unit)Instantiate((GameObject)Resources.Load("prefabs/unit")).AddComponent(type);
        return unit;
    }
}
