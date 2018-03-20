package truthtree;

import java.util.ArrayList;
import java.util.List;

import main.Expression;

class Terminator implements Tree
{
	final TerminatorType type;
	private final int index;
	
	public Terminator(TerminatorType type, int index)
	{
		this.type = type;
		this.index = index;
	}

	@Override
	public int getIndex()
	{
		return index;
	}

	@Override
	public List<Expression> getLines()
	{
		return new ArrayList<Expression>();
	}
}

enum TerminatorType
{
	OPEN,
	CLOSED;
}