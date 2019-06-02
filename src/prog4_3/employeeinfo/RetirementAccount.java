package prog4_3.employeeinfo;

public class RetirementAccount extends Account {
	
	private final static double WITHDRAW_CHARGE = 2;

	public RetirementAccount(Employee emp, double balance) {
		super(emp, balance);
	}

	public RetirementAccount(Employee emp) {
		super(emp);	
	}

	@Override
	public AccountType getAccounType() {
		return AccountType.RETIREMENT;
	}

	@Override
	public String toString() {
		return "Account type: " + this.getAccounType().getAccountInfo() +"\n"
				+ "Current balance: " + this.getBalance()+"\n";
	}
	
	@Override
	public boolean makeWithdrawal(double amt) {
		double charge = amt * WITHDRAW_CHARGE/100;
		amt = amt + charge;
		if(super.makeWithdrawal(amt)) {
			return true;
		}
		return false;
	}

}
