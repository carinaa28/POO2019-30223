package problema1;


public class Prime {

	public static int prim(int x) {
		if (x == 1 || x == 0)
			return 0;
		for (int d = 2; d <= x / 2; d++)
			if (x % d == 0)
				return 0;
		return 1;
	}

	public static void main(String[] args) {

		int n = 50;
		int m = 70;
		int[] a = new int[1000];
		int[] b = new int[1000];

		for (int i = 2; i <= 100; i++)
			for (int j = 2; j <= 100; j++)
				if (prim(i) == 1 && prim(j) == 1) {
					a[i + j] = i;
					b[i + j] = j;
				}

		for (int i = n; i <= m; i++)
			if (i % 2 == 0)
				System.out.println(i + "=" + a[i] + "+" + b[i]);

	}

}
