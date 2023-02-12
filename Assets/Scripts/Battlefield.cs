using System;
using System.Linq;
using System.Collections.Generic;
using System.Threading.Tasks;
using UnityEngine;

public class Battlefield : MonoBehaviour
{
    public GameObject SquarePrefab, UnitPrefab;
    public (int, int) SquareID(Square square) => _squares.Where(e => e.Value == square).First().Key;
    public List<Square> GetSquares(Func<Square, bool> predicate = null) => _squares.Values.Where(predicate ?? (s => true)).ToList();
    public List<Unit> Units;
    public int GetDistance(Square a, Square b)
    {
        (int aX, int aY) = SquareID(a);
        (int bX, int bY) = SquareID(b);
        return Math.Abs(aX - bX) + Math.Abs(aY - bY);
    }
    public List<Square> GetSquaresInDirection(Square startSquare, Vector3 direction, int maxDistance = 1000)
    {
        (int x, int y) = SquareID(startSquare);

        List<Square> result = new List<Square>();
        Square nextSquare;
        int i = 1;
        while (_squares.TryGetValue((x + (int)direction.x * i, y + (int)direction.y * i), out nextSquare) && i++ <= maxDistance) { result.Add(nextSquare); }
        return result;
    }
    public async Task<Square> GetUserSelectedSquare(Func<Square, bool> restriction = null)
    {
        // Get all squares that fit the fiven restriction
        List<Square> ViableSquares = GetSquares(restriction);

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

    [SerializeField] private Vector2Int _dimensions = Vector2Int.one;
    private float _fieldSize = 1.2f;
    private Dictionary<(int, int), Square> _squares;
    private Vector3 SquarePosition(int x, int y) => new Vector3(GetPosition1D(_dimensions.x, x), GetPosition1D(_dimensions.y, y), 0);
    private float GetPosition1D(int n, int i) => (n - 1) * (_fieldSize / -2) + _fieldSize * i;

    private void Awake()
    {
        BuildSquares();
    }

    // Initializes Squares, based on the dimensions.
    private void BuildSquares()
    {
        _squares = new Dictionary<(int, int), Square>();
        for (int x = 0; x < _dimensions.x; x++)
        {
            for (int y = 0; y < _dimensions.y; y++)
            {
                Square s = Instantiate(SquarePrefab, SquarePosition(x, y), Quaternion.identity).GetComponent<Square>();
                _squares.Add((x, y), s);
            }
        }
    }
}
public class NoValidSquareSelectionException : Exception { }