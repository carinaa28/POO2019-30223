public class Persoana implements Comparable<Persoana> {
	private String nume;
	private String prenume;
	private int varsta;

	public Persoana(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
	}

	public String toString() {
		return "nume: " + this.nume + " " + "prenume: " + this.prenume + " varsta: " + this.varsta;
	}

	public int compareTo(Persoana p) { 
	if(this.varsta>p.varsta) return 1;
    if(this.varsta<p.varsta) return -1;
	return 0;
	 
	 }
	 


	}