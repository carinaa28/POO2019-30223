
public class Lucrator {
	private String nume;
	private CalendarLucru calendar;

	public Lucrator(String nume, CalendarLucru calendar) {
		this.nume = nume;
		this.calendar = calendar;
	}

	public void lucreaza(String zi) throws ExceptieZiNelucratoare, Exception {
		for (int i = 0; i < 7; i++) {

			Zi ziua = calendar.getDayAt(i);

			if (ziua.getNume().equals(zi))
				if (ziua.isLucratoare() == true) {
					System.out.println("Lucratorul " + nume + " lucreaza " + zi);
					return;
				} else
					throw new ExceptieZiNelucratoare(zi + " nu este lucratoare");

		}

		throw new Exception("nu exista ziua " + zi);

	}
}
