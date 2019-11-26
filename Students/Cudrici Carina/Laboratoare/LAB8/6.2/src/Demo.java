
public class Demo {

	public static void main(String[] args) {
		try {
		Object a = null;
		a.getClass();
		}
		catch(NullPointerException e)
		{
			System.out.println("a aparut o exceptie");
		}
	}

}
