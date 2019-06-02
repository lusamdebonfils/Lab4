package prog4_3.employeeinfo;

public class CheckingAccount extends Account {
	
	private final static double WITHDRAW_CHARGE = 5;
	
	CheckingAccount(Employee emp, double balance) {
		super(emp, balance);
	}
	CheckingAccount(Employee emp) {
		super(emp);
	}
	@Override
	public AccountType getAccounType() {
		return AccountType.CHECKING;
	}

	@Override
	public String toString() {
		return "Account type: " + this.getAccounType().getAccountInfo() +"\n"
				+ "Current balance: " + this.getBalance()+"\n";
	}
	
	@Override
	public double getBalance() {
		return super.getBalance() - WITHDRAW_CHARGE;
	}
	
}
