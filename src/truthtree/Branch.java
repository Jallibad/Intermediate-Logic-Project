package truthtree;

import java.util.List;
import java.util.stream.Collectors;

import main.Expression;

class Branch implements Tree
{
	private final int index;
	private final List<Tree> branches;
	
	Branch(int index, List<Tree> branches)
	{
		this.index = index;
		this.branches = branches;
	}
	
	@Override
	public int getIndex()
	{
		return index;
	}

	@Override
	public List<Expression> getLines()
	{
		return branches.stream().flatMap(t -> t.getLines().stream()).collect(Collectors.toList());
	}
}