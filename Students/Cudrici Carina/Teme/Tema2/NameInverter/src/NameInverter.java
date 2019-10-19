public class NameInverter {

	public static String invert(String str) {

		if (str == null)
			return null;

		String FirstName = "";
		String LastName = "";
		String MrMrs = "";
		String Phd = "";

		String[] words = str.split(" ");

		for (String word : words) {

			if (word.equals(""))
				continue;
			if (word.equals("Mr."))
				MrMrs = "Mr. ";
			else if (word.equals("Mrs."))
				MrMrs = "Mrs.";
			else if (word.equals("Phd."))
				Phd = "Phd. ";
			else if (FirstName.equals(""))
				FirstName = word + " ";
			else if (LastName.equals(""))
				LastName = word + ", ";
		}

		return (LastName + FirstName + MrMrs + Phd).trim();

	}

	public static void main(String[] args) {

		System.out.println(invert("Mr. Phd. FirstName LastName "));
		System.out.println(invert("Mr. FirstName LastName"));
		System.out.println(invert("FirstName LastName"));
		System.out.println(invert("  SingleWord "));
		System.out.println(invert(""));
		System.out.println(invert(null));

	}

}
