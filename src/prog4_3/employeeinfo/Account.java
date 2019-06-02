package prog4_3.employeeinfo;

public class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type: " + acctType.getAccountInfo() +"\n"
				+ "Current balance: " + balance+"\n";
	}

	public void makeDeposit(double deposit) {
		// implement
		balance = balance + deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// implement
		if(balance >= amount) {
			balance = balance - amount;
			return true;
		}
		return false;
	}
	public double getBalance() {
		return balance;
	}
	public AccountType getAccounType() {
		return acctType;
	}
}
