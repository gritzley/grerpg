using System;
using System.Linq;
using System.Collections;
using System.Threading.Tasks;
using System.Collections.Generic;
using UnityEngine;

public class Player : MonoBehaviour
{
    public enum Zone { Deck, Hand, Yard }
    [HideInInspector] public List<Card> Deck, Hand, Yard;
    public Player Init(Battlefield battlefield, List<string> cardList)
    {
        _battlefield = battlefield;
        Deck = new List<Card>();
        cardList.ForEach(cardName => CreateCard(cardName, Zone.Deck));

        return this;
    }
    /**
     * Move a number of cards from the deck to the hand.
     */
    public async Task Draw(int n = 1)
    {
        for (int i = 0; i < n; i++)
        {
            if (Deck.Count == 0) throw new NoMoreCardsException();
            Hand.Add(Deck.First());
            Deck.RemoveAt(0);
            CalcHandPositions();
            await Task.Delay(100);
        }
    }
    public Card CreateCard(string cardName, Zone zone, int amount = 1)
    {
        Card card = CreateCard(cardName);
        switch (zone)
        {
            case Zone.Deck:
                card.transform.position = DeckPosition;
                card.transform.rotation = Quaternion.Euler(0, 180, 0);
                Deck.Add(card);
                break;
            case Zone.Hand:
                Hand.Add(card);
                CalcHandPositions();
                break;
            case Zone.Yard:
                card.transform.position = YardPosition;
                Yard.Add(card);
                break;
        }

        return card;
    }

    /**
     * Move a card from the hand to the yard
     */
    public void Discard(Card card)
    {
        card.gameObject.LeanMove(YardPosition, 0.3f);
        Hand.Remove(card);
        Yard.Add(card);
        CalcHandPositions();
    }

    /**
     * Wait for the user to pick a card, then return it.
     */
    public async Task<Card> GetUserSelectedCard(Func<Card, bool> restriction = null)
    {
        // Get all cards that fit the restriction
        List<Card> ViableCards = Hand.Where(restriction ?? (c => true)).ToList();

        // Edge Case returns
        if (ViableCards.Count == 0) throw new NoPlayableCardsException();

        // Create the TCS for card selection, which cards can use to finish the task
        cardSelection = new TaskCompletionSource<Card>();
        Queue<Action> mouseEnterActions = new Queue<Action>();
        Queue<Action> mouseExitActions = new Queue<Action>();
        Queue<Action> mouseDownActions = new Queue<Action>();
        foreach (Card card in ViableCards)
        {
            mouseEnterActions.Enqueue(() => StartCoroutine(HighlightCard(card, true)));
            mouseExitActions.Enqueue(() => StartCoroutine(HighlightCard(card, false)));
            mouseDownActions.Enqueue(() => cardSelection.TrySetResult(card));

            card.MouseEventHandler.OnMouseEnterEvent += mouseEnterActions.Last();
            card.MouseEventHandler.OnMouseExitEvent += mouseExitActions.Last();
            card.MouseEventHandler.OnMouseDownEvent += mouseDownActions.Last();
        }

        // Wait for user selection
        Card selectedCard = await cardSelection.Task;

        // Clean up cards
        foreach (Card card in ViableCards)
        {
            card.MouseEventHandler.OnMouseEnterEvent -= mouseEnterActions.Dequeue();
            card.MouseEventHandler.OnMouseExitEvent -= mouseExitActions.Dequeue();
            card.MouseEventHandler.OnMouseDownEvent -= mouseDownActions.Dequeue();
        }

        if (selectedCard == null) throw new TurnEndedException();

        return selectedCard;
    }

    public void TryEndTurn()
    {
        cardSelection?.TrySetResult(null);
    }

    [SerializeField] private Vector3 DeckPosition, YardPosition;
    [SerializeField] private GameObject CardPrefab;
    private Battlefield _battlefield;
    private TaskCompletionSource<Card> cardSelection;
    /**
     * Move all cards to the correct position in the hand
     */
    private void CalcHandPositions()
    {
        foreach ((Card card, int index) in Hand.Select((c, i) => (c, i)))
        {
            float offsetX = index - Hand.Count / 2.0f + 0.5f;
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
    private Card CreateCard(string cardName) => Instantiate(CardPrefab, Vector3.zero, Quaternion.identity).GetComponent<Card>().Init(_battlefield, this, cardName);

}

public class NoMoreCardsException : Exception { }
public class NoPlayableCardsException : Exception { }
public class TurnEndedException : Exception { }
