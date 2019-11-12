
public class Ghiozdan extends Rechizita{
	private Rechizita[] rechizite;
	private int nr_rechizite;
    private int capacitate_maxima;
 
    Ghiozdan(int capacitate)
    {
    	this.capacitate_maxima= capacitate;
    	rechizite = new Rechizita[capacitate];
    }
    
	public  String getNume() {
		return eticheta+"rechizita";
	}
	
	void addCaiet(Caiet c)	{
		
		rechizite[nr_rechizite++]= c;}
	
	void addManual(Manual m)	{
		rechizite[nr_rechizite++]=m;
		}
	
	void listItems()	{
		for(int i=0;i<nr_rechizite;i++)
			System.out.printf("%s",rechizite[i].getNume()+",");
		System.out.println();
	}

	void listManuals()	{
		for(int i=0;i<nr_rechizite;i++)
			if(rechizite[i] instanceof Manual)
				System.out.printf("%s",rechizite[i].getNume()+",");
		System.out.println();
	}
	void listCaiete()	{
		for(int i=0;i<nr_rechizite;i++)
			if(rechizite[i] instanceof Caiet)
				System.out.printf("%s",rechizite[i].getNume()+",");
		System.out.println();
	}
	
	int getNrRechizite()
	{
		return nr_rechizite;
	}
	
	int getNrManuale()
	{
		int nr=0;
		for(int i=0;i<nr_rechizite;i++)
			if(rechizite[i] instanceof Manual)
				nr++;
		return nr;
	}

	int getNrCaiete()
	{
		int nr=0;
		for(int i=0;i<nr_rechizite;i++)
			if(rechizite[i] instanceof Caiet)
				nr++;
		return nr;
	}

}
