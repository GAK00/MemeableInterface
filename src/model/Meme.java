package model;

public abstract class Meme implements Memeable
{
	private String name;

	public Meme(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
