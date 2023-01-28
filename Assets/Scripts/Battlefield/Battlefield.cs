using System;
using System.Linq;
using System.Collections.Generic;
using System.Threading.Tasks;
using UnityEngine;

public class Battlefield : MonoBehaviour
{
    [SerializeField] private Vector2Int Dimensions = Vector2Int.one;
    [SerializeField] private GameObject SquarePrefab, UnitPrefab;
    private float FieldSize = 1.2f;
    
    // Fields for Squares
    public Dictionary<(int, int), Square> Squares;
    public (int, int) SquareID(Square square) => Squares.Where(e => e.Value == square).First().Key;
    public List<Square> GetSquares(Func<Square, bool> predicate) => Squares.Values.Where(predicate).ToList();

    // Getters for math stuff
    private Vector3 SquarePosition(int x, int y) => new Vector3(GetPosition1D(Dimensions.x, x), GetPosition1D(Dimensions.y, y), 0);
    private float GetPosition1D(int n, int i) => (n - 1) * (FieldSize / -2) + FieldSize * i;

    private void Awake()
    {
        BuildSquares();
        Instantiate(UnitPrefab).GetComponent<Unit>().GoTo(Squares[(3, 3)]);
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
}
