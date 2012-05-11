package view;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonMode extends JButton implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	private int mode_selected;
	private final String[] ICONS = {"mode_list.png", "mode_input.png"};
	private final String[] ICONS_ROLLOVER = {"mode_list_rollover.png", "mode_input_rollover.png"};
	
	public ButtonMode ()
	{
		mode_selected = 0;
		
		updateIcon();
		
		addActionListener(this);
	}
	
	public void changeMode ()
	{
		if (mode_selected == 1)
			mode_selected = 0;
		else
			mode_selected = 1;
		
		updateIcon();
	}
	
	public void updateIcon ()
	{
		try
		{
			BufferedImage icon = ImageIO.read(new File("images/selection_screen/buttons/"+ICONS[mode_selected]));
			setIcon(new ImageIcon(icon));
			
			icon = ImageIO.read(new File("images/selection_screen/buttons/"+ICONS_ROLLOVER[mode_selected]));
			setRolloverIcon(new ImageIcon(icon));
		}
		catch (IOException ioe)
		{
			System.out.println("Display Icon Problem");
			ioe.printStackTrace();
		}
	}
	
	public void actionPerformed (ActionEvent ae)
	{
		changeMode();
	}

	// Redifinition de paintComponent pour enlever les propriétés basiques du JButton
	protected void paintComponent (Graphics g)
	{
		super.paintComponent(g);
		
		setSize(75, 75);
		setContentAreaFilled(false); // Enlève le fond par défaut des JButton
		setFocusPainted(false); // Enlève le cadre qui s'affiche une fois qu'on clique dessus
		setBorder(null); // Enlève les bordures du bouton et son effet du survol
	}
	
	public int getMode ()
	{
		return mode_selected;
	}

}
