public class TestDoubleMatrix {
	public static void main(String[] args) {
		// Creaza tablourile de intregi m1, m2
		Double[][] m1 = new Double[][] { { 1.1, 2.2, 3.3}, { 4.1, 5.2, 6.4 }, { 1.3, 1.3, 1.3 } };
		Double[][] m2 = new Double[][] { { 1.3, 1.7, 1.5 }, { 2.3, 2.7, 2.6 }, { 0.9, 0.9, 0.1 } };
		// Creaza o instanta de IntegerMatrix
		DoubleMatrix doubleMatrix = new DoubleMatrix();
		System.out.println("\nm1 + m2 is ");
		GenericMatrix.printResult(m1, m2, doubleMatrix.addMatrix(m1, m2), '+');
		System.out.println("\nm1 * m2 is ");
		GenericMatrix.printResult(m1, m2, doubleMatrix.multiplyMatrix(m1, m2), '*');
	}
}
