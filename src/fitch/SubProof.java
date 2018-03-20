package fitch;

import java.util.List;

import main.Expression;

public class SubProof implements Proof
{
	List<Expression> premises;
	List<Proof> lines;
	
	@Override
	public int firstLine()
	{
		return lines.get(lines.size()-1).lastLine();
	}
	
	@Override
	public int lastLine()
	{
		return lines.get(lines.size()-1).lastLine();
	}

	@Override
	public void renumber(int newFirstLine)
	{
		
	}
}