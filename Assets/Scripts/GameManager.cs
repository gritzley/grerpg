using System.Collections;
using System.Collections.Generic;
using UnityEngine;

[RequireComponent(typeof(Battlefield))]
public class GameManager : MonoBehaviour
{
    private Battlefield battlefield;
    void Start()
    {
        battlefield = GetComponent<Battlefield>();
        Run();
    }

    public async void Run()
    {
        while (true)
        {
            Debug.Log(battlefield);
            Card selectedCard = await battlefield.UserSelectCard();
            await selectedCard.definition.Activate(battlefield);
        }
    }
}
