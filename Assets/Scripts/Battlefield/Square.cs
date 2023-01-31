using System;
using System.Linq;
using System.Collections.Generic;
using UnityEngine;

[RequireComponent(typeof(BoxCollider2D))]
[RequireComponent(typeof(SpriteRenderer))]
public class Square : MonoBehaviour
{
    [HideInInspector] public Unit Unit;
    [SerializeField] private Color highlightColor, softHighlightColor;
    [HideInInspector] public event Action OnMouseEnterEvent, OnMouseExitEvent, OnMouseDownEvent;
    private SpriteRenderer sr;
    private List<Color> colorStack;

    private void Awake()
    {
        sr = GetComponent<SpriteRenderer>();
        colorStack = new List<Color>() { sr.color };
        OnMouseEnterEvent += () => AddColor(highlightColor);
        OnMouseExitEvent += () => RemoveColor(highlightColor);
    }
    private void OnMouseDown() => OnMouseDownEvent?.Invoke();
    private void OnMouseEnter() => OnMouseEnterEvent?.Invoke();
    private void OnMouseExit() => OnMouseExitEvent?.Invoke();

    private void AddColor(Color c)
    {
        colorStack.Add(c);
        sr.color = colorStack.Last();
    }

    private void RemoveColor(Color c)
    {
        colorStack.Remove(c);
        sr.color = colorStack.Last();
    }

    public void Highlight(bool on = true)
    {
        if (on) AddColor(softHighlightColor);
        else RemoveColor(softHighlightColor);
    }
}
