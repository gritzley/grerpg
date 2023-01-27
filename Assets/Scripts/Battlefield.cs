using System;
using System.Linq;
using System.Collections.Generic;
using System.Threading.Tasks;
using UnityEngine;

public class Battlefield : MonoBehaviour
{
    [SerializeField] private Vector2Int Dimensions = Vector2Int.one;
    [SerializeField] private GameObject SquarePrefab, UnitPrefab, CardPrefab;

    public Dictionary<(int, int), Square> Squares;
    public (int, int) SquareID(Square square) => Squares.Where(e => e.Value == square).First().Key;
    public List<Square> GetSquares(Func<Square, bool> predicate) => Squares.Values.Where(predicate).ToList();
    private float FieldSize = 1.2f;

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
                s.EventHandler["click"] += SelectSquare(s);
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

    TaskCompletionSource<Square> squareSelection;
    Func<Square, bool> squareSelectionRestriction = s => true;
    private Action SelectSquare(Square square) => delegate
    {
        if (!squareSelectionRestriction(square)) return;
        GetSquares(squareSelectionRestriction).ForEach(s => s.Highlight(false));
        squareSelection?.TrySetResult(square);
    };
    public async Task<Square> UserSelectSquare(Func<Square, bool> restriction = null)
    {
        squareSelectionRestriction = restriction != null ? restriction : s => true;
        List<Square> ViableSquares = GetSquares(squareSelectionRestriction);
        if (ViableSquares.Count > 1)
        {
            ViableSquares.ForEach(s => s.Highlight(true));
            squareSelection = new TaskCompletionSource<Square>();
            return await squareSelection.Task;
        }
        else return ViableSquares.First();
    }
}
