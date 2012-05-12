package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Request;

import view.ButtonMode;
import view.Project_FrameData;

//TODO A enlever plus tard
@SuppressWarnings("unused")
public class ButtonsListerner implements ActionListener
{	
	private ButtonMode mode;
	private Project_FrameData mainJFrame;
	//private Request r = new Request();
	
	public ButtonsListerner (Project_FrameData jframe, ButtonMode button_mode)
	{
		mode = button_mode;
		mainJFrame = jframe;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		//r.showChar(ae.getActionCommand());
		//r.showMove(ae.getActionCommand());
		//Fighter current = r.returnFighter(ae.getActionCommand());
		//System.out.println("--"+current.getFighter_id()+" "+current.getFighter_name()+"--");
		int screen_nb, fighter_id;
		if (ae.getActionCommand().equals("back"))
		{
			screen_nb = 0;
			fighter_id = 0;
		}
		else 
		{
			screen_nb = mode.getMode();
			fighter_id = Integer.parseInt(ae.getActionCommand());
		}
		
		mainJFrame.setScreen(screen_nb, fighter_id);
	}
	
}
