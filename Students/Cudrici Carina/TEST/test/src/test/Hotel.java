package test;

import java.util.Arrays;

public class Hotel {
	
	
	private Client[] clienti  = new Client[100];
	private Angajat[] angajati= new Angajat[100];;
	private Camera[] camere = new Camera[100];;
	
	private int nr_clienti;
	private int nr_angajati;
	private int nr_camere;
	

public Hotel(Camera[] camere, int nr_camere) {
		this.camere = camere;
		this.nr_camere = nr_camere;
	}



void adaugaAngajat(Angajat a)
{
	angajati [nr_angajati++]=a;
}

void adaugaClient(Client c )
{
	clienti[nr_clienti++]=c;
}

void emiteFactura(Client c)
{
	System.out.println(c.ID);
	System.out.println(c.nume);
	System.out.println(c.nr_tel);
	System.out.println(c.check_in);
	System.out.println(c.check_out);
	System.out.println(c.nr_nopti());
	
}

void arata_clienti_sortati() {
	Arrays.sort(clienti);
	System.out.println(clienti);
}

void arata_angajati_sortati() {
	Arrays.sort(angajati);
	System.out.println(angajati);
}

int nr_camere_libere()
{
	return 0;
}

int nr_camere_ocupate()
{
	return nr_camere - nr_camere_libere();
}

}
