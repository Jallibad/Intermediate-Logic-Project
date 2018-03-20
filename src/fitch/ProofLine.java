package fitch;

import main.Expression;

public class ProofLine implements Proof
{
	int line;
	Expression exp;
	InferenceRule justification;
	List<>

	@Override
	public int firstLine()
	{
		return line;
	}
	@Override
	public int lastLine()
	{
		return line;
	}

	@Override
	public void renumber(int newFirstLine)
	{
		line = newFirstLine;
		// TODO renumber steps
	}
}