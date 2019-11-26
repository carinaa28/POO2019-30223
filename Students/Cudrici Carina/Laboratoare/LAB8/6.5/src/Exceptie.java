
public class Exceptie extends Exception {
	private String mesaj;
	public Exceptie(String m)
	{mesaj=m;}
	
	public String toString()
	{return  this.mesaj;}

}
