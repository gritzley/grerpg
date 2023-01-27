using System;
using System.Linq;
using System.Collections.Generic;
using System.Threading.Tasks;
using UnityEngine;

public class Battlefield : MonoBehaviour
{
    [SerializeField] private Vector2Int Dimensions = Vector2Int.one;
    [SerializeField] private GameObject SquarePrefab, UnitPrefab, CardPrefab;

    private float FieldSize = 1.2f;
    
    public Dictionary<(int, int), Square> Squares;
    public (int, int) SquareID(Square square) => Squares.Where(e => e.Value == square).First().Key;
    public List<Square> GetSquares(Func<Square, bool> predicate) => Squares.Values.Where(predicate).ToList();
    // Getters for math stuff
    private Vector3 SquarePosition(int x, int y) => new Vector3(GetPosition1D(Dimensions.x, x), GetPosition1D(Dimensions.y, y), 0);
    private float GetPosition1D(int n, int i) => (n - 1) * (FieldSize / -2) + FieldSize * i;

    // Build Battlefield
    private void Start()
    {
        // Create Squares
        BuildSquares();

        Instantiate(UnitPrefab).GetComponent<Unit>().GoTo(Squares[(3, 3)]);

        BuildCards();
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

    private void BuildCards()
    {
        BuildCard<A_Charge>(new Vector3(0, -5.5f, -1), Quaternion.identity).Name = "Charge";
    }

    private Card BuildCard<T>(Vector3 position, Quaternion rotation) where T : Ability
    {
        GameObject go = Instantiate(CardPrefab, position, rotation);
        T ability = go.AddComponent<T>();
        ability.Battlefield = this;
        return go.GetComponent<Card>();
    }

    public async Task<Square> UserSelectSquare(Func<Square, bool> restriction = null)
    {
        // Get all squares that fit the fiven restriction
        List<Square> ViableSquares = GetSquares(restriction ?? (s => true));

        // If there is exactly one square that fits teh restriction, return it
        if (ViableSquares.Count == 1) return ViableSquares.First();

        // A TaskCompletionSource is given to each square. This way, each square can send a result to this task
        TaskCompletionSource<Square> squareSelection = new TaskCompletionSource<Square>();

        // Highlight viable squares and et the TaskCompletionSource
        ViableSquares.ForEach(s => s.Highlight(true));
        ViableSquares.ForEach(s => s.tcs = squareSelection);

        // Wait for the user to click on a square, thus triggering a result
        Square selectedSquare = await squareSelection.Task;

        // Clean up viable squares
        ViableSquares.ForEach(s => s.Highlight(false));
        ViableSquares.ForEach(s => s.tcs = null);

        // Return the selected Square
        return selectedSquare;
    }
}
