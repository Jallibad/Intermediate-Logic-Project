package main;

import java.util.HashSet;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;

public abstract class LogicSystem
{
	public static void main(String[] args)
	{
		
	}
	
	private static Graph<String, DefaultEdge> allConversions;
	
	public <T extends LogicSystem> T convert(Class<T> clazz)
	{
		Conversion<LogicSystem, T> t = (l -> this);
	}
	
	Set<Class<? extends LogicSystem>> conversions = new HashSet<Class<? extends LogicSystem>>();
	
	public Set<Class<? extends LogicSystem>> conversions()
	{
		
	}
}