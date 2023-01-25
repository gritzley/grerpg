using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Unit : MonoBehaviour
{
    [HideInInspector] public Square Square;
    [SerializeField] private int Health = 100;
    private Battlefield Battlefield;
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
        if (Health <= 0) Destroy(gameObject);
    }

    public Unit Spawn(Battlefield battlefield, Square startingSquare)
    {
        Unit unit = Instantiate(gameObject).GetComponent<Unit>();
        unit.Battlefield = battlefield;
        unit.GoTo(startingSquare);
        return unit;
    }
}
