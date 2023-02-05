using System;
using System.Linq;
using System.Collections.Generic;
using System.Threading.Tasks;
using UnityEngine;

public class Battlefield : MonoBehaviour
{
    public GameObject SquarePrefab, UnitPrefab;
    public (int, int) SquareID(Square square) => Squares.Where(e => e.Value == square).First().Key;
    public List<Square> GetSquares(Func<Square, bool> predicate) => Squares.Values.Where(predicate).ToList();
    public int GetDistance(Square a, Square b)
    {
        (int aX, int aY) = SquareID(a);
        (int bX, int bY) = SquareID(b);
        return Math.Abs(aX - bX) + Math.Abs(aY - bY);
    }
    public Square[] GetAdjacentSquares(Square s)
    {
        (int x, int y) = SquareID(s);
        return new Square[] { Squares[(x, y + 1)], Squares[(x + 1, y)], Squares[(x, y - 1)], Squares[(x - 1, y)] };
    }
    public async Task<Square> GetUserSelectedSquare(Func<Square, bool> restriction = null)
    {
        // Get all squares that fit the fiven restriction
        List<Square> ViableSquares = GetSquares(restriction ?? (s => true));

        // Edge Case returns
        if (ViableSquares.Count == 1) return ViableSquares.First();
        if (ViableSquares.Count == 0) throw new NoValidSquareSelectionException();

        // A TaskCompletionSource is given to each square. This way, each square can send a result to this task
        TaskCompletionSource<Square> tcs = new TaskCompletionSource<Square>();
        Queue<Action> OnMouseDownActions = new Queue<Action>();
        foreach (Square square in ViableSquares)
        {
            OnMouseDownActions.Enqueue(() => tcs.TrySetResult(square));
            square.MouseEventHandler.OnMouseDownEvent += OnMouseDownActions.Last();
            square.Highlight(true);
        }

        // Wait for the user to click on a square, thus triggering a result
        Square selectedSquare = await tcs.Task;

        // Clean up viable squares
        foreach (Square square in ViableSquares)
        {
            square.MouseEventHandler.OnMouseDownEvent -= OnMouseDownActions.Dequeue();
            square.Highlight(false);
        }

        // Return the selected Square
        return selectedSquare;
    }

    [SerializeField] private Vector2Int Dimensions = Vector2Int.one;
    private float FieldSize = 1.2f;
    private Dictionary<(int, int), Square> Squares;
    private Vector3 SquarePosition(int x, int y) => new Vector3(GetPosition1D(Dimensions.x, x), GetPosition1D(Dimensions.y, y), 0);
    private float GetPosition1D(int n, int i) => (n - 1) * (FieldSize / -2) + FieldSize * i;

    private void Awake()
    {
        BuildSquares();
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
}

public class NoValidSquareSelectionException : Exception { }