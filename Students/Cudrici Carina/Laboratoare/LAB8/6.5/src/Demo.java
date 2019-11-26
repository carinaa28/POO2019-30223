
public class Demo {

	public static void main(String[] args) {

		try {
			throw new Exceptie("exceptia mea");
		} catch (Exceptie e) {
			System.out.println(e);
		}
	}

}
