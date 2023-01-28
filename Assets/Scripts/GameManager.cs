using UnityEngine;

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
        await player.Draw(5);
        while (true)
        {
            await player.Draw();
            Card card = await player.UserSelectCard();
            if (card == null)
            {
                Debug.Log("No Playable Cards");
                return;
            }
            await card.definition.Activate(battlefield);
            player.Discard(card);
        }
    }
}
