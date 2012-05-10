package view;

import javax.swing.JFrame;

public class Project_FrameData extends JFrame
{
	private static final long serialVersionUID = 1L;

	public Project_FrameData ()
	{
		super();
		
		setTitle("Project_FrameData");
		setSize(1100, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SelectionScreen screen1 = new SelectionScreen();
		setContentPane(screen1);
	}	
	
	public static void main (String[] args)
	{
		Project_FrameData main_window = new Project_FrameData();
		
		main_window.setVisible(true);
	}
}
