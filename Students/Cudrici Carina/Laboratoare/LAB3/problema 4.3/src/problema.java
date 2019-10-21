
public class problema {

	public static void main(String[] args) {
	
		String a= "Carina Cudrici ";
		int consoane=0;
		int vocale=0;
		
		for(int i=0 ;i< a.length();i++)
			if((a.charAt(i)>='a' && a.charAt(i)<='z') || (a.charAt(i)>='A' && a.charAt(i)<'Z'))
				if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' 
						|| a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I'|| a.charAt(i)=='O'|| a.charAt(i)=='U')
					vocale ++;
				else consoane++;
		
		System.out.println(vocale);
		System.out.println(consoane);		

	}

}
