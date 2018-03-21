package main;

@FunctionalInterface
public interface Conversion<A extends LogicSystem, B extends LogicSystem>
{
	B convert(A orig);
}