using UnityEngine;

[RequireComponent(typeof(Battlefield))]
public class GameManager : MonoBehaviour
{
    void Start()
    {
        Run();
    }

    public async void Run()
    {
        while (true)
        {
            Card selectedCard = await GetComponent<Player>().UserSelectCard();
            await selectedCard.definition.Activate(GetComponent<Battlefield>());
        }
    }
}
