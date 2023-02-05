using System;
using System.Linq;
using System.Collections;
using System.Threading.Tasks;
using System.Collections.Generic;
using UnityEngine;

public class Player : MonoBehaviour
{
    [HideInInspector] public List<Card> Deck, Cards, Yard;

    /**
     * Populate the deck with cards from a list
     */
    public void BuildDeck(List<string> cardList)
    {
        Deck = cardList.Select(cardName => Instantiate(CardPrefab, DeckPosition, Quaternion.Euler(0, 180, 0)).GetComponent<Card>().Init(_battlefield, cardName)).ToList();
    }

    /**
     * Move a number of cards from the deck to the hand.
     */
    public async Task Draw(int n = 1)
    {
        for (int i = 0; i < n; i++)
        {
            if (Deck.Count == 0) throw new NoMoreCardsException();
            Cards.Add(Deck.First());
            Deck.RemoveAt(0);
            CalcHandPositions();
            await Task.Delay(100);
        }
    }

    /**
     * Move a card from the hand to the yard
     */
    public void Discard(Card card)
    {
        card.gameObject.LeanMove(YardPosition, 0.3f);
        Cards.Remove(card);
        Yard.Add(card);
        CalcHandPositions();
    }

    /**
     * Wait for the user to pick a card, then return it.
     */
    public async Task<Card> UserSelectCard(Func<Card, bool> restriction = null)
    {
        // Get all cards that fit the description
        List<Card> ViableCards = Cards.Where(restriction ?? (c => true)).ToList();

        // Edge Case returns
        if (ViableCards.Count == 0) return null;

        // Create the TCS for card selection, which cards can use to finish the task
        TaskCompletionSource<Card> tcs = new TaskCompletionSource<Card>();

        // add listeners to card
        Queue<Action> mouseEnterActions = new Queue<Action>(Cards.Select(c =>
        {
            Action onMouseEnterEvent = () => StartCoroutine(HighlightCard(c, true));
            c.OnMouseEnterEvent += onMouseEnterEvent;
            return onMouseEnterEvent;
        }));
        Queue<Action> mouseExitActions = new Queue<Action>(Cards.Select(c =>
        {
            Action onMouseExitEvent = () => StartCoroutine(HighlightCard(c, false));
            c.OnMouseExitEvent += onMouseExitEvent;
            return onMouseExitEvent;
        }));
        Queue<Action> mouseDownActions = new Queue<Action>(Cards.Select(c =>
        {
            Action onMouseDownEvent = () => tcs.TrySetResult(c);
            c.OnMouseDownEvent += onMouseDownEvent;
            return onMouseDownEvent;
        }));

        // Wait for user selection
        Card selectedCard = await tcs.Task;

        // Clean up cards
        Cards.ForEach(c => {
            c.OnMouseEnterEvent -= mouseEnterActions.Dequeue();
            c.OnMouseExitEvent -= mouseExitActions.Dequeue();
            c.OnMouseDownEvent -= mouseDownActions.Dequeue();
        });

        return selectedCard;
    }

    public Player Init(Battlefield battlefield)
    {
        _battlefield = battlefield;
        return this;
    }

    [SerializeField] private Vector3 DeckPosition, YardPosition;
    [SerializeField] private GameObject CardPrefab;
    private Battlefield _battlefield;

    /**
     * Move all cards to the correct position in the hand
     */
    private void CalcHandPositions()
    {
        foreach ((Card card, int index) in Cards.Select((c, i) => (c, i)))
        {
            LeanTween.cancel(card.gameObject);
            float offsetX = index - Cards.Count / 2.0f + 0.5f;
            card.transform.LeanMove(new Vector3(offsetX, (float)Math.Pow(Math.Abs(offsetX), 2) * -0.1f - 5.0f, -1 - index), 0.1f);
            card.transform.LeanRotate(Vector3.back * offsetX * 5, 0.1f);
        }
    }
    /**
     * Move a card slightly upwards to highligth it
     */
    private IEnumerator HighlightCard(Card card, bool on = true)
    {
        float delta = 0.06f * (on ? 1 : -1);
        for (int i = 0; i < 10; i++)
        {
            card.transform.position += card.transform.up * delta;
            yield return new WaitForSeconds(1 / 30);
        }
    }
}

public class NoMoreCardsException : Exception { }