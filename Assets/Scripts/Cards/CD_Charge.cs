using System.Threading.Tasks;

public class CD_Charge : CardDefinition
{
    public override async Task<bool> Activate(Battlefield b)
    {
        battlefield = b;
        return await MoveAUnit(3);
    }
}
