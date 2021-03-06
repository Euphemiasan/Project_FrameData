package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.Fighter;

import controller.ButtonsListerner;

public class FighterScreen extends JPanel
{
	private static final long serialVersionUID = 1L;

	private Fighter fighter;
	private int fighter_id;
	
	private Project_FrameData main_window;
	private JScrollPane right_panel;
	
	private DescriptionPanel description_panel;
	private MovePanel move_list_panel;
	
	public FighterScreen (Project_FrameData windows, Fighter f)
	{
		super();
		
		main_window = windows;
		fighter = f;
		fighter_id = fighter.getFighter_id();
		
		fighter.printMoves();

		setPreferredSize(new Dimension(1100, 700));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(Color.GRAY);
		
		///////////////
		// LeftPanel //
		///////////////
		JPanel leftPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(300, 700));
		leftPanel.setLayout(null);
		leftPanel.setBackground(Color.BLACK);
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

		// Deuxieme Bouton "FrameData"
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
		
		// Button back à la screen 0
		JButton button_back = new JButton();
		button_back.setActionCommand("back");
		button_back.setBounds(10, 640, 50, 50);
		button_back.setContentAreaFilled(false);
		button_back.setFocusPainted(false);
		button_back.setBorder(null);
		button_back.setIcon(new ImageIcon("images/description_screen/buttons/back.png"));
		ButtonsListerner back_listener = new ButtonsListerner(main_window, null);
		button_back.addActionListener(back_listener);
		leftPanel.add(button_back);
		
		// Pseudo
		JLabel name = new JLabel(new ImageIcon("images/names/name" + fighter_id + ".png"));
		name.setBounds(0, 500, 300, 150);
		leftPanel.add(name);
		
		String background_url = "images/description_screen/characters/leftbackground/" + fighter_id + ".jpg";
		BackgroundPanel background = new BackgroundPanel(background_url);
		background.setBounds(0, 50, 300, 650);
		leftPanel.add(background);
		///////////////////
		// Fin LeftPanel //
		///////////////////

		////////////////
		// RightPanel //
		////////////////
		right_panel = new JScrollPane(); 
		right_panel.setPreferredSize(new Dimension(800, 700));
		add(right_panel);
		
		description_panel = new DescriptionPanel();
		move_list_panel = new MovePanel();
		setScrollContent(0, 0);
		////////////////////
		// Fin RightPanel //
		////////////////////
		
		
	}
	
	// Méthode qui jongle entre tous les onglets
	public void setScrollContent (int pane_selected, int fighter_id)
	{
		if (pane_selected == 0)
		{
			right_panel.getViewport().setView(description_panel);
			right_panel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			right_panel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		}
		else if (pane_selected == 1)
		{
			
		}
		
		/*
		else if (screen_selected == 1)
		{
			screen1 = new FighterScreen(this, fighter_id);
			
			setContentPane(screen1);
		}
		else
		{
			// A remplir quand screen2 sera crée
			System.out.println("Input mode non disponible pour le moment");
		}

		// La méthode pack permet de fixer une taille a la JFrame en conservant PreferredSize de son JPanel
		
		pack();
		*/
	}
	
}
