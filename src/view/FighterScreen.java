package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FighterScreen extends JPanel
{

	public FighterScreen ()
	{
		super();
		
		setPreferredSize(new Dimension(1100, 700));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(Color.BLACK);
		
		// LeftPanel
		JPanel leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(300, 700));
		leftPanel.setLayout(null);
		leftPanel.setBackground(Color.RED);
		add(leftPanel);

		// Premier Bouton "MoveList"
		JButton buttonList = new JButton();
		buttonList.setBounds(0, 0, 150, 50);
		buttonList.setContentAreaFilled(false);
		buttonList.setFocusPainted(false);
		buttonList.setBorder(null);
		try
		{
		BufferedImage icon = ImageIO.read(new File("images/description_screen/buttons/move_list.jpg"));
		buttonList.setIcon(new ImageIcon(icon));
		icon = ImageIO.read(new File("images/description_screen/buttons/move_list_rollover.jpg"));
		buttonList.setRolloverIcon(new ImageIcon(icon));
		}
		catch (IOException ioe)
		{
			System.out.println("Display Button Problem");
			ioe.printStackTrace();
		}
		leftPanel.add(buttonList);

		JButton buttonFrame = new JButton();
		buttonFrame.setBounds(150, 0, 150, 50);
		buttonFrame.setContentAreaFilled(false);
		buttonFrame.setFocusPainted(false);
		buttonFrame.setBorder(null);
		try
		{
		BufferedImage icon = ImageIO.read(new File("images/description_screen/buttons/frame_data.jpg"));
		buttonFrame.setIcon(new ImageIcon(icon));
		icon = ImageIO.read(new File("images/description_screen/buttons/frame_data_rollover.jpg"));
		buttonFrame.setRolloverIcon(new ImageIcon(icon));
		}
		catch (IOException ioe)
		{
			System.out.println("Display Button Problem");
			ioe.printStackTrace();
		}
		leftPanel.add(buttonFrame);
		
		JPanel name = new JPanel();
		name.setBounds(0, 50, 300, 150);
		name.setBackground(Color.WHITE);
		leftPanel.add(name);
		
		JPanel button_back = new JPanel();
		button_back.setBounds(0, 650, 50, 50);
		button_back.setBackground(Color.GRAY);
		leftPanel.add(button_back);
		
	}
}
