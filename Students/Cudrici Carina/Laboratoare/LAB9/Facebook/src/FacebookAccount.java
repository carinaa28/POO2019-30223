import java.util.ArrayList;

public class FacebookAccount {
	private String nume;
	private int varsta;
	private String locatia_curenta ;
	private ArrayList<FacebookAccount>  prieteni=new ArrayList<FacebookAccount>();
	
	
	
	public FacebookAccount(String nume, int varsta, String locatia_curenta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.locatia_curenta = locatia_curenta;
	}


	public String getLocatia_curenta() {
		return locatia_curenta;
	}

	
	void addFriend(FacebookAccount a)
	{
		prieteni.add(a);
		
	}
	void deleteFriend(FacebookAccount a)
	{
		prieteni.remove(a);
		
	}
	
	void printList()
	{
		for(FacebookAccount i: prieteni)
		{
			System.out.println(i);
		}
	}
	
	public ArrayList<FacebookAccount> FindFriends()
	{
		ArrayList<FacebookAccount> prieteni_din_apropiere=new ArrayList<FacebookAccount>();;
		for(FacebookAccount i: prieteni)
		{
			if(i.getLocatia_curenta().equals(this.locatia_curenta))
				prieteni_din_apropiere.add(i);
		}
		return prieteni_din_apropiere;
	}
	
	public ArrayList<FacebookAccount> FindFriends(String locatie)
	{
		ArrayList<FacebookAccount> prieteni_din_apropiere = new ArrayList<FacebookAccount>();
		for(FacebookAccount i: prieteni)
		{
			if(i.getLocatia_curenta().equals(locatie))
				prieteni_din_apropiere.add(i);
		}
		return prieteni_din_apropiere;
	}
	
	
	@Override
	public String toString() {
		return "FacebookAccount [nume=" + nume + ", varsta=" + varsta + ", locatia_curenta=" + locatia_curenta
				+ ", prieteni=" + prieteni + "]";
	}


	public static void main(String[] args) {
		

	}

}
