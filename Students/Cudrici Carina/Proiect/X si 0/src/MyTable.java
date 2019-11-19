import javax.swing.JTable;

public class MyTable extends JTable {
	
	
	public MyTable(int numRows, int numColumns) {
		super(numRows, numColumns);

	}

	public boolean isCellEditable(int row, int column) {
    	if (this.getValueAt(row, column) != null) return false;
		return true;
    }
	
	public void reset()
	{
		this.setValueAt(null, 0, 0);
		this.setValueAt(null, 1, 1);
	}

}
