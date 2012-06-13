package view;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Move;

public class MovePanel extends JPanel
{
	
	public MovePanel ()
	{
		super();
		
		setPreferredSize(new Dimension(800, 700));
		
		
	}
	
	public void addMove(Move m){
		JPanel move = new JPanel();
		
		setPreferredSize(new Dimension(800, 40));
		move.setLayout(null);
		
		JLabel move_name = new JLabel(m.getName());
		move_name.setBounds(0, 0, 800, 40);
		add(move_name);
	}
	
	
}
