package ggGPGg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class DataSet implements Iterator<Card>, OrderedIterator {

	private Integer number;
	private Integer position;
	private ArrayList<Card> list;

	public DataSet() {
		number = 13;
		position = 0;
		list = new ArrayList<Card>(Arrays.asList(new Card("hearts", '1'), new Card("hearts", '2'),
				new Card("hearts", '3'), new Card("hearts", '4'), new Card("hearts", '5'), new Card("hearts", '6'),
				new Card("hearts", '7'), new Card("hearts", '8'), new Card("hearts", '9'), new Card("hearts", 'A'),
				new Card("hearts", 'B'), new Card("hearts", 'C'), new Card("hearts", 'D')));

	}

	public void print() {
		System.out.println(list);
	}

	public boolean hasNext() {
		return position < number - 1;
	}

	public Card next() {
		if (!hasNext())
			return new Card("NULL", '0');
  	return list.get(++position);
	}

	public int put(Comparable<Card> c) {
		for(int i=0;i<number;i++)
			if(c.equals(list.get(i))) {list.remove(i);break;}
		list.add((Card) c);
		number++;

		return 0;
	}

	public void remove(int poz) {
    list.remove(poz);
    number--;
 	}



}