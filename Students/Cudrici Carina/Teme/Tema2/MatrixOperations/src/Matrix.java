import java.math.BigDecimal;

public class Matrix {

	public BigDecimal a[][];
	public int n;
	public int m;

	Matrix(int n, int m, BigDecimal[][] a) {
		this.n = n;
		this.m = m;
		this.a = new BigDecimal[n][m];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				this.a[i][j] = a[i][j];
	}

	Matrix(int n, int m) {
		this.n = n;
		this.m = m;
		this.a = new BigDecimal[n][m];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				this.a[i][j] = new BigDecimal("0");
	}

	public void printMatrix() {
		for (int i = 0; i < n; i++, System.out.println())
			for (int j = 0; j < m; j++)
				System.out.printf("%s ", a[i][j]);
		System.out.println();

	}

	public static Matrix add(Matrix a, Matrix b) {

		Matrix rezultat = new Matrix(a.n, a.m);

	
		for (int i = 0; i < a.n; i++)
			for (int j = 0; j < a.m; j++) {
				rezultat.a[i][j] = rezultat.a[i][j].add(a.a[i][j]);
				rezultat.a[i][j] = rezultat.a[i][j].add(b.a[i][j]);
			}
		return rezultat;
	}
	public static Matrix subtract(Matrix a, Matrix b) {

		Matrix rezultat = new Matrix(a.n, a.m);

		
		for (int i = 0; i < a.n; i++)
			for (int j = 0; j < a.m; j++) {
				rezultat.a[i][j] = rezultat.a[i][j].add(a.a[i][j]);
				rezultat.a[i][j] = rezultat.a[i][j].subtract(b.a[i][j]);
			}
		return rezultat;
	}

	public static Matrix multiplyScalar(Matrix a,BigDecimal x) {

		Matrix rezultat = new Matrix(a.n, a.m);

		for (int i = 0; i < a.n; i++)
			for (int j = 0; j < a.m; j++) {
				rezultat.a[i][j] = rezultat.a[i][j].add(a.a[i][j]);
				rezultat.a[i][j] = rezultat.a[i][j].multiply(x);
			}
		return rezultat;
	}
	public static BigDecimal determinant (Matrix a) {

		BigDecimal diagonala_principala= a.a[0][0];
		BigDecimal diagonala_secundara= a.a[0][1];
		
		diagonala_principala= diagonala_principala.multiply(a.a[1][1]);
		diagonala_secundara= diagonala_secundara.multiply(a.a[1][0]);
		
		return diagonala_principala.subtract(diagonala_secundara);
	
	}
	public static boolean areEqual(Matrix a, Matrix b) {

		for (int i = 0; i < a.n; i++)
			for (int j = 0; j < a.m; j++) 
				if (a.a[i][j].equals(b.a[i][j])==false) return false;
			
		return true;
	}

	public static boolean isZeroMatrix(Matrix a) {

		for (int i = 0; i < a.n; i++)
			for (int j = 0; j < a.m; j++) 
				if (a.a[i][j].equals(new BigDecimal("0"))==false) return false;
			
		return true;
	}
	
	public static double fillDegree(Matrix a) {
		
     double total =a.n*a.m;
     double diferite_de_0 =0;
		for (int i = 0; i < a.n; i++)
			for (int j = 0; j < a.m; j++) 
				if (a.a[i][j].equals(new BigDecimal("0"))==false) diferite_de_0++;
			
		return diferite_de_0/total*100;
	}
	public static void main(String[] args) {

		Matrix m1 = new Matrix(2, 2, new BigDecimal[][] { new BigDecimal[] { new BigDecimal("1"), new BigDecimal("3") },
				new BigDecimal[] { new BigDecimal("7"), new BigDecimal("10") } });

		Matrix m2 = new Matrix(2, 2, new BigDecimal[][] { new BigDecimal[] { new BigDecimal("9"), new BigDecimal("7") },
				new BigDecimal[] { new BigDecimal("0"), new BigDecimal("10") } });
		
		Matrix m3 = new Matrix(2, 2, new BigDecimal[][] { new BigDecimal[] { new BigDecimal("0"), new BigDecimal("0") },
			new BigDecimal[] { new BigDecimal("0"), new BigDecimal("0") } });
		
		Matrix s = add(m1, m2);
		Matrix d = subtract(m1, m2);
		Matrix ms = multiplyScalar(m1,new BigDecimal("123"));
		BigDecimal det= determinant(m1);
		
		s.printMatrix();
		d.printMatrix();
		ms.printMatrix();
		
		System.out.println(det);
		System.out.println(areEqual(m1,m2));
		System.out.println(isZeroMatrix(m3));
		System.out.println(fillDegree(m2));

	}

}
