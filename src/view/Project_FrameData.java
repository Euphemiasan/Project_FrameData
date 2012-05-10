package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * Classe principale du projet FrameData
 * 
 * @author Joseph Nguyen
 * @author Aur�lien Michalinko
 *
 */
public class Project_FrameData extends JFrame
{
	private static final long serialVersionUID = 1L;

	SelectionScreen screen1;
	
	public Project_FrameData ()
	{
		super();
		
		setTitle("Project FrameData");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		screen1 = new SelectionScreen();
		setContentPane(screen1);
		
		// La m�thode pack permet de fixer une taille a la JFrame en conservant PreferredSize de son JPanel
		pack();

		// Positionne la fen�tre au milieu de l'�cran
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int width = getSize().width;
		int height = getSize().height;
		int x = (dimension.width - width) / 2;
		int y = (dimension.height - height) / 2;
		setLocation(x, y);
	}	
	
	public static void main (String[] args)
	{
		Project_FrameData main_window = new Project_FrameData();
		main_window.setVisible(true);
	}
}
