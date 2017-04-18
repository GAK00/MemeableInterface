package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import controller.MemeController;

public class Panel extends JPanel
{
	private MemeController baseController;
	private JButton button;
	private JTextArea text;
	private SpringLayout layout;

	public Panel(MemeController baseController)
	{
		super();
		this.baseController = baseController;
		this.button = new JButton("Button");
		this.text = new JTextArea();
		text.setEditable(false);
		text.setSize(250,250);
		this.layout = new SpringLayout();
		layout.putConstraint(SpringLayout.SOUTH, button, -10, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.EAST, button, -176, SpringLayout.EAST, this);
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(layout);
		this.add(button);
		this.add(text);
	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				baseController.reset();
				text.setText(baseController.getInfo());
			}
		});
	}

}
