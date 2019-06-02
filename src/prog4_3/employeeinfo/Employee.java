package prog4_3.employeeinfo;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);

	}

	
	public void createNewChecking(double startAmount) {
		// implement
		checkingAcct = new Account(this, AccountType.CHECKING ,startAmount);
		
	}

	public void createNewSavings(double startAmount) {
		// implement
		savingsAcct = new Account(this, AccountType.SAVINGS ,startAmount);
		
	}

	public void createNewRetirement(double startAmount) {
		// implement
		retirementAcct = new Account(this, AccountType.RETIREMENT ,startAmount);
	}

	public String getFormattedAcctInfo() {
		// implement
		String result = "";
		if(checkingAcct!= null  && checkingAcct.getAccounType().equals(AccountType.CHECKING)) {
			result += checkingAcct.toString(); 
		}
		if(savingsAcct!= null && savingsAcct.getAccounType().equals(AccountType.SAVINGS)) {
			result += savingsAcct.toString(); 
		}
		if(retirementAcct!= null && retirementAcct.getAccounType().equals(AccountType.RETIREMENT)){
			result += retirementAcct.toString(); 
		}
		return result;
	}
	public void deposit(AccountType acctType, double amt){
		switch (acctType) {
		case CHECKING:
			checkingAcct.makeDeposit(amt);
			break;
		case SAVINGS:
			savingsAcct.makeDeposit(amt);
			break;
		case RETIREMENT:
			retirementAcct.makeDeposit(amt);
			break;
		default:
			break;
		}
	}
	public boolean withdraw(AccountType acctType, double amt){
		if(acctType.equals(AccountType.CHECKING)) {
			return checkingAcct.makeWithdrawal(amt);
		}else if(acctType.equals(AccountType.SAVINGS)) {
			return savingsAcct.makeWithdrawal(amt);
		}else {
			return retirementAcct.makeWithdrawal(amt);
		}
		
	}


	public String getName() {
		return name;
	}


	public LocalDate getHireDate() {
		return hireDate;
	}

}
