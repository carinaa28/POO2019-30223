
public class Test {

	public static void main(String[] args)
	{
		Pet a= new Pet("Coditza",14);
		Pet b= new Pet("Tobii",4);
		Pet c= new Pet("Codobitza",3);
		PetHotel hotel=new PetHotel();
		hotel.addPet(a);
		hotel.addPet(b);
		hotel.addPet(c);
		hotel.deletePet(b);
		
		hotel.printList();
		
		
	}
	
}
