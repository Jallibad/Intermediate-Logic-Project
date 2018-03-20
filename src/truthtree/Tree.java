package truthtree;

import java.util.ArrayList;
import java.util.List;

import main.Expression;

public interface Tree
{
	public static void main(String[] args)
	{
		Tree test1 = new Line(1, new Expression("AND A B"), new Terminator(TerminatorType.CLOSED, 1));
		Tree test2 = new Line(2, new Expression("OR A B"), new Terminator(TerminatorType.CLOSED, 1));
		List<Tree> stuff = new ArrayList<Tree>();
		stuff.add(test1);
		stuff.add(test2);
		Tree test3 = new Branch(0, stuff);
		System.out.println(test3.getLines());
	}
	
	public int getIndex();
	public List<Expression> getLines();
}