
public class Persoana {
	private String nume;
	private int varsta;
	private String adresa;
	
	public Persoana(String nume, int varsta, String adresa) {
		this.nume = nume;
		this.varsta = varsta;
		this.adresa = adresa;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
}
