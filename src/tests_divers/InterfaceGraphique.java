package tests_divers;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InterfaceGraphique {

	public static void main (String[] args) {
		/*
		 * Avant de commencer, je n'ai pas mis en place de layout donc le JLabel sera toute la 
		 * fenêtre pour voir l'effet de sélection sera visible quand tu passes ta souris dans la
		 * JFrame et quand t'en ressorts
		 */
		JFrame fenetre = new JFrame();
		
		fenetre.setBounds(50, 100, 100, 100);
		fenetre.setTitle("Super Street Fighter IV : Arcade Edition - Frame Data");
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Création du "bouton" pour Sakura
		final JLabel bouton_sakura = new JLabel();
		bouton_sakura.setIcon(new ImageIcon("images/icon_sakura.png"));
		
		// Ajout de Listerer sur le Label
		bouton_sakura.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
			}
			
			public void mousePressed(MouseEvent e) {
				System.out.println("Clic");
			}

			// Quand on sort de la zone du bouton, l'image d'origine revient
			public void mouseExited(MouseEvent e) {
				bouton_sakura.setIcon(new ImageIcon("images/icon_sakura.png"));
			}
			
			/*
			 * Quand on rentre dans la zone du bouton, on prend l'image de sakura (ici en
			 * brute mais je vais faire ça dynamiquement) et on la fusionne avec l'image 
			 * "character_selection"
			 */
			public void mouseEntered(MouseEvent e) {
				try {
					BufferedImage image = ImageIO.read(new File("images/icon_sakura.png"));
					BufferedImage overlay = ImageIO.read(new File("images/character_selection.png"));
					
					int w = Math.max(image.getWidth(), overlay.getWidth());
					int h = Math.max(image.getHeight(), overlay.getHeight());
					BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
					
					Graphics g = combined.getGraphics();
					g.drawImage(image, 0, 0, null);
					g.drawImage(overlay, 0, 0, null);
					bouton_sakura.setIcon(new ImageIcon(combined));
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		fenetre.add(bouton_sakura);
		
		fenetre.setVisible(true);
		fenetre.repaint();
	}
}
