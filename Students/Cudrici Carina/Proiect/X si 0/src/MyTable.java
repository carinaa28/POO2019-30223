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
		this.setValueAt(null, 0, 1);
		this.setValueAt(null, 0, 2);
		this.setValueAt(null, 1, 0);
		this.setValueAt(null, 1, 1);
		this.setValueAt(null, 1, 2);
		this.setValueAt(null, 2, 0);
		this.setValueAt(null, 2, 1);
		this.setValueAt(null, 2, 2);
	}
	
	boolean isWinningCombination(int x1,int y1,int x2,int y2,int x3, int y3)
	{ 
		
		if(getValueAt(x1,y1)==null) return false;
		if(getValueAt(x2,y2)==null) return false;
		if(getValueAt(x3,y3)==null) return false;
		
		if(getValueAt(x1,y1).equals(getValueAt(x2,y2)))
	    if(getValueAt(x1,y1).equals(getValueAt(x3,y3)))
						 return true;
		return false;
	}
	boolean isDraw()
	{ 
		
		if(getValueAt(0,0)==null) return false;
		if(getValueAt(0,1)==null) return false;
		if(getValueAt(0,2)==null) return false;
	
		if(getValueAt(1,0)==null) return false;
		if(getValueAt(1,1)==null) return false;
		if(getValueAt(1,2)==null) return false;
		
		if(getValueAt(2,0)==null) return false;
		if(getValueAt(2,1)==null) return false;
		if(getValueAt(2,2)==null) return false;
	
		return true;
	}
	public char getwinner()
	{
		for(int linie=0;linie<3;linie++)
		if(isWinningCombination(linie,0, linie,1, linie,2))
		    return (char) getValueAt(linie,0);
	
		for(int coloana=0;coloana<3;coloana++)
			if(isWinningCombination(0,coloana, 1,coloana, 2,coloana))
			    return (char) getValueAt(0,coloana);
		
		if(isWinningCombination(0,0, 1,1, 2,2))
		    return (char) getValueAt(0,0);
	
		if(isWinningCombination(0,2, 1,1, 2,0))
		    return (char) getValueAt(1,1);
		
		if(isDraw())
		    {return '-'; }
	
		return '*';
	}

}
