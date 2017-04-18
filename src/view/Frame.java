package view;

import javax.swing.JFrame;

import controller.MemeController;

public class Frame extends JFrame
{
	private MemeController baseController;

	public Frame(MemeController baseController)
	{
		super();
		this.baseController = baseController;
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setTitle("Memes");
		this.setSize(500,500);
		this.setContentPane(new Panel(baseController));
		this.setVisible(true);
	}
}
