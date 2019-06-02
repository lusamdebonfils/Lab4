package prog4_3.employeeinfo;

import java.time.LocalDate;

public class Employee {

	private AccountList accounts;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		accounts = new AccountList();

	}

	public void createNewChecking(double startAmount) {
		
		Account checkingAcct = new CheckingAccount(this, startAmount);
		accounts.add(checkingAcct);
	}

	public void createNewSavings(double startAmount) {
		
		Account savingsAcct = new SavingAccount(this, startAmount);
		accounts.add(savingsAcct);		
	}

	public void createNewRetirement(double startAmount) {
		
		Account retirementAcct = new RetirementAccount(this, startAmount);
		accounts.add(retirementAcct);	
	}

	public String getFormattedAcctInfo() {
		
		String result = "";
		for(int i = 0; i < accounts.size(); i++) {
			Account selected = accounts.get(i);
			result += selected.toString();
		}
		return result;
	}
	
	public void deposit(int accountIndex, double amt){
		
		Account selected = accounts.get(accountIndex);
		selected.makeDeposit(amt);
	}
	
	public boolean withdraw(int accountIndex, double amt){
		
		Account selected = accounts.get(accountIndex);
		if(selected.makeWithdrawal(amt)) {
			return true;
		}
		System.out.println("Withdraw cannot be completed now due to Insufficent Funds!! ");
		return false;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

}
