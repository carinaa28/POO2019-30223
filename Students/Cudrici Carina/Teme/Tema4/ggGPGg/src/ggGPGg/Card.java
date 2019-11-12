package ggGPGg;

public class Card  implements Comparable<Card>{
	private String suit ;
	private char number;
	
	public Card(String suit, char number) {
		this.suit = suit;
		this.number = number;
	}
	
	public String toString()
	{
		return this.suit +" "+ this.number;
	}

	@Override
	public int compareTo(Card c) {
	 if(this.number>c.number) return 1;
	if(this.number==c.number) return 0;
	return -1;
	}
	
	public boolean equals(Card c)
	{
		return this.number==c.number && this.suit.equals(c.suit) ;
	}

}


