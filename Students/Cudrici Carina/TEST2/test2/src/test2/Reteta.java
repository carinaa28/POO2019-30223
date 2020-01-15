package test2;

import java.util.Date;
import java.util.HashSet;

public class Reteta {
	private Pacient pacient;
	private Angajat  doctor;
	private Date data_consult;
	
	private static HashSet<Medicament> medicamente = new HashSet<Medicament>();
	
	public Reteta(Pacient pacient, Angajat doctor, Date data_consult) {
		this.pacient = pacient;
		this.doctor = doctor;
		this.data_consult = data_consult;
		
	}

	public Pacient getPacient() {
		return pacient;
	}

	public void setPacient(Pacient pacient) {
		this.pacient = pacient;
	}

	public Angajat getDoctor() {
		return doctor;
	}

	public void setDoctor(Angajat doctor) {
		this.doctor = doctor;
	}

	public Date getData_consult() {
		return data_consult;
	}

	public void setData_consult(Date data_consult) {
		this.data_consult = data_consult;
	}

	public static HashSet<Medicament> getMedicamente() {
		return medicamente;
	}

	public static void setMedicamente(HashSet<Medicament> medicamente) {
		Reteta.medicamente = medicamente;
	}
	
	
	
	
	
	

}
