public class Imprumut {
	private Persoana persoana;
	private Carte carte;
	private String data_imprumut;
	private String data_predarii;
	
	public Imprumut(Persoana persoana, Carte carte, String data_imprumut, String data_predarii) {
		this.persoana = persoana;
		this.carte = carte;
		this.data_imprumut = data_imprumut;
		this.data_predarii = data_predarii;
	}
	public Persoana getPersoana() {
		return persoana;
	}
	public void setPersoana(Persoana persoana) {
		this.persoana = persoana;
	}
	public Carte getCarte() {
		return carte;
	}
	public void setCarte(Carte carte) {
		this.carte = carte;
	}

	public String getData_imprumut() {
		return data_imprumut;
	}
	public void setData_imprumut(String data_imprumut) {
		this.data_imprumut = data_imprumut;
	}

	public String getData_predarii() {
		return data_predarii;
	}
	public void setData_predarii(String data_predarii) {
		this.data_predarii = data_predarii;
	}

	public static void main(String[] args) {
		Imprumut i1= new Imprumut(new Persoana("Carina", 19,"str Xenopol, nr 27"),
				                new Carte("numecarte", "autor", 2007, "12AZ38K"),
				                "12/10/2019","13/11/2019");
	}

}
