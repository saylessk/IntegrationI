public class BankAccount {
	private double balance;
	
	public void setBalance (double balance) {
		if (balance < 0) {
			throw new IllegalArgumentException();
		}
		this.balance = balance;
	}

}
