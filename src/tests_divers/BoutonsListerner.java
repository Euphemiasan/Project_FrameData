package tests_divers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoutonsListerner implements ActionListener{
	
	public void actionPerformed(ActionEvent ae) {
		System.out.println(ae.getActionCommand());
	}
	
}
