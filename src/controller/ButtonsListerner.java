package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import others.Request;

public class ButtonsListerner implements ActionListener
{	
	Request r = new Request();
	
	public void actionPerformed(ActionEvent ae)
	{
		r.showChar(ae.getActionCommand());
		r.showMove(ae.getActionCommand());
	}
	
}
