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
            Card card = await _player.UserSelectCard();
            try
            {
                await card.Cast();
                _player.Discard(card);
                return;
            }
            catch (NoValidSquareSelectionException _)
            {
                Debug.Log("Card could not be played, because there was no valid square to select.");
            }
        }
    }
}
