using System;
using System.Collections;
using System.Collections.Generic;
using System.Threading.Tasks;
using UnityEngine;

public class Battlefield : MonoBehaviour
{
    [SerializeField] private Vector2Int Dimensions = Vector2Int.one;
    [SerializeField] private GameObject SquarePrefab, PlayerPrefab;

    public Dictionary<(int, int), Square> Squares;

    private Unit Player;
    private float FieldSize = 1.2f;

    // Getters for math stuff
    private Vector3 SquarePosition(int x, int y) => new Vector3(GetPosition1D(Dimensions.x, x), GetPosition1D(Dimensions.y, y), 0);
    private float GetPosition1D(int n, int i) => (n - 1) * (FieldSize / -2) + FieldSize * i;

    // Build Battlefield
    private void Start()
    {
        // Create Squares
        BuildSquares();

        // Spawn Player
        Player = PlayerPrefab.GetComponent<Unit>().Spawn(this, Squares[(3,3)]);

        // init player square selection task 

        Test();
    }

    private async void Test()
    {
        Square square = await UserSelectSquare();
        Player.GoTo(square);
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
                s.EventHandler["click"] += SelectSquare(s);
            }
        }

    }

    TaskCompletionSource<Square> userSelection;
    private Action SelectSquare(Square square) => delegate
    {
        userSelection.TrySetResult(square);
    };
    public async Task<Square> UserSelectSquare(Func<Square, bool> restriction = null)
    {
        userSelection = new TaskCompletionSource<Square>();
        return await userSelection.Task;
    }
    private IEnumerator ActivateSelection(Predicate<Square> restriction = null)
    {
        Debug.Log("Activating Listeners");
        List<(Square, Action)> listeners = new List<(Square, Action)>();
        foreach (Square square in Squares.Values)
        {
            if (restriction == null || restriction(square))
            {
                Action a = SelectSquare(square);
                square.EventHandler["click"] += a;
                listeners.Add((square, a));
            }
        }
        yield return null;
        Debug.Log("Deactivating Listeners");
        listeners.ForEach((e) => e.Item1.EventHandler["click"] -= e.Item2);
    }
}
