using System;
using System.Collections;
using System.Threading.Tasks;
using UnityEngine;
using TMPro;

[RequireComponent(typeof(BoxCollider2D))]
public class Card : MonoBehaviour
{
    [HideInInspector] public TaskCompletionSource<Card> tcs;
    [HideInInspector] public CardDefinition definition;
    [HideInInspector] public event Action OnMouseEnterEvent, OnMouseExitEvent;
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
    private void OnMouseDown()
    {
        tcs?.TrySetResult(this);
    }

    private void OnMouseEnter() => OnMouseEnterEvent?.Invoke();
    private void OnMouseExit() => OnMouseExitEvent?.Invoke();

    public static Card Build(string name)
    {
        Type T = Type.GetType("CD_" + name);
        if (T == null || !typeof(CardDefinition).IsAssignableFrom(T)) throw new Exception($"There is no card named {name}.");

        CardDefinition cardDefinition = (CardDefinition)Activator.CreateInstance(T);
        Card card = Instantiate((GameObject)Resources.Load("prefabs/card")).GetComponent<Card>();
        card.definition = cardDefinition;
        card.Name = name;
        return card;
    }
}
