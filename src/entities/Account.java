package entities;

public class Account {
	private String name;
	private int accountNumber;
	private Double accountBalance;

	public Account(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.accountBalance = 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}


	public Double getAccountBalance() {
		return accountBalance;
	}

	public void Deposit(Double amountToBeDeposited) {
		accountBalance += amountToBeDeposited;
		System.out.println("Updated data: ");
		System.out.println("Account: " + accountNumber + ", " + "Holder: " + name + ", Balance: " + accountBalance);
	}
	
	public void InitialDeposit(Double amountToBeDeposited) {
		accountBalance += amountToBeDeposited;		
	}

	public void Withdraw(Double withdrawAmount) {
		accountBalance -= (withdrawAmount + 5);
		System.out.println("Updated data: ");
		System.out.println("Account: " + accountNumber + ", " + "Holder: " + name + ", Balance: " + accountBalance);
	}

	public String toString() {
		 System.out.println("Account: " + accountNumber + ", " + "Holder: " + name + ", Balance: " + accountBalance);
		 return null;
	}
}
