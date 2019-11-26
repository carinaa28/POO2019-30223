
public class Demo {
	
	public static void f() throws Exceptie2  {
		try {
			g();
		} catch (Exceptie1 e) {
			e.printStackTrace();
			throw new Exceptie2("exceptie2");
		}
	}
	public static void g() throws Exceptie1 {
		throw new Exceptie1("exceptie1");
	}
	
	public static void main(String[] args)  {
		try {
			f();
		} catch (Exceptie2 e) {
			
			e.printStackTrace();
		}

	}

}
