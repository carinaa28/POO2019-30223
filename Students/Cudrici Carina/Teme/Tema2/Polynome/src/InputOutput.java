import java.util.Formatter;

public class InputOutput {	

	public static void main(String[] args) {
		

	Polynome p1 = new Polynome(9, new int[] { 5, -4, 2, 0, -2, 3, 0, 3, -17 });
	Polynome p2 = new Polynome(4, new int[] { 4, -2, 0, 1 });
	
	p1.printPolynome();
	p2.printPolynome();

	Polynome s = Functions.sum(p1, p2);
	Polynome d = Functions.substract(p1, p2);
	Polynome m = Functions.multiply_scal(p2, 3);
	Polynome mu= Functions.multiply(p1,p2);
	int e2 = Functions.eval_x(p2, 2);

	s.printPolynome();
	d.printPolynome();
	m.printPolynome();
	mu.printPolynome();
	System.out.println(e2);
}

}
