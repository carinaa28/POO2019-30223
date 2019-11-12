package ggGPGg;

public class TestDataSet {
	public static void main(String[] args) {
		DataSet d = new DataSet();
		d.print();
		d.remove(0);
		d.put(new Card("hearts", '1'));
		d.print();
		
		while(d.hasNext())
				System.out.println(d.next());
		
	}
}
