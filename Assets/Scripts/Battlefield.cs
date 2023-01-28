using System;
using System.Linq;
using System.Collections;
using System.Collections.Generic;
using System.Threading.Tasks;
using UnityEngine;

public class Battlefield : MonoBehaviour
{
    [SerializeField] private Vector2Int Dimensions = Vector2Int.one;
    [SerializeField] private GameObject SquarePrefab, UnitPrefab, CardPrefab;

    private float FieldSize = 1.2f;
    
    // Fields for Squares
    public Dictionary<(int, int), Square> Squares;
    public (int, int) SquareID(Square square) => Squares.Where(e => e.Value == square).First().Key;
    public List<Square> GetSquares(Func<Square, bool> predicate) => Squares.Values.Where(predicate).ToList();

    // Fields and methods for Cards
    public List<Card> Cards;
    // Getters for math stuff
    private Vector3 SquarePosition(int x, int y) => new Vector3(GetPosition1D(Dimensions.x, x), GetPosition1D(Dimensions.y, y), 0);
    private float GetPosition1D(int n, int i) => (n - 1) * (FieldSize / -2) + FieldSize * i;

    // Build Battlefield
    private void Start()
    {
        // Create Squares
        BuildSquares();

        Instantiate(UnitPrefab).GetComponent<Unit>().GoTo(Squares[(3, 3)]);

        BuildCards(new List<string> { "Charge", "Charge", "Charge", "Charge" });

        Run();
    }

    public async void Run()
    {
        while (true)
        {
            await (await UserSelectCard()).definition.Activate(this);
        }
    }

    public int Distance(Square a, Square b)
    {
        (int aX, int aY) = SquareID(a);
        (int bX, int bY) = SquareID(b);
        return Math.Abs(aX - bX) + Math.Abs(aY - bY);
    }

    // Initializes Squares, based on the dimensions.
    private void BuildSquares()
    {
        Squares = new Dictionary<(int, int), Square>();
        for (int x = 0; x < Dimensions.x; x++)
        {
            for (int y = 0; y < Dimensions.y; y++)
            {
                Square s = Instantiate(SquarePrefab, SquarePosition(x, y), Quaternion.identity).GetComponent<Square>();
                Squares.Add((x, y), s);
            }
        }
    }

    private void BuildCards(List<string> cardList)
    {
        cardList.ForEach(n => Cards.Add(Card.Build(n)));
        foreach ( (Card card, int index) in Cards.Select((c, i) => (c,i)))
        {
            float offsetX = index - Cards.Count / 2.0f + 0.5f;
            card.transform.position = new Vector3(offsetX * 2.0f, (float)Math.Pow(Math.Abs(offsetX), 2) * -0.2f - 5.5f, -1 - index);
            card.transform.rotation = Quaternion.Euler(Vector3.back * offsetX * 10);
        }
    }

    public async Task<Square> UserSelectSquare(Func<Square, bool> restriction = null)
    {
        // Get all squares that fit the fiven restriction
        List<Square> ViableSquares = GetSquares(restriction ?? (s => true));

        // Edge Case returns
        if (ViableSquares.Count == 1) return ViableSquares.First();
        if (ViableSquares.Count == 0) return null;

        // A TaskCompletionSource is given to each square. This way, each square can send a result to this task
        TaskCompletionSource<Square> squareSelection = new TaskCompletionSource<Square>();
        ViableSquares.ForEach(s => s.tcs = squareSelection);

        // Highlight viable squares
        ViableSquares.ForEach(s => s.Highlight(true));

        // Wait for the user to click on a square, thus triggering a result
        Square selectedSquare = await squareSelection.Task;

        // Clean up viable squares
        ViableSquares.ForEach(s => s.Highlight(false));
        ViableSquares.ForEach(s => s.tcs = null);

        // Return the selected Square
        return selectedSquare;
    }

    public async Task<Card> UserSelectCard(Func<Card, bool> restriction = null)
    {
        // Get all cards that fit the description
        List<Card> ViableCards = Cards.Where(restriction ?? (e => true)).ToList();

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
