using System.Collections.Generic;
using System.Linq;

public class Player
{
    List<Card> Hand, Deck, Yard;

    public Player()
    {
        Hand = new List<Card>();   
        Deck = new List<Card>();   
        Yard = new List<Card>();
    }

    public bool Draw()
    {
        if (Deck.Count == 0) return false;

        Hand.Add(Deck.First());
        Deck.RemoveAt(0);
        return true;
    }
}
