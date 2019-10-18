package palindrom;

public class Mainclass {

	public static boolean palindrom(long x) {
		long xx = x;
		long y = 0;
		while (xx != 0) {
			y = y * 10 + xx % 10;
			xx = xx / 10;
		}
		if (y == x)
			return true;
		return false;
	}

	public static void main(String[] args) {
		long maxim = 0;

		for (int i = 10; i <= 99; i++)
			for (int j = 10; j <= 99; j++) {
				long produs = i * j;
				if (palindrom(produs) && maxim < produs)
					maxim = produs;
			}
		System.out.println("Maximul pt 2 cife este :" + maxim);

		maxim=0;
		for (int i = 100; i <= 999; i++)
			for (int j = 100; j <= 999; j++) {
				long produs = i * j;
				if (palindrom(produs) && maxim < produs)
					maxim = produs;
			}
		System.out.println("Maximul pt 3 cifee este :" + maxim);
		
		maxim=0;
		for (int i = 1000; i <= 9999; i++)
			for (int j = 1000; j <= 9999; j++) {
				long produs = i * j;
				if (palindrom(produs) && maxim < produs)
					maxim = produs;
			}
		System.out.println("Maximul pt 4 cifee este :" + maxim);
	}

}
