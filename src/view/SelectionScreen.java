package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ButtonsListerner;

public class SelectionScreen extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private int mode;

	public SelectionScreen ()
	{
		super();
		
		setPreferredSize(new Dimension(1100, 600));
		setBackground(new Color(156, 47, 47));
		setLayout(new BorderLayout());
		//
		JLabel title = new JLabel(new ImageIcon("images/selection_screen/title.png"));
		add(title, BorderLayout.NORTH);
		
		//
		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(1100, 275));
		buttonPanel.setOpaque(false);
		add(buttonPanel, BorderLayout.SOUTH);
		
		//
		GridBagLayout buttonLayout = new GridBagLayout();
		buttonPanel.setLayout(buttonLayout);

		GridBagConstraints layout_rules = new GridBagConstraints();
		layout_rules.fill = GridBagConstraints.NONE;
		layout_rules.gridwidth = 1;
		layout_rules.gridheight = 1;
		layout_rules.weightx = 0;
		layout_rules.weighty = 0;
		int x, y;
		
		ButtonFighter fighter = null;
		ButtonsListerner fighters_listener = new ButtonsListerner();
		
		for (int i=1; i<=39; i++)
		{
			fighter = new ButtonFighter(i);
			fighter.addActionListener(fighters_listener);
			
			if (i > 13)
			{
				if (i > 27)
				{
					x = (i - 28); 
					y = 3;
				}
				else
				{
					x = (i - 14);
					y = 2;
				}
			}
			else
			{
				x = i;
				y = 1;
			}
			
			layout_rules.gridx = x;
			layout_rules.gridy = y;
			buttonPanel.add(fighter, layout_rules);
		}
		
		layout_rules.gridx = 12;
		layout_rules.gridy = 3;
		ButtonMode mode = new ButtonMode();
		buttonPanel.add(mode, layout_rules);
		
		System.out.println(title.getSize().width + " : "+ title.getSize().height);
	}
	
	protected void paintComponent (Graphics g)
	{
		try
		{
		BufferedImage image = ImageIO.read(new File("images/fond.jpg"));
		g.drawImage(image, 0, 0, null);
		}
		catch (IOException e)
		{
		e.printStackTrace();
		}
	}
}
