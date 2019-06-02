package prog4_3.employeeinfo;

public abstract class Account {

	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;

	Account(Employee emp, double balance) {
		employee = emp;
		this.balance = balance;
	}
	Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}
	
	public void makeDeposit(double deposit) {
		balance = balance + deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(balance > amount) {
			balance = balance - amount;
			return true;
		}
		return false;
	}
	public double getBalance() {
		return balance;
	}

	public abstract AccountType getAccounType();
	public abstract String toString();

}
