using UnityEngine;
using System;
using System.Linq;
using System.Collections.Generic;
using System.Threading.Tasks;

[RequireComponent(typeof(Battlefield))]
public class GameManager : MonoBehaviour
{
    [SerializeField] private List<string> _playerDeck;
    [SerializeField] private int _startHandSize;
    private Player _player;
    private Battlefield _battlefield;
    private bool _running = false;
    private void Start()
    {
        _battlefield = GetComponent<Battlefield>();
        _player = GetComponent<Player>().Init(_battlefield);
        Run();
    }

    private async void Run()
    {
        _player.BuildDeck(_playerDeck);
        await _player.Draw(_startHandSize);
        _running = true;

        while (_running)
        {
            await PlayerTurn();
        }
    }

    private async Task PlayerTurn()
    {
        while (true)
        {
            try
            {
                Card card = await _player.GetUserSelectedCard();
                await card.Cast();
                _player.Discard(card);
                return;
            }
            catch (NoValidSquareSelectionException)
            {
                Debug.Log("Card could not be played, because there was no valid square to select.");
            }
            catch (NoPlayableCardsException)
            {
                Debug.Log("No more playable cards. Ending play.");
                _running = false;
                return;
            }
        }
    }
}
