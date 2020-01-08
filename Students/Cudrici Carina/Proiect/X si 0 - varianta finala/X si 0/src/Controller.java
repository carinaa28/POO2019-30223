import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;

public class Controller {
	
	public static void main(String[] args) {
		
		View.mainFrame.setSize(360, 500);
		View.mainFrame.setBackground(Color.white);
	
		View.controlPanel.setLayout(new BoxLayout(View.controlPanel, BoxLayout.PAGE_AXIS));
		View.controlPanel.setBackground(Color.white);
		
		View.table.setRowHeight(120);
		View.table.setRowSelectionAllowed(false);
		View.table.setFont(new Font("Serif", Font.ROMAN_BASELINE, 153));
		View.table.setBorder(View.border);		
		View.table.addMouseListener(new TableActionListener());
		
		View.newGameButton.addActionListener(new NewGameActionListener());

		View.mainFrame.add(View.controlPanel);
		View.controlPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		View.controlPanel.add(View.table);
		View.controlPanel.add(Box.createRigidArea(new Dimension(0, 40)));
		View.controlPanel.add(View.newGameButton);

		View.mainFrame.setVisible(true);

	}

}
