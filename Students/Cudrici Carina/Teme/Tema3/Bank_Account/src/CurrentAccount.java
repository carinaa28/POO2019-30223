
public class CurrentAccount  extends Account {
	private int overdraftLimit;

	public CurrentAccount(int number,int overdraftLimit) {
		super(number);
		this.overdraftLimit=overdraftLimit;
	}
	
	
	public int getOverdraftLimit() {
		return overdraftLimit;
	}


	public void withdraw(double sum) {
		if (sum > 0 && balance-sum>=overdraftLimit) {
			balance -= sum;
		} else {
			System.err.println("Account.withdraw(...): cannot withdraw negative amount.");
		}
	}
	
	public String toString() {
		return "Account " + number + ": " + "balance = " + balance+ ",overdraft limit= "+overdraftLimit;
	}

}
