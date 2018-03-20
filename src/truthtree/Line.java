package truthtree;

import java.util.List;

import main.Expression;

class Line implements Tree
{
	final int index;
	final Expression exp;
	final Tree next;
	
	public Line(int index, Expression exp, Tree next)
	{
		this.index = index;
		this.exp = exp;
		this.next = next;
	}
	
	@Override
	public int getIndex()
	{
		return index;
	}

	@Override
	public List<Expression> getLines()
	{
		List<Expression> ans = next.getLines();
		ans.add(exp);
		return ans;
	}
}