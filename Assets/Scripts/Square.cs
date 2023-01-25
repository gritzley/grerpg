using System;
using System.Linq;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

[RequireComponent(typeof(BoxCollider2D))]
[RequireComponent(typeof(SpriteRenderer))]
public class Square : MonoBehaviour
{
    [HideInInspector] public Unit Unit;
    public SimpleEventHandler EventHandler;
    [SerializeField] private Color highlightColor;
    private Color color;
    private SpriteRenderer sr;

    private void Awake()
    {
        EventHandler = new SimpleEventHandler();
        sr = GetComponent<SpriteRenderer>();
        color = sr.color;
    }
    private void OnMouseDown() => EventHandler.Call("click");

    private void OnMouseEnter()
    {
        Highlight(true);
    }

    private void OnMouseExit()
    {
        Highlight(false);
    }

    private void Highlight(bool on = true)
    {
        sr.color = on ? highlightColor : color;
    }
}
