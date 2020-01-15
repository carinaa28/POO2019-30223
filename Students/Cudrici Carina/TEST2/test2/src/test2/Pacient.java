package test2;

import java.util.HashSet;

public abstract class Pacient {
private String nume;
private String prenume;
private int varsta;
private String sex;
private String tip_afectiune;
private static HashSet<Reteta> retete = new HashSet<Reteta>();


private void calcul_severitate() {}


@Override
public String toString() {
	return "Pacient [nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", sex=" + sex + ", tip_afectiune="
			+ tip_afectiune + "]";
}






}
