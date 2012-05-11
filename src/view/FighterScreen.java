package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class FighterScreen extends JPanel
{

	public FighterScreen ()
	{
		super();
		
		setPreferredSize(new Dimension(1100, 700));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(Color.BLACK);
		
		// LeftPanel
		JPanel leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(300, 700));
		leftPanel.setLayout(null);
		leftPanel.setBackground(Color.RED);
		add(leftPanel);


		JPanel button1 = new JPanel();
		button1.setBounds(0, 0, 150, 100);
		button1.setBackground(Color.YELLOW);
		leftPanel.add(button1);

		JPanel button2 = new JPanel();
		button2.setBounds(150, 0, 150, 100);
		button2.setBackground(Color.BLUE);
		leftPanel.add(button2);
		
		JPanel name = new JPanel();
		name.setBounds(0, 100, 300, 150);
		name.setBackground(Color.WHITE);
		leftPanel.add(name);
		
		JPanel button_back = new JPanel();
		button_back.setBounds(0, 650, 50, 50);
		button_back.setBackground(Color.GRAY);
		leftPanel.add(button_back);
		
	}
}
