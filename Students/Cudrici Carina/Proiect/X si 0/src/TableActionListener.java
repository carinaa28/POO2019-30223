import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

class TableActionListener implements MouseListener {
			@Override
			public void mouseClicked(MouseEvent e) {
               MyTable table = (MyTable) e.getSource();
				int row = table.getSelectedRow();
				int column = table.getSelectedColumn();

				if (table.isCellEditable(row, column)) {
					table.setValueAt(Player.makeMove(), row, column);
	
				if (table.getwinner()== 'O' || table.getwinner()=='X')
				{
					
					JOptionPane.showMessageDialog(GUI.mainFrame,"  "+table.getwinner()+" a castigat ");
					table.reset();
				}
				
				if (table.getwinner()== '-')
				{
					
					JOptionPane.showMessageDialog(GUI.mainFrame,"  A fost remiza ");
					table.reset();
				}
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