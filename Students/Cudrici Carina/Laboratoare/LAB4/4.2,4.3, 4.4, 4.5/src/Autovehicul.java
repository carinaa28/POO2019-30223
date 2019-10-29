import java.awt.Color;

public class Autovehicul {
	private String marca;
	private Color culoare;
	private int viteza_curenta;
	private int treapta_curenta;
	private int viteza_maxima;
	private int anul_fabricatiei;
	private final int numar_roti=4;
	private Sofer sofer = new Sofer();
	private Motor motor = new Motor();
	private Certificat certificat = new Certificat();
	

	Autovehicul() {

	}

	Autovehicul(String marca, Color culoare, int viteza_curenta, int treapta_viteza_curenta, int viteza_maxima,
			int anul_fabricatiei) {
		this.marca = marca;
		this.culoare = culoare;
		this.viteza_curenta = viteza_curenta;
		this.treapta_curenta = treapta_viteza_curenta;
		this.viteza_maxima = viteza_maxima;
		this.setAnul_fabricatiei(anul_fabricatiei);
	}

	public Sofer getSofer() {
		return sofer;
	}

	public void setSofer(Sofer sofer) {
		this.sofer = sofer;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Certificat getCertificat() {
		return certificat;
	}

	public void setCertificat(Certificat certificat) {
		this.certificat = certificat;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setCuloare(Color culoare) {
		this.culoare = culoare;
	}

	public Color getCuloare() {
		return culoare;
	}

	public void setVitezaCurenta(int viteza_curenta) {
		if (viteza_curenta <= 0)
			this.viteza_curenta = 0;
		else if (viteza_curenta >= viteza_maxima)
			this.viteza_curenta = viteza_maxima;
		else
			this.viteza_curenta = viteza_curenta;
	}

	public int getVitezaCurenta() {
		return viteza_curenta;
	}

	public void setTreaptaCurenta(int treapta_curenta) {
		if (treapta_curenta <= 6 && treapta_curenta >= 1)
			this.treapta_curenta = treapta_curenta;
		else
			System.out.println("Masina nu are aceasta trepata");
	}

	public int setTreaptaCurenta() {
		return treapta_curenta;
	}

	public void setVitezaMaxima(int viteza_maxima) {
		this.viteza_maxima = viteza_maxima;
	}

	public int setVitezaMaxima() {
		return viteza_maxima;
	}
	public int getAnul_fabricatiei() {
		return anul_fabricatiei;
	}

	public void setAnul_fabricatiei(int anul_fabricatiei) {
		this.anul_fabricatiei = anul_fabricatiei;
	}
	public int getNumar_roti() {
		return numar_roti;
	}

	public void accelereaza(int nr) {
		setVitezaCurenta(viteza_curenta + nr);
	}

	public void decelereaza(int nr) {
		setVitezaCurenta(viteza_curenta - nr);
	}

	public void schimbare_trapta(int treapta) {
		setTreaptaCurenta(treapta);
	}

	public void oprire() {
		setVitezaCurenta(0);
	}

	public void oprire( int treapta) {
		setVitezaCurenta(0);
		setTreaptaCurenta(treapta);
	}
	
	public static void parcurgereDrum(Autovehicul a) {
		

		System.out.println(a.getVitezaCurenta());
		a.accelereaza(60);
		System.out.println(a.getVitezaCurenta());
		a.decelereaza(30);
		System.out.println(a.getVitezaCurenta());
	    a.oprire();
	    System.out.println(a.getVitezaCurenta());

	}



	
	public static void main(String[] args) {

		Autovehicul a = new Autovehicul("Audi I7", Color.MAGENTA, 100, 3, 300, 2009);
		parcurgereDrum(a);

	}


}
