package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class DescriptionPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private BufferedImage background;
	
	public DescriptionPanel () 
	{
		super();
		
		setPreferredSize(new Dimension(800, 697));
		
		try
		{
			background = ImageIO.read(new File("images/description_screen/no.jpg"));
		}
		catch (IOException ioe)
		{
			System.out.println("Display DescriptionPanel Problem");
			ioe.printStackTrace();
		}
		
		// Date de naissance
		// Pays d'origine
		// Taille
		// Poid
		// Style de combat
		// Liste des apparitions dans les différents jeux
	}
	
	protected void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		g.drawImage(background, 0, 0, null);
	}
}
