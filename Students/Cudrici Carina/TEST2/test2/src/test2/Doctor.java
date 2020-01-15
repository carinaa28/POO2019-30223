package test2;

import java.util.Date;

public class Doctor extends Angajat{

	public Reteta oferaConsultatie(Pacient p,Date d) {
		return new Reteta(p,this,d);
	}

}
