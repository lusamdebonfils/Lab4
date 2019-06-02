package prog4_3;

import java.util.Scanner;

import prog4_3.employeeinfo.Employee;


public class Main {
	
	Employee[] emps = null;
	
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
				
		Scanner sc = new Scanner(System.in);
		makeSelection();
		String answer = sc.next();
		if(answer.equalsIgnoreCase("A")){

		}
		else if (answer.equalsIgnoreCase("B")){
			
			
		}else if(answer.equalsIgnoreCase("C")) {
			
			
		}else {
			
		}
	}

	public static void main(String[] args) {
		new Main();
	}
	
	public static void makeSelection() {
		System.out.print(""
				+ "A. See a report of all accounts.\n"
				+ "B. Make a deposit.\n"
				+ "C. Make a withdrawal.\n"
				+"Make a selection (A/B/c) : "
				);
	}
	
	
}
