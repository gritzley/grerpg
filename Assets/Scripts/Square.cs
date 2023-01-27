using System.Linq;
using System.Collections.Generic;
using System.Threading.Tasks;
using UnityEngine;

[RequireComponent(typeof(BoxCollider2D))]
[RequireComponent(typeof(SpriteRenderer))]
public class Square : MonoBehaviour
{
    [HideInInspector] public Unit Unit;
    [HideInInspector] public TaskCompletionSource<Square> tcs;

    [SerializeField] private Color highlightColor, softHighlightColor;
    private SpriteRenderer sr;
    private List<Color> colorStack;

    private void Awake()
    {
        sr = GetComponent<SpriteRenderer>();
        colorStack = new List<Color>() { sr.color };
    }
    private void OnMouseDown() => tcs?.TrySetResult(this);

    private void OnMouseEnter()
    {
        AddColor(highlightColor);
    }

    private void OnMouseExit()
    {
        RemoveColor(highlightColor);
    }

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
