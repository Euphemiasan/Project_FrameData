package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import view.ButtonFighter;

public class NameListener implements MouseListener
{
	private JLabel name;
	
	public NameListener (JLabel n)
	{
		name = n;
	}
	
	public void mouseClicked(MouseEvent me)
	{
	}
	
	public void mouseEntered(MouseEvent me)
	{
		String id = ((ButtonFighter) me.getSource()).getActionCommand();
		name.setIcon(new ImageIcon("images/selection_screen/name"+id+".png"));
	}

	public void mouseExited(MouseEvent me)
	{
		name.setIcon(null);
	}

	public void mousePressed(MouseEvent me)
	{
	}

	public void mouseReleased(MouseEvent me)
	{
	}
}
