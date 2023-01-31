using System;
using UnityEngine;
using TMPro;

[RequireComponent(typeof(BoxCollider2D))]
public class Card : MonoBehaviour
{
    [HideInInspector] public event Action OnMouseEnterEvent, OnMouseExitEvent, OnMouseDownEvent;
    [HideInInspector] public Spell Spell;
    private string _name;
    public string Name
    {
        get => _name;
        set
        {
            _name = value;
            GetComponentInChildren<TMP_Text>().text = _name;
        }
    }
    private void OnMouseDown() => OnMouseDownEvent?.Invoke();
    private void OnMouseEnter() => OnMouseEnterEvent?.Invoke();
    private void OnMouseExit() => OnMouseExitEvent?.Invoke();
    public static Card Build(string name)
    {
        Card card = Instantiate((GameObject)Resources.Load("prefabs/card")).GetComponent<Card>();
        card.Spell = Spell.CreateInstance(name);
        card.Name = name;
        return card;
    }
}
