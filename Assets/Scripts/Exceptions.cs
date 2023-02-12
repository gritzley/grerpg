using System;

public class NoSpellDefinitionException : Exception
{
    public NoSpellDefinitionException(string name) : base($"There is no definition for a spell called {name}.") { }
}
public class NoUnitDefinition : Exception
{
    public NoUnitDefinition(string name) : base($"There is no definition for a unit called {name}.") { }
}

public class ActionIsNotDefinedException : Exception { }
public class UnreachableCodeException : Exception { }