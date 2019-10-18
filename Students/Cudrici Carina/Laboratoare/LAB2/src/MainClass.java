
import java.math.BigInteger;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

//		try {
//			String value = "1.2";
//		//	int intNr = Integer.parseInt(value);
//			double doubleNr = Double.parseDouble(value);
//		} catch (NumberFormatException e) {
//			System.out.println("exceptie");
//		}

//		Integer value1=new Integer(10);
//		Integer value2=new Integer(10);
//		
//		if(value1==value2) System.out.println("sunt egale cu ==");
//	                 	else  System.out.println(" nu sunt egale cu ==");
//		if(value1.equals(value2)) System.out.println("sunt egale cu equals");
//     	               else  System.out.println(" nu sunt egale cu equals");
	

		
//		Scanner scanner= new Scanner(System.in);
//		String nume=scanner.nextLine();
//		System.out.println(nume);
		
//		System.out.println(Integer.MAX_VALUE+1);
//		System.out.println(Integer.MIN_VALUE-1);
//		System.out.println(Float.MAX_VALUE+1);
//     	System.out.println(Float.MIN_VALUE-1);
		
		
		BigInteger suma,termen;
		suma = BigInteger.valueOf(0); 
		termen = BigInteger.valueOf(1); 
		
		for(int i=0;i<64;i++)
		{
	   suma.add(termen);
	   termen.multiply(BigInteger.valueOf(2) );
	     }
		
		System.out.println(suma);
	}
}
