
public class TestBank {

	public static void main(String[] args) {
		
	Account[] a= new Account[]{ 
				new SavingsAccount(1,3), new SavingsAccount(2,5),
				new CurrentAccount(3,150), new CurrentAccount(4,600) };
	
	a[0].deposit(1000);
	a[1].deposit(500);
	a[2].deposit(10);
	a[3].deposit(800);
	
	a[0].withdraw(100);
	
	
		Bank bank = new Bank(4, a);	
        bank.update();
	
	}

}
