
public class SavingsAccount extends Account {
	private double interest; //dobanda

	public SavingsAccount(int number, int interest) {
		super(number);
		this.interest=interest;
	}

	public double getInterest() {
		return interest;
	}


	public void addInterest() {
		if (interest > 0) {
			balance += interest;
		} else {
			System.err.println("SavingsAccount.addInterest(...): interest cannot be negative.");
		}
	}

	public String toString() {
		return "Account " + number + ": " + "balance = " + balance+ ",interest= "+ interest;
	}

}
