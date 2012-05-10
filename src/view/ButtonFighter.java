package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonFighter extends JButton
{
	private static final long serialVersionUID = 1L;
	
	private int id_fighter;
	
	public ButtonFighter (int id)
	{
		id_fighter = id;
		setActionCommand(String.valueOf(id_fighter));
		
		try
		{
			BufferedImage icon = ImageIO.read(new File("images/selection_screen/ficon"+id+".png"));
			BufferedImage icon_rollover = createRolloverIcon(icon);
			
			setIcon(new ImageIcon(icon));
			setRolloverIcon(new ImageIcon(icon_rollover));
		}
		catch (IOException ioe)
		{
			System.out.println("Display Icon Problem");
			ioe.printStackTrace();
		}
	}
		
	// Redifinition de paintComponent pour enlever les propriétés basiques du JButton
	protected void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		setSize(75, 75);
		setContentAreaFilled(false); // Enlève le fond par défaut des JButton
		setFocusPainted(false); // Enlève le cadre qui s'affiche une fois qu'on clique dessus
		setBorder(null); // Enlève les bordures du bouton et son effet du survol
	}
	
	// Méthode qui fusionne 2 images en une nouvelle
	public static BufferedImage createRolloverIcon(BufferedImage icon)
	{
		BufferedImage icon_rollover = null;
		
		try
		{
			BufferedImage selection = ImageIO.read(new File("images/selection_screen/character_selection.png"));
			
			int w = Math.max(icon.getWidth(), selection.getWidth());
			int h = Math.max(icon.getHeight(), selection.getHeight());
			icon_rollover = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
			
			Graphics g = icon_rollover.getGraphics();
			g.drawImage(icon, 0, 0, null);
			g.drawImage(selection, 0, 0, null);
			
		}
		catch (IOException ioe)
		{
			System.out.println("Display Icon Problem");
			ioe.printStackTrace();
		}
		
		return icon_rollover;
	}
}
