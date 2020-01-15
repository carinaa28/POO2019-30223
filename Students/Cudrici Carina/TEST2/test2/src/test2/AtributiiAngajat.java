package test2;

public interface AtributiiAngajat {
	void adaugaMedicament(Medicament m, Integer stoc);
	void stergeMedicament(Medicament m);
	boolean esteInStoc(Medicament m);
	boolean esteDeVanzare(Medicament m);
	void modificaStoc(Medicament m, Integer stoc_nou);
	void proceseazaReteta(Pacient p);
}
