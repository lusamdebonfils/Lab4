package prog4_3.employeeinfo;

public enum AccountType {

	CHECKING("checking"),

	SAVINGS("saving"),

	RETIREMENT("retirement");

	private String accountInfo;

	public String getAccountInfo() {
		return accountInfo;
	}

	private AccountType(String accountInfo) {
		this.accountInfo = accountInfo;
	}

}
