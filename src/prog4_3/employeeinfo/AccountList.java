package prog4_3.employeeinfo;

public class AccountList {

	private final int INITIAL_LENGTH = 50;
	private Account[] accountsArray; 
	private int size;
	
	public AccountList() {
		accountsArray = new Account[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Account account){
		resize();
		accountsArray[size++] = account;
		
	}
	
	public Account get(int i){
		if(i < 0 || i >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return accountsArray[i];
	}
	
	public boolean find(Account account){
		for(int i = 0; i < size; ++i) {
			if(accountsArray[i].equals(account)) {
				return true;
			}
		}
		return false;
	}
	
	public void insert(Account account, int pos){
		
		if(pos < 0 || pos > size) throw new ArrayIndexOutOfBoundsException();
		resize();
		for(int i = size; i > pos; i--) {
			accountsArray[i] = accountsArray[i-1];
		}
		accountsArray[pos] = account;
		size++;
	}
	
	public boolean remove(Account account){
		for(int i = 0; i < size; i++) {
			if(accountsArray[i].equals(account)) {
				for(int j = i; j < size - 1; j++ ) {
					accountsArray[j] = accountsArray[j + 1];
				}
				size--;
				return true;
			}	
		}
		return false;
	}
	
	
	private void resize(){
		
		int currentCapacity = accountsArray.length;
		
		if(currentCapacity == size) {
			System.out.println("Resizing...");
			currentCapacity *= 2;
			
			Account[] newArray = new Account[currentCapacity];
			
			System.arraycopy(accountsArray, 0, newArray, 0, accountsArray.length);
			
			accountsArray = newArray.clone();
			
			//strArray = Arrays.copyOf(strArray, currentCapacity);
		}
	}
	/*
		public String toString(){
			String result = "";
			for(int i = 0; i < size; i++) {
				result += accountsArray[i];
				if(i < size - 1) {
					result += ", ";
				}
			}
			return "["+ result + "]";
		}
	*/
	public int size() {
		return size;
	}
	
}
