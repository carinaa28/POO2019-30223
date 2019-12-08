
public class Test {

	public static void main(String[] args) {
		FacebookAccount a= new FacebookAccount ("Carina Cudrici",19,"Cluuj");
		
		FacebookAccount b= new FacebookAccount ("Horia",20,"Cluuj");
		FacebookAccount c= new FacebookAccount ("Pica",20,"Cluuj");
		
		a.addFriend(b);
		a.addFriend(c);
		
		
System.out.println(a.FindFriends());		
System.out.println(a.FindFriends("Cluuj"));	
System.out.println(a);
	}

}
