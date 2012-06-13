package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.ButtonMode;
import view.Project_FrameData;

public class ButtonsListerner implements ActionListener
{
	private ButtonMode mode;
	private Project_FrameData mainJFrame;
	
	public ButtonsListerner (Project_FrameData jframe, ButtonMode button_mode)
	{
		mode = button_mode;
		mainJFrame = jframe;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int fighter_id;
		int screen_nb;
		
		if (ae.getActionCommand().equals("back"))
		{
			fighter_id = -1;
			screen_nb = 0;
		}
		else
		{
			fighter_id = Integer.parseInt(ae.getActionCommand());
			screen_nb = mode.getMode();
		}

		mainJFrame.setFighter(fighter_id);
		mainJFrame.setScreen(screen_nb);
	}
	
}
