package test2;

import java.util.Date;

public class Angajat implements AtributiiAngajat , Comparable<Angajat>{
	private String nume;
	private String ID;
	private Date data_angajare;
	private int bonus;
	
	
	@Override
	public void adaugaMedicament(Medicament m, Integer stoc) {
		Farmacie.medicament_stoc.put(m, stoc);
		
	}
	@Override
	public void stergeMedicament(Medicament m) {
		Farmacie.medicament_stoc.remove(m);
		
	}
	@Override
	public boolean esteInStoc(Medicament m) {
		
		
		return false;
	}
	@Override
	public boolean esteDeVanzare(Medicament m) {

		return false;
	}
	@Override
	public  void modificaStoc(Medicament m, Integer stoc_nou) {
		Farmacie.medicament_stoc.remove(m);
		Farmacie.medicament_stoc.put(m, stoc_nou);
	}
	@Override
	public void proceseazaReteta(Pacient p) {
		
		
	}
	@Override
	public int compareTo(Angajat o) {
		
	if (this.bonus>o.bonus) return 1;
	if (this.bonus==o.bonus) return 0;
	return -1;
	
	}
	
	
	
}
