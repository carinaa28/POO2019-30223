package test;

import java.util.Date;

public class Testare {

	
	public static void main(String[] args) {
		
		
		Client c1= new Client(1,"carina","123456789",1,new Date(2019,12,3),new Date(2019,12,16));
		Client c2= new Client(2,"abc","98765432",1,new Date(2019,12,1),new Date(2019,12,5));
		Client c3= new Client(3,"xyz","123476657",3,new Date(2019,12,5),new Date(2019,12,28));
		Client c4= new Client(4,"qwert","123476657",3,new Date(2019,12,5),new Date(2019,12,28));
		Client c5= new Client(5,"0987","123476657",3,new Date(2019,12,5),new Date(2019,12,28));
		
		Angajat a1=new Angajat(1,"zxc","8765433",new Date(2019,11,3),0);
		Angajat a2=new Angajat(2,"asdf","656756555",new Date(2019,11,1),0);
		Angajat a3=new Angajat(3,"llkjh","123456086",new Date(2019,11,2),0);
		
		Camera r1= new Camera ( 1,2,50,100,new Client[] {c1,c2}, 2);
		Camera r2= new Camera ( 3,4,50,100,new Client[] {c3,c4,c5}, 3);
		
		Hotel hotel = new Hotel(new Camera[] {r1,r2},2);
		hotel.adaugaAngajat(a1);
		hotel.adaugaAngajat(a2);
		hotel.adaugaAngajat(a3);
		
		hotel.adaugaClient(c1);
		hotel.adaugaClient(c2);
		hotel.adaugaClient(c3);
		hotel.adaugaClient(c4);
		hotel.adaugaClient(c5);
		
		a1.cazeazaClient(c1,r1);
		a2.cazeazaClient(c2,r1);
		
		a1.cazeazaClient(c3, r2);
		a1.cazeazaClient(c4, r2);
		a1.cazeazaClient(c5, r2);
		
		
		
	}

}
