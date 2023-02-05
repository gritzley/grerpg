using System.Linq;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

using TMPro;

[RequireComponent(typeof(MouseEventHandler))]
[RequireComponent(typeof(SpriteRenderer))]
public class Square : MonoBehaviour
{
    public Unit Unit;
    public MouseEventHandler MouseEventHandler;
    public void Highlight(bool on = true)
    {
        if (on) AddColor(softHighlightColor);
        else RemoveColor(softHighlightColor);
    }

    [SerializeField] private Color highlightColor, softHighlightColor;
    private SpriteRenderer _spriteRenderer;
    private List<Color> _colorStack;
    private void Awake()
    {
        _spriteRenderer = GetComponent<SpriteRenderer>();
        _colorStack = new List<Color>() { _spriteRenderer.color };

        MouseEventHandler = GetComponent<MouseEventHandler>();
        MouseEventHandler.OnMouseEnterEvent += () => AddColor(highlightColor);
        MouseEventHandler.OnMouseExitEvent += () => RemoveColor(highlightColor);
    }
    private void AddColor(Color c)
    {
        _colorStack.Add(c);
        _spriteRenderer.color = _colorStack.Last();
    }
    private void RemoveColor(Color c)
    {
        _colorStack.Remove(c);
        _spriteRenderer.color = _colorStack.Last();
    }
}
