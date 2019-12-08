import java.util.ArrayList;

public class Pet {

	private String nume;
	private int varsta;
	
	
	public Pet(String nume, int varsta) {
	
		this.nume = nume;
		this.varsta = varsta;
	}


	@Override
	public String toString() {
		return "Pet [nume=" + nume + ", varsta=" + varsta + "]";
	}

	

}
