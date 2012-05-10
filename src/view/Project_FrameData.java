package view;

import javax.swing.JFrame;

public class Project_FrameData extends JFrame
{
	private static final long serialVersionUID = 1L;

	SelectionScreen screen1;
	public Project_FrameData ()
	{
		super();
		
		setTitle("Project_FrameData");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		screen1 = new SelectionScreen();
		setContentPane(screen1);
		
		/*
		 *  La méthode pack permet de fixer une taille a la JFrame en conservant la
		 *  setPreferredSize de son JPanel
		 */
		pack();
	}	
	
	public static void main (String[] args)
	{
		Project_FrameData main_window = new Project_FrameData();
		main_window.setVisible(true);

		System.out.println(main_window.screen1.getSize().width + " : " + main_window.screen1.getSize().height);
		System.out.println(main_window.getSize().width + " : " + main_window.getSize().height);
	}
}
