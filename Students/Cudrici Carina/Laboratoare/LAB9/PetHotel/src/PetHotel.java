import java.util.ArrayList;

public class PetHotel {

	private ArrayList<Pet>  pets =new ArrayList<Pet>();
	
	void addPet(Pet a)
	{
		pets.add(a);
		
	}
	void deletePet(Pet a)
	{
		pets.remove(a);
		
	}
	
	void printList()
	{
		for(Pet i: pets)
		{
			System.out.println(i);
		}
	}
	
}
