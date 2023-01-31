using System.Threading.Tasks;

public class S_Knight : Spell
{
    public override async Task<bool> Cast(Battlefield b)
    {
        await GRE.SpawnUnit(b, "Knight");
        return true;
    }
}
