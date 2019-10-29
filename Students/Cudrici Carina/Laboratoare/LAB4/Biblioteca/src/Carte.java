
public class Carte {
	private String nume;
	private String autor;
	private int anulAparitiei;
	private String cod;
	
	public Carte(String nume, String autor, int anulAparitiei, String cod) {
		super();
		this.nume = nume;
		this.autor = autor;
		this.anulAparitiei = anulAparitiei;
		this.cod = cod;
	}
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnulAparitiei() {
		return anulAparitiei;
	}
	public void setAnulAparitiei(int anulAparitiei) {
		this.anulAparitiei = anulAparitiei;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
}
