package tests_divers;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class InterfaceGraphique {

	public static void main (String[] args) {
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Test boutons fighter");
		fenetre.setSize(900, 450);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contenu = fenetre.getContentPane();
		contenu.setLayout(new FlowLayout());

		for (int i=1; i<=39; i++) {
			BoutonFighter bouton_fighter = new BoutonFighter(i);
			contenu.add(bouton_fighter);
		}
		
		fenetre.setVisible(true);
		
		
		

	}
}
