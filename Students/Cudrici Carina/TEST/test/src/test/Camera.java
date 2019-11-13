package test;

public class Camera {
	private int nr_identificare;
	private int capacitate;
	private int pret_normal;
	private int pret_single;
	private Client[] cazati= new Client[100];
	private int nr_clienti_cazati;


	
	public Camera(int nr_identificare, int capacitate, int pret_normal, int pret_single, Client[] cazati,
			int nr_clienti_cazati) {
	
		this.nr_identificare = nr_identificare;
		this.capacitate = capacitate;
		this.pret_normal = pret_normal;
		this.pret_single = pret_single;
		this.cazati = cazati;
		this.nr_clienti_cazati = nr_clienti_cazati;
	}

	public void cazeazaClient(Client c) {
		if(estePlina()==0) 
		{nr_clienti_cazati++;
		 cazati[nr_clienti_cazati]=c;
		}
	}
	public void decazeazaClienti() {
	  
		nr_clienti_cazati=0;
		cazati= new Client[100];
	}
	
	public int pret_normal(int nr_nopti) {
		
		return pret_normal*nr_nopti;
	}

	public int pret_normal(int nr_nopti,int discount) {
		
		return pret_normal*nr_nopti-discount;
	}

	public int pret_single(int nr_nopti) {
		
		return pret_single*nr_nopti;
	}

	public int pret_single(int nr_nopti,int discount) {
		
		return pret_single*nr_nopti-discount;
	}
	
    public int estePlina() {
		
    	if(nr_clienti_cazati==capacitate)
    		return 1;
    	
    	return 0;
    		
	}
	
}
