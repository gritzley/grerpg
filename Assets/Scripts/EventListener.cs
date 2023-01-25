using System;
using System.Collections.Generic;
public class SimpleEventHandler
{
    public class SimpleEventListener
    {
        public List<Action> Actions;
        public SimpleEventListener()
        {
            Actions = new List<Action>();
        }
        public void Call() => Actions.ForEach(e => e());
        public static SimpleEventListener operator +(SimpleEventListener l, Action a)
        {
            l.Actions.Add(a);
            return l;
        }
        public static SimpleEventListener operator -(SimpleEventListener l, Action a)
        {
            l.Actions.RemoveAll(e => e.Method == a.Method);
            return l;
        }
    }
    private Dictionary<string, SimpleEventListener> listeners;
    public SimpleEventHandler()
    {
        listeners = new Dictionary<string, SimpleEventListener>();
    }
    public SimpleEventListener this[string eventName]
    {
        get
        {
            if (!listeners.ContainsKey(eventName)) listeners.Add(eventName, new SimpleEventListener());
            return listeners[eventName];
        }
        set
        {
            if (!listeners.ContainsKey(eventName)) listeners.Add(eventName, new SimpleEventListener());
            listeners[eventName] = value;
        }
    }
    public void Call(string eventName)
    {
        if (!listeners.ContainsKey(eventName)) return;
        listeners[eventName].Call();
    }
}
