package model;

public class ComputerizedMeme extends Meme
{
	public ComputerizedMeme()
	{
		super("");
		this.setName(calculateName());
	}

	private String calculateName()
	{
		String[] elements = new String[] { "Super ", "Dank ", "Sanik ", "Me-Me ", "Doge ", "Pepe ", "The ", "Destory ", "Spicy ", "Normie ", "Over 9000 ", "All ", "Double ", "But ", "? " };
		String randName = "";
		int rand = (int) (Math.random() * 31) + 5;
		for (int index = 0; index < rand; index++)
		{
			randName += elements[(int) (Math.random() * elements.length)];
		}
		return randName;
	}

	public boolean isDank()
	{
		return this.getName().length() > (int)(Math.random() * 20);
	}
	public boolean isNormie()
	{
		return !isDank();
	}

	public double getDankness()
	{
		return (int)(Math.random()*this.getName().length());
	}

	public boolean isSpicy()
	{
		return isDank()&&getDankness()>(this.getName().length()/5);
	}
}
