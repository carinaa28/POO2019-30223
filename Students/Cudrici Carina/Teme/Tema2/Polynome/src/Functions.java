
public class Functions extends Polynome{

	Functions(int size) {
		super(size);
	}
	

static Polynome sum(Polynome p1, Polynome p2) {

		if (p1.size < p2.size) {
			Polynome rezultat = new Polynome(p2.size);
			for (int i = 0; i < p1.size; i++)
				rezultat.a[i] = p1.a[i] + p2.a[i];
			for (int i = p1.size; i < p2.size; i++)
				rezultat.a[i] = p2.a[i];

			return rezultat;
		} else {
			Polynome rezultat = new Polynome(p1.size);
			for (int i = 0; i < p2.size; i++)
				rezultat.a[i] = p1.a[i] + p2.a[i];
			for (int i = p2.size; i < p1.size; i++)
				rezultat.a[i] = p1.a[i];
			return rezultat;
		}
	}

	static Polynome substract(Polynome p1, Polynome p2) {
		if (p1.size < p2.size) {
			Polynome rezultat = new Polynome(p2.size);
			for (int i = 0; i < p1.size; i++)
				rezultat.a[i] = p1.a[i] - p2.a[i];
			for (int i = p1.size; i < p2.size; i++)
				rezultat.a[i] = -p2.a[i];
			return rezultat;
		} else {
			Polynome rezultat = new Polynome(p1.size);
			for (int i = 0; i < p2.size; i++)
				rezultat.a[i] = p1.a[i] - p2.a[i];
			for (int i = p2.size; i < p1.size; i++)
				rezultat.a[i] = p1.a[i];
			return rezultat;
		}
	}

	static Polynome multiply_scal(Polynome p, int n) {

		Polynome rezultat = new Polynome(p.size);
		for (int i = 0; i < p.size; i++)
			rezultat.a[i] = p.a[i] * n;

		return rezultat;

	}

	static Polynome multiply(Polynome p1, Polynome p2) {

		Polynome rezultat = new Polynome(p1.size + p2.size -1);
		for (int i = 0; i < p1.size; i++)
			for (int j = 0; j < p2.size; j++)
				rezultat.a[i+j] += p1.a[i] * p2.a[j];

		return rezultat;

	}

	static int eval_x(Polynome p, int x) {
		int rezultat = 0;
		int termen = 1;
		for (int i = 0; i < p.size; i++) {
			rezultat += p.a[i] * termen;
			termen *= x;
		}
		return rezultat;
	}



	
	

}
