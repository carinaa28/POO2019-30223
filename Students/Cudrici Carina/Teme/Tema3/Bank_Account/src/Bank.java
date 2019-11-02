
public class Bank {
	private Account[] array;
	private int arrayDim;

	public Bank( int arrayDim,Account[] array) {

		this.array = array;
		this.arrayDim = arrayDim;
	}

	void update() {
		for (int i = 0; i < arrayDim; i++) {
			if (array[i] instanceof SavingsAccount) {
				((SavingsAccount) array[i]).addInterest();
				 System.out.println(array[i].toString());
			}
			if (array[i] instanceof CurrentAccount) { 
				System.out.printf(array[i].toString());
				if (array[i].getBalance() < ((CurrentAccount) array[i]).getOverdraftLimit())
					    System.out.println("  OVERDRAFT !");

			}
		}
		
		
	}

}
