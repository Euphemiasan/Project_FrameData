package others;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import controller.ButtonsListerner;

import view.ButtonFighter;

public class InterfaceGraphique
{

	public static void main (String[] args) throws Exception
	{
		JFrame fenetre = new JFrame();
		fenetre.setTitle("Test boutons fighter");
		fenetre.setSize(1200, 450);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contenu = fenetre.getContentPane();
		contenu.setBackground(new Color(156, 47, 47));
		contenu.setLayout(new FlowLayout());
		
		ButtonsListerner bouton_listener = new ButtonsListerner();
		
		for (int i=1; i<=39; i++)
		{
			ButtonFighter bouton_fighter = new ButtonFighter(i);
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
