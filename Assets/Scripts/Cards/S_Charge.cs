using System.Threading.Tasks;

public class S_Charge : Spell
{
    public override async Task<bool> Cast(Battlefield b)
    {
        return await GRE.MoveAUnit(b, 3);
    }
}
