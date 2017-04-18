package model;

public class Doge extends Meme
{

	public Doge(String name)
	{
		super(name + "The Doge");
	}
	public boolean isDank()
	{
		return this.getName().length() > 5;
	}
	public boolean isNormie()
	{
		return !getName().toLowerCase().contains("dank");
	}
	public double getDankness()
	{
		double dankness = 0;
		int indexes = 1;
		for (int index = 0; index < getName().length(); index++)
		{
			dankness += Character.getNumericValue(getName().charAt(index));
			indexes = index + 1;
		}
		if(isDank()&&!isNormie())
		{
			indexes = 1;
		}
		return dankness / indexes;
	}
	public boolean isSpicy()
	{
		return getDankness() > 1000;
	}

}
