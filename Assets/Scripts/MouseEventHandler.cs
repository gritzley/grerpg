using System;
using UnityEngine;

[RequireComponent(typeof(BoxCollider2D))]
public class MouseEventHandler : MonoBehaviour
{
    public event Action OnMouseEnterEvent, OnMouseExitEvent, OnMouseDownEvent;
    private void OnMouseDown() => OnMouseDownEvent?.Invoke();
    private void OnMouseEnter() => OnMouseEnterEvent?.Invoke();
    private void OnMouseExit() => OnMouseExitEvent?.Invoke();
}
