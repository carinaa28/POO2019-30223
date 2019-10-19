import java.util.Formatter;

public class Polynome {

	public int[] a;
	public int size;

	Polynome(int size, int[] a) {
		this.size = size;
		this.a = new int[size];
		for (int i = 0; i < size; i++) // memorez polinomul invers
			this.a[i] = a[size - 1 - i];

	}

	Polynome(int size) {
		this.size = size;
		this.a = new int[size];

	}

	void printPolynome() {
		
		System.out.printf("Polinomul de grad %d este ", size-1);
		for (int i = size - 1; i >= 0; i--)
			if (a[i] != 0) {
				if (a[i] < 0)
					System.out.printf(" - ");
				if (a[i] > 0 && i != size - 1)
					System.out.printf(" + ");

				System.out.printf("%d", Math.abs(a[i]));
				if (i != 0)
					System.out.printf("x^%d", i);

			}
		System.out.println();

	}



}
