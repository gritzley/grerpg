using UnityEngine;
using System.Linq;
using System.Collections.Generic;

[RequireComponent(typeof(Battlefield))]
public class GameManager : MonoBehaviour
{
    private Player player;
    private Battlefield battlefield;
    void Start()
    {
        player = GetComponent<Player>();
        battlefield = GetComponent<Battlefield>();
        Run();
    }

    public async void Run()
    {
        player.BuildDeck(new List<string>() { "Charge", "Knight" });
        await player.Draw(2);

        while (true)
        {
            Card card = await player.UserSelectCard();
            if (card == null)
            {
                Debug.Log("No Playable Cards");
                return;
            }
            if (await card.Spell.Cast(battlefield)) player.Discard(card);
        }
    }
}
