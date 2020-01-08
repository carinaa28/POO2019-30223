import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junit {

	PlayerModel p = new PlayerModel ();
	 MyTableModel table = new MyTableModel(3, 3);
	@Test
	void testPlayer() {
		assertEquals('O',p.makeMove());
	}
	@Test
	void testModelReset() {
		table.setValueAt('X',0,0);
		table.setValueAt('X',0,1);
		table.setValueAt('X',0,2);
		table.setValueAt('X',1,0);
		table.setValueAt('X',1,1);
		table.setValueAt('X',1,2);
		table.setValueAt('X',2,0);
		table.setValueAt('X',2,1);
		table.setValueAt('X',2,2);
		table.reset();
		assertEquals(null,table.getValueAt(0, 0));
		assertEquals(null,table.getValueAt(0, 1));
		assertEquals(null,table.getValueAt(0, 2));
		assertEquals(null,table.getValueAt(1, 0));
		assertEquals(null,table.getValueAt(1, 1));
		assertEquals(null,table.getValueAt(1, 2));
		assertEquals(null,table.getValueAt(2, 0));
		assertEquals(null,table.getValueAt(2, 1));
		assertEquals(null,table.getValueAt(2, 2));
	}
	
	@Test
	void testModelValues() {
		table.setValueAt('X',0,0);
		assertEquals('X',table.getValueAt(0, 0));
			
		table.setValueAt('X',0,1);
		assertEquals('X',table.getValueAt(0, 1));
		
		table.setValueAt('X',0,2);
		assertEquals('X',table.getValueAt(0, 2));
		
		table.setValueAt('X',1,0);
		assertEquals('X',table.getValueAt(1, 0));
			
		table.setValueAt('X',1,1);
		assertEquals('X',table.getValueAt(1, 1));
		
		table.setValueAt('X',1,2);
		assertEquals('X',table.getValueAt(1, 2));
		
		table.setValueAt('X',2,0);
		assertEquals('X',table.getValueAt(2, 0));
			
		table.setValueAt('X',2,1);
		assertEquals('X',table.getValueAt(2, 1));
		
		table.setValueAt('X',2,2);
		assertEquals('X',table.getValueAt(2, 2));
	}

}
