public class Student  {
	public String nume;
	public String prenume;
	public Masina masina;

	public Student(String nume, String prenume, Masina m) {
		this.nume = nume;
		this.prenume = prenume;
		this.masina = m;
	}
	
	
	   public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public String getPrenume() {
		return prenume;
	}


	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}


	public Masina getMasina() {
		return masina;
	}


	public void setMasina(Masina m) {
		this.masina = m;
	}


	public Student deepCopy() 
	    {
		  return new Student(this.nume,this.prenume,this.masina.deepCopy());
		  }
	
	public Student shallowCopy() 
    {
	  return this;
    }
	

}