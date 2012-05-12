package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BackgroundPanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	private BufferedImage background;

	public BackgroundPanel (String url)
	{
		
		super ();
		
		try
		{
			background = ImageIO.read(new File(url));
		}
		catch (IOException ioe)
		{
			System.out.println("Display BackgroundPanel Problem");
			setOpaque(false);
		}
	
	}
	
	protected void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		g.drawImage(background, 0, 0, null);
	}
}
