
public class Problema {

	public static void main(String[] args) {

		int viz[] = new int[50];
		int numere = 0;

		while (numere < 6) {
			double y = Math.random() * 100;
			int x = (int) y;
			x = x % 50;
			if (viz[x] == 0) {
				viz[x] = 1;
				numere++;
				System.out.println(x);
			}

		}

	}
}
