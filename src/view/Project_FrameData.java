package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import model.Fighter;
import model.Request;

/**
 * Classe principale du projet FrameData
 * 
 * @author Joseph Nguyen
 * @author Aurélien Michalinko
 */
public class Project_FrameData extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private Fighter fighter;
	
	private Request r;
	
	private SelectionScreen screen0;
	private FighterScreen screen1;
	private InputScreen screen2;
	
	public Project_FrameData ()
	{
		super();
		
		setTitle("Project FrameData");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//On ne créer qu'une seule fois l'écran de sélection
		screen0 = new SelectionScreen(this);
		setScreen(0);
		
		// Positionne la fenêtre au milieu de l'écran
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int width = getSize().width;
		int height = getSize().height;
		int x = (dimension.width - width) / 2;
		int y = (dimension.height - height) / 2;
		setLocation(x, y);
		
		// Connexion a la base de donnée
		r = new Request();
	}
	
	// Méthode qui jongle entre tous les écrans
	public void setScreen (int screen_selected)
	{
		if (screen_selected == 0)
		{
			screen1 = null;
			screen2 = null;
			
			screen0.setBackgound();
			
			setContentPane(screen0);
		}
		else if (screen_selected == 1)
		{
			screen2 = null;
			
			screen1 = new FighterScreen(this, fighter);
			
			setContentPane(screen1);
		}
		else
		{
			screen1 = null;

			System.out.println("Input mode non disponible pour le moment");
		}

		// La méthode pack permet de fixer une taille a la JFrame en conservant PreferredSize de son JPanel
		pack();
	}
	
	public void setFighter (int fighter_id)
	{
		if (fighter_id != -1)
			fighter = r.returnFighter(fighter_id);
		else
			fighter = null;
	}
	
	public static void main (String[] args)
	{
		Project_FrameData main_window = new Project_FrameData();
		main_window.setVisible(true);
	}
}
