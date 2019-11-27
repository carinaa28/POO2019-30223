import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class GUI {

	static char currentPlayer = 'X';
	static JFrame mainFrame = new JFrame("X si O");
	static JPanel controlPanel = new JPanel();
	static MyTable table = new MyTable(3, 3);
	static Border border = BorderFactory.createLineBorder(Color.GRAY, 2);
	static JButton newGameButton = new JButton("NEW GAME");
	

	public static void main(String[] args) {
	
		mainFrame.setSize(360, 500);
		mainFrame.setBackground(Color.white);
	
		controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.PAGE_AXIS));
		controlPanel.setBackground(Color.white);
		
		table.setRowHeight(120);
		table.setRowSelectionAllowed(false);
		table.setFont(new Font("Serif", Font.ROMAN_BASELINE, 153));
		table.setBorder(border);		
		table.addMouseListener(new TableActionListener());
		
		newGameButton.addActionListener(new NewGameActionListener());

		mainFrame.add(controlPanel);
		controlPanel.add(Box.createRigidArea(new Dimension(0, 5)));
		controlPanel.add(table);
		controlPanel.add(Box.createRigidArea(new Dimension(0, 40)));
		controlPanel.add(newGameButton);

		mainFrame.setVisible(true);

	}

}
