
public class MainContoller {

	public static void main(String[] args) {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1;

		try {
			speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
			Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
			System.out.printf("We have an animal with %d legs! \n", a1.getNrOfLegs());

			Animal[] animals = new Animal[3];
			Caretaker[] caretakers = new Caretaker[3];

			animals[0] = new Bird();
			animals[1] = new Fish();
			animals[2] = new Dolphin();

			caretakers[0] = new Caretaker();
			caretakers[1] = new Caretaker();
			caretakers[2] = new Caretaker();

			for (int i = 0; i < 3; i++)
				for (int j = 0; j < 3; j++)
					if (caretakers[i].getIsDead() == false && animals[j].isTakenCareOf() == false) {

						String result = caretakers[i].takeCareOf(animals[j]);
						if (result.equals(Constants.Employees.Caretakers.TCO_KILLED))
							caretakers[i].setIsDead(true);

						else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME))
							continue;
						else
							animals[j].setTakenCareOf(true);
					}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
