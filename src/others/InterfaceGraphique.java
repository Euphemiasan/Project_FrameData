package others;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class InterfaceGraphique
{

	public static void main (String[] args) throws Exception
	{
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Test boutons fighter");
		fenetre.setSize(1100, 450);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contenu = fenetre.getContentPane();
		contenu.setBackground(new Color(156, 47, 47));
		contenu.setLayout(new FlowLayout());
		
		BoutonsListerner bouton_listener = new BoutonsListerner();
		
		for (int i=1; i<=39; i++)
		{
			BoutonFighter bouton_fighter = new BoutonFighter(i);
			bouton_fighter.addActionListener(bouton_listener);
			contenu.add(bouton_fighter);
		}
		
		//*
		CreateBase cb = new CreateBase();

		cb.create();
		cb.insert();
		//*/
//		cb.close();
		
		fenetre.setVisible(true);
		
	}
}
