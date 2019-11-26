import javax.swing.Spring;

public class MainClass {
	public static void main(String[] args) {
		Lucrator l = new Lucrator("ion", new CalendarLucru());

		try {
			l.lucreaza("Luni");

		} catch (Exception e) {
			System.out.println(e);
		}

		try {

			l.lucreaza("Marte");

		} catch (Exception e) {
			System.out.println(e);
		}

		try {

			l.lucreaza("Duminica");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
