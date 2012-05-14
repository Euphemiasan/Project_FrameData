package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import model.Move;
import model.Request;
import model.Fighter;

import view.ButtonMode;
import view.Project_FrameData;

//TODO A enlever plus tard
@SuppressWarnings("unused")
public class ButtonsListerner implements ActionListener
{	
	private ButtonMode mode;
	private Project_FrameData mainJFrame;
	private Request r = new Request();
	
	public ButtonsListerner (Project_FrameData jframe, ButtonMode button_mode)
	{
		mode = button_mode;
		mainJFrame = jframe;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		//r.showChar(ae.getActionCommand());
		//r.showMove(ae.getActionCommand());
		
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
			
			Fighter current = r.returnFighter(ae.getActionCommand());
			System.out.println("--"+current.getFighter_id()+" "+current.getFighter_name()+"--");
			ArrayList<Move> test = r.returnMoveList(current.getFighter_id());
			Iterator<Move> i = test.iterator();
			Move current_move;
			while (i.hasNext())
			{
				current_move = i.next();
				System.out.println(current_move.getName() + " : " + current_move.getInput());
			}
		//	current.addMoves(r.returnMoveList(current.getFighter_id()));
		//	current.showAllMove();
		}
		
		mainJFrame.setScreen(screen_nb, fighter_id);
	}
	
}
