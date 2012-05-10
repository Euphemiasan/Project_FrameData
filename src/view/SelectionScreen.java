package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.ButtonsListerner;

public class SelectionScreen extends JPanel
{
	private static final long serialVersionUID = 1L;

	public SelectionScreen () 
	{
		super();
		
		setSize(1100, 225);
		setBackground(new Color(156, 47, 47));

		JLabel title = new JLabel(new ImageIcon("images/selection_screen/title.png"));
		add(title);
		
		// Creation Panel pour les boutons
		JPanel buttons_panel = new JPanel();
		add(buttons_panel);
		
		GridBagLayout layout = new GridBagLayout();
		buttons_panel.setLayout(layout);
		GridBagConstraints layout_rules = new GridBagConstraints();
		layout_rules.fill = GridBagConstraints.BOTH;

		ButtonFighter fighter = null;
		ButtonsListerner fighters_listener = new ButtonsListerner();
		int x, y;
		int width = 4;
		int height = 1;
		double px = 0;
		double py = 0;
		
		layout_rules.gridwidth = width;
		layout_rules.gridheight = height;
		layout_rules.weightx = px;
		layout_rules.weighty = py;
		
		for (int i=1; i<=39; i++)
		{
			fighter = new ButtonFighter(i);
			fighter.addActionListener(fighters_listener);
			
			if (i > 13)
			{
				if (i > 27)
				{
					x = (i - 28) * 4; 
					y = 2;
				}
				else
				{
					x = ((i - 14) *4);
					y = 1;
				}
			}
			else
			{
				x = (i * 4);
				y = 0;
			}
			
			layout_rules.gridx = x;
			layout_rules.gridy = y;
			buttons_panel.add(fighter, layout_rules);
		}
		
		layout_rules.gridx = 12 * 4;
		layout_rules.gridy = 2;
		ButtonMode mode = new ButtonMode();
		buttons_panel.add(mode, layout_rules);
	}
}
