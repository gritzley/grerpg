using System;
using System.Linq;
using System.Collections;
using System.Threading.Tasks;
using System.Collections.Generic;
using UnityEngine;

public class Player : MonoBehaviour
{
    public List<Card> Cards;
    void Awake()
    {
        BuildCards(new List<string> { "Charge", "Charge", "Charge", "Charge" });
    }
    private void BuildCards(List<string> cardList)
    {
        cardList.ForEach(n => Cards.Add(Card.Build(n)));
        foreach ((Card card, int index) in Cards.Select((c, i) => (c, i)))
        {
            float offsetX = index - Cards.Count / 2.0f + 0.5f;
            card.transform.position = new Vector3(offsetX * 2.0f, (float)Math.Pow(Math.Abs(offsetX), 2) * -0.2f - 5.5f, -1 - index);
            card.transform.rotation = Quaternion.Euler(Vector3.back * offsetX * 10);
        }
    }
    public async Task<Card> UserSelectCard(Func<Card, bool> restriction = null)
    {
        // Get all cards that fit the description
        List<Card> ViableCards = Cards.Where(restriction ?? (c => true)).ToList();

        // Edge Case returns
        if (ViableCards.Count == 0) return null;

        Queue<Action> muoseEnterActions = new Queue<Action>(Cards.Select(c =>
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

        // Create the TCS for card selection, which cards can use to finish the task
        TaskCompletionSource<Card> cardSelection = new TaskCompletionSource<Card>();
        ViableCards.ForEach(c => c.tcs = cardSelection);

        // Wait for user selection
        Card selectedCard = await cardSelection.Task;

        StartCoroutine(HighlightCard(selectedCard, false));

        Cards.ForEach(c => {
            c.OnMouseEnterEvent -= muoseEnterActions.Dequeue();
            c.OnMouseExitEvent -= mouseExitActions.Dequeue();
        });

        // Clean up the TCS
        ViableCards.ForEach(c => c.tcs = null);

        return selectedCard;
    }

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
