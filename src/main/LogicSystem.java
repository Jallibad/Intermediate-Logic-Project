package main;

import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import fitch.FitchProof;
import javafx.scene.layout.Pane;
import truthtree.TruthTree;

public abstract class LogicSystem
{
	protected static Set<Class<? extends LogicSystem>> classes = new HashSet<Class<? extends LogicSystem>>();
	static
	{
		classes.add(TruthTree.class);
		classes.add(FitchProof.class);
	}
	
	//private static Graph<Class<LogicSystem>, Conversion<LogicSystem, ? extends LogicSystem>> allConversions;
	private static Map<Class<LogicSystem>, Conversion<LogicSystem, LogicSystem>> allConversions;
	
	public abstract String name();
	
	public <T extends LogicSystem> Optional<T> convert(Class<T> clazz)
	{
		//Conversion<LogicSystem, T> t = ;
		//ShortestPathAlgorithm<Class<LogicSystem>, Conversion<LogicSystem, ? extends LogicSystem>> t;
		//t.getPath(this.getClass(), clazz);
		
		return Optional.empty();
	}
	
	Set<Class<? extends LogicSystem>> conversions = new HashSet<Class<? extends LogicSystem>>();
	
	public Set<Class<? extends LogicSystem>> conversions()
	{
		return null;
	}
	
	public abstract Pane display();
}