package test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Client extends Persoana implements Comparable<Client> {
	public int nr_camera;
	public Date check_in;
	public Date check_out;
	
	
	public Client(int ID, String nume, String nr_tel,int nr_camera, Date check_in, Date check_out) {
		super (ID,nume,nr_tel);
		this.nr_camera = nr_camera;
		this.check_in = check_in;
		this.check_out = check_out;
	}

	public long nr_nopti() {
		long diff = this.check_out.getTime() - this.check_in.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public int compareTo(Client c)
	{
		 long dif1 =  this.nr_nopti();
		 long dif2 =  c.nr_nopti();
		  
		 if(dif1>dif2) return 1;
	     if(dif1==dif2) return 1;
      	return -1;
	}





	
	
	
}
