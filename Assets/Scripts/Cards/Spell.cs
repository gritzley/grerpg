using System;
using System.Threading.Tasks;

public abstract class Spell
{
    public static Spell CreateInstance(string name)
    {
        Type T = Type.GetType("S_" + name);
        if (T == null || !typeof(Spell).IsAssignableFrom(T)) throw new Exception($"There is no spell called {name}.");

        return (Spell)Activator.CreateInstance(T);
    }
    public abstract Task<bool> Cast(Battlefield b);
}
