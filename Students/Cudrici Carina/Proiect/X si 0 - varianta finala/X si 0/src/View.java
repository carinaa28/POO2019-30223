import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class View {

	
	static JFrame mainFrame = new JFrame("X si O");
	static JPanel controlPanel = new JPanel();
	static MyTableModel table = new MyTableModel(3, 3);
	static Border border = BorderFactory.createLineBorder(Color.GRAY, 2);
	static JButton newGameButton = new JButton("NEW GAME");
	

}
