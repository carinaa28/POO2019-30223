
public class Demo {
	
	public static void main(String[] args)
	{
		
		try {
			throw new Exception("ioi de mine");
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("Finally");
			
		}
		
	}

}
