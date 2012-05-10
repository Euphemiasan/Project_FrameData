package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
	
	private BufferedImage background;

	public SelectionScreen ()
	{
		super();
		
		setPreferredSize(new Dimension(1100, 700));
		setLayout(new BorderLayout());
		
		// Background
		try
		{
			int background_nb = (int) (1 + Math.random() * (3 - 1 + 1));

			background = ImageIO.read(new File("images/background/"+background_nb+".jpg"));
		}
		catch (IOException ioe)
		{
			System.out.println("Display Background Problem");
			ioe.printStackTrace();
		}
		
		// Title
		JLabel title = new JLabel(new ImageIcon("images/selection_screen/title.png"));
		add(title, BorderLayout.NORTH);
		
		// Buttons Panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(1100, 275));
		buttonPanel.setOpaque(false);
		add(buttonPanel, BorderLayout.SOUTH);
		
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
		
		// Algorithme de positionnement des boutons
		for (int i=1; i<=39; i++)
		{
			fighter = new ButtonFighter(i);
			fighter.addActionListener(fighters_listener);
			
			// Si l'id est > 13 on g�re la 2e ou 3e ligne [..1]
			if (i > 13)
			{
				// Si l'id est > 27 on est sur la 3e ligne [..2]
				if (i > 27)
				{
					x = (i - 28); 
					y = 3;
				}
				// [2..] Sinon on est sur la 2e ligne
				else
				{
					x = (i - 14);
					y = 2;
				}
			}
			// [1..] Sinon on place les boutons avec une indentation de 1 (i commence � 1)
			else
			{
				x = i;
				y = 1;
			}
			
			layout_rules.gridx = x;
			layout_rules.gridy = y;
			buttonPanel.add(fighter, layout_rules);
		}
		
		// Bouton mode qui permet de choisir entre le mode MoveList et FrameData
		layout_rules.gridx = 12;
		layout_rules.gridy = 3;
		ButtonMode mode = new ButtonMode();
		buttonPanel.add(mode, layout_rules);
	}
	
	protected void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		g.drawImage(background, 0, 0, null);
	}
}