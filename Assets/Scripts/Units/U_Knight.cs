using System.Collections.Generic;
class U_Knight : Unit
{
    private void Start()
    {
        Behavior += Block_1;
    }

    private void Block_1(Battlefield b)
    {
        GoTo(b.GetAdjacentSquares(Square)[0]);
    }
}
