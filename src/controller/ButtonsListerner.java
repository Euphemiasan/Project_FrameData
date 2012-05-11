package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import others.Request;
import view.ButtonMode;

public class ButtonsListerner implements ActionListener
{	
	private ButtonMode mode;
	//private Request r = new Request();
	
	public ButtonsListerner (ButtonMode bm)
	{
		mode = bm;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		//r.showChar(ae.getActionCommand());
		//r.showMove(ae.getActionCommand());
		
		System.out.println("MODE : " + mode.getMode() + " | ID : " + ae.getActionCommand());
	}
	
}
