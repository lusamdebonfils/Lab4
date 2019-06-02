package prog4_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	//private char[] sum;

	public static void main(String[] args) {

		//Professor references
		Professor prof1 = new Professor("Ruby Fiasco", 100000, 1920, 3, 18);
		Professor prof2 = new Professor("Corraza Paul", 140000, 1930, 4, 11);
		Professor prof3 = new Professor("Kedi Wagobs", 100000, 1990, 8, 28);
		//Setting publications to 10
		prof1.setNumberOfPublications(10);
		prof2.setNumberOfPublications(10);
		prof2.setNumberOfPublications(10);
		
		//Secretary references
		Secretary sec1 = new Secretary("Niyonshuti Moses", 100000,1930, 4, 11);
		Secretary sec2 = new Secretary("Nuwarinda Timothy", 100000, 1990, 8, 28);
		//Setting overtime hours to 200
		sec1.setOvertimeHours(200);
		sec2.setOvertimeHours(200);
		//Array of department employees
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = prof1;
		department[1] = prof2;
		department[2] = prof3;
		department[3] = sec1;
		department[4] = sec2;
		
		//Main myObj = new Main();
		double sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("If you wish to see sum of all employee salaries press \"Y\": ");
		String response = input.next();
		if(response.equals("y") || response.equals("Y")) {
			for(DeptEmployee employee : department) {
				sum += employee.computeSalary();
				//System.out.println(employee.getName() + " : "+ employee.computeSalary());
			}
			System.out.println("Sum of all salaries is : "+sum);
		}
		
	}


}
