import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class GUI {
	
	public char currentPlayer='X';

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("");
		mainFrame.setSize(400, 500);

		JLabel statusLabel = new JLabel("X SI 0");
		
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.PAGE_AXIS));
			
		JTable table= new MyTable(3,3);
		table.setRowHeight(100);
		table.setRowSelectionAllowed(false);
		
		
		class TableActionListener implements MouseListener {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				int column = table.getSelectedColumn();
				
				if (table.isCellEditable(row,column))
				{table.setValueAt(Player.makeMove(), row, column);
			
				
				}
			
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
			}

		}
		
		
		table.addMouseListener(new TableActionListener());
		
		
	
		
		JButton b1 = new JButton("NEW GAME");
		class MyActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
		//	table.reset();
				table.setValueAt(null, 0, 0);
				table.setValueAt(null, 0, 1);
				table.setValueAt(null, 0, 2);
				table.setValueAt(null, 1, 0);
				table.setValueAt(null, 1, 1);
				table.setValueAt(null, 1, 2);
				table.setValueAt(null, 2, 0);
				table.setValueAt(null, 2, 1);
				table.setValueAt(null, 2, 2);
				
			}	
		}
		
		
		b1.addActionListener(new MyActionListener());	
		
		mainFrame.add(controlPanel);
		controlPanel.add(Box.createRigidArea(new Dimension(0,5)));
		controlPanel.add(statusLabel);
		controlPanel.add(Box.createRigidArea(new Dimension(0,30)));
		controlPanel.add(table);
		controlPanel.add(Box.createRigidArea(new Dimension(0,40)));
		controlPanel.add(b1);
	
		
		mainFrame.setVisible(true);
	
	
	}

}
