package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * Classe principale du projet FrameData
 * 
 * @author Joseph Nguyen
 * @author Aurélien Michalinko
 *
 */
public class Project_FrameData extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	private int screen;
	
	private SelectionScreen screen0;
	private FighterScreen screen1;
	
	public Project_FrameData ()
	{
		super();
		
		screen = 0;
		
		setTitle("Project FrameData");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setScreen(screen, 0);
		
		// Positionne la fenêtre au milieu de l'écran
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int width = getSize().width;
		int height = getSize().height;
		int x = (dimension.width - width) / 2;
		int y = (dimension.height - height) / 2;
		setLocation(x, y);
	}
	
	// Méthode qui jongle entre tous les écrans
	public void setScreen (int screen_selected, int fighter_id)
	{
		if (screen_selected == 0)
		{
			screen0 = new SelectionScreen(this);
			screen1 = null;
			//vider screen2 quand il sera crée
			setContentPane(screen0);
		}
		else if (screen_selected == 1)
		{
			screen0 = null;
			screen1 = new FighterScreen(fighter_id);
			//vider screen2 quand il sera crée
			setContentPane(screen1);
		}
		else
		{
			// A remplir quand screen2 sera crée
			System.out.println("Input mode non disponible pour le moment");
		}

		// La méthode pack permet de fixer une taille a la JFrame en conservant PreferredSize de son JPanel
		pack();
	}
	
	public static void main (String[] args)
	{
		Project_FrameData main_window = new Project_FrameData();
		main_window.setVisible(true);
	}
	
	public void oktest ()
	{
		System.out.println("ok");
	}
}
