import java.awt.Color;

public class Masina  {
	public String marca;
	public Color culoare;
	

	public Masina(String marca, Color culoare ) {
		this.marca = marca;
		this.culoare = culoare;
		
	}

	public void revopseste(Color culoare) {
		this.culoare = culoare;
	}

	   public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Color getCuloare() {
		return culoare;
	}


	public Masina deepCopy() 
	    {
		return  new Masina( this.marca, this.culoare);
	
	    }
	
	public Masina shallowCopy() 
    {
	  return this;
    }
	
	
}