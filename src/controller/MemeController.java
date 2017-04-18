package controller;

import java.util.ArrayList;

import model.ComputerizedMeme;
import model.Doge;
import model.Memeable;
import view.Frame;

public class MemeController
{
	private ArrayList<Memeable> memes;

	public MemeController()
	{
		memes = new ArrayList<Memeable>();
		setupList();
		Frame myFrame = new Frame(this);
	}

	private void setupList()
	{
		memes.add(new ComputerizedMeme());
		memes.add(new Doge(memes.get(0).getName()));
	}

	public String getInfo()
	{
		String info = "";
		for (Memeable meme : memes)
		{
			info += "Meme: " + meme.getName();
			info += "\nIsDank: " + meme.isDank();
			info += "\nIsNormie: " + meme.isNormie();
			info += "\nDankLevel: " + meme.getDankness();
			info += "\nDis Me Me Spicy Dough: " + meme.isSpicy();
			info += "\nDo it be A doge: " + (meme instanceof Doge) +"\n\n";
		}
		return info;
	}
	public void reset()
	{
		memes.set(0,new ComputerizedMeme());
		memes.set(1,new Doge(memes.get(0).getName()));
	}
}
