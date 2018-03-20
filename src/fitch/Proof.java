package fitch;

public interface Proof
{
	public abstract int firstLine();
	public abstract int lastLine();
	public abstract void renumber(int newFirstLine);
}