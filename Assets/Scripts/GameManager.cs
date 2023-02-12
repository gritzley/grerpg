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
        _player = GetComponent<Player>().Init(_battlefield, _playerDeck);
        Run();
    }

    private async void Run()
    {
        await _player.Draw(_startHandSize);
        _running = true;

        while (_running)
        {
            await PlayerTurn();
            await CombatPhase();
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
            catch (TurnEndedException)
            {
                Debug.Log("Player ended his turn");
                return;
            }
        }
    }
    private async Task CombatPhase()
    {
        foreach (Unit unit in new List<Unit>(_battlefield.Units))
        {
            if (unit == null) continue; // if unit is destroyed before it's turn
            await unit.TriggerBehaviour(RulesLexer.START_COMBAT);
        }
    }
}
