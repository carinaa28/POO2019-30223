import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		Persoana[] persoana = new Persoana[4];
		persoana[0] = new Persoana("ABC","ASD", 6);
		persoana[1] = new Persoana("QWER", "WERT", 8);
		persoana[2] = new Persoana("ASDF", "ZXC", 9);
		persoana[3] = new Persoana("ZXC", "ASDF", 5);
		Arrays.sort(persoana);
		for (int i = 0; i <= 3; i++)
			System.out.println(persoana[i]);

	}

}