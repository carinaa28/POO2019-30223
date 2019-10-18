
public class Mainclass {
	


	public static void main(String[] args) {
	
		int x=1,y=2,z=x+y;
		int suma=2;
	
		
		while(z<=4000000)
		{ x=y;
          y=z;
          z=x+y;
          if(z%2==0) suma+=z;
        }
		
      System.out.println(suma);
	

	}

}
