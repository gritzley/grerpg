using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using TMPro;

[RequireComponent(typeof(BoxCollider2D))]
public class Card : MonoBehaviour
{
    private string name;
    public string Name
    {
        get => name;
        set
        {
            name = value;
            GetComponentInChildren<TMP_Text>().text = name;
        }
    }
    private void OnMouseDown()
    {
        GetComponent<Ability>().Activate();
    }
    private void OnMouseEnter()
    {
        StartCoroutine(Highlight(true));
    }

    private void OnMouseExit()
    {
        StartCoroutine(Highlight(false));
    }

    IEnumerator Highlight(bool on = true)
    {
        for (int i = 0; i < 30; i++)
        {
            transform.position += transform.up * ((on ? 1 : -1) * 0.01f);
            yield return new WaitForSeconds(1/30);
        }
    }
}
