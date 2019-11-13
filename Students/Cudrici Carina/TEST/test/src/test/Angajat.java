package test;

import java.util.Date;

public class Angajat extends Persoana implements Comparable<Angajat>{
	
  public Date data_angajare;
  public int nr_clienti_serviti;
  
   
  public Angajat(int ID, String nume, String nr_tel, Date data_angajare, int nr_clienti) {
	  super (ID,nume,nr_tel);
	  this.data_angajare = data_angajare;
	this.nr_clienti_serviti = nr_clienti;
}

void cazeazaClient(Client c,Camera r)
  {
	  nr_clienti_serviti++;
	  r.cazeazaClient(c);
  }

  void decazeazaClient()
  {
	  nr_clienti_serviti++;
	 
  }
  
  public int compareTo(Angajat a)
	{
		if(this.nr_clienti_serviti  > a.nr_clienti_serviti) return 1;
		if(this.nr_clienti_serviti == a.nr_clienti_serviti) return 0;
		return -1;
	}
}
