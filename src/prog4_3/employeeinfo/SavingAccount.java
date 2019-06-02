package prog4_3.employeeinfo;

public class SavingAccount extends Account {
	
	private final static double INTEREST_RATE = 0.25;
	
	public static double getInterestRate() {
		return INTEREST_RATE;
	}

	public SavingAccount(Employee emp, double balance) {
		super(emp, balance);
	}

	public SavingAccount(Employee emp) {
		super(emp);
	}

	@Override
	public AccountType getAccounType() {
		return AccountType.SAVINGS;
	}
	
	@Override
	public String toString() {
		return "Account type: " + this.getAccounType().getAccountInfo() +"\n"
				+ "Current balance: " + this.getBalance()+"\n";
	}
	
	@Override
	public double getBalance() {
		
		double baseBalance = super.getBalance();
		double intrest = baseBalance * (INTEREST_RATE/100);
		return baseBalance + intrest;
	}
	
	

}
