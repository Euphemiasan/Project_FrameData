package tests_divers;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BoutonFighter extends JButton {
	private int id_fighter;
	
	/*
	 * Pour le moment id_fighter ne sert a rien, mais il permettra
	 * ensuite d'aller chercher l'icone correspondante
	 */
	public BoutonFighter (int id) {
		id_fighter = id;
		
	}
		
	/*
	 * Redifinition de paintComponent pour enlever les bordures
	 * et affecter l'image du fighter
	 */
	protected void paintComponent (Graphics g) {
		super.paintComponent(g);
		setSize(77, 77);
		try {
			String id = String.valueOf(id_fighter);
			if (id_fighter < 10) 
				id = "0"+String.valueOf(id_fighter);
			
			BufferedImage icon = ImageIO.read(new File("images/selection_screen/ficon"+id+".png"));
			setIcon(new ImageIcon(icon));
			setRolloverIcon(new ImageIcon(createRolloverIcon(icon)));
			setPressedIcon(new ImageIcon(createRolloverIcon(icon)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		setContentAreaFilled(false); // Enlève le fond par défaut des JButton
		setFocusPainted(false);
		setBorder(null);
	}
	
	/*
	 * Méthode qui fusionne 2 images en une nouvelle
	 */
	public static BufferedImage createRolloverIcon(BufferedImage image) {
		BufferedImage rolloverIcon = null;
		
		try {
			BufferedImage selection = ImageIO.read(new File("images/selection_screen/character_selection.png"));
			
			int w = Math.max(image.getWidth(), selection.getWidth());
			int h = Math.max(image.getHeight(), selection.getHeight());
			rolloverIcon = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
			
			Graphics g = rolloverIcon.getGraphics();
			g.drawImage(image, 0, 0, null);
			g.drawImage(selection, 0, 0, null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return rolloverIcon;
	}
}
