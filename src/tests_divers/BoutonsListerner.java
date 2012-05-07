package tests_divers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoutonsListerner implements ActionListener{
	
	Request r = new Request();
	
	public void actionPerformed(ActionEvent ae) {
		System.out.println(ae.getActionCommand());
		r.showChar(ae.getActionCommand());
		r.showMove(ae.getActionCommand());
	}
	
}
