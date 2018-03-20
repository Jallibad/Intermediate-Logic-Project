package main;
// TODO Implement
public class Expression
{
	public String exp;
	public Expression(String exp)
	{
		this.exp = exp;
	}
	
	@Override
	public boolean equals(Object o)
	{
		return (o instanceof Expression) && (exp.equals((Expression) o));
	}
	@Override
	public String toString()
	{
		return exp;
	}
}