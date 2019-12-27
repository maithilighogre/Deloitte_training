package emp;

import java.util.Arrays;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee []employees=new Employee[9];
		
		employees[0]=new Employee(101,"Gargesh","BTA");
		employees[1]=new Employee(123,"Uttam","AA");
		employees[2]=new Employee(161,"Neel","CSI");
		employees[3]=new Employee(111,"Garry","BTA");
		employees[4]=new Employee(153,"Pam","AA");
		employees[5]=new Employee(167,"Neelima","CSI");
		employees[6]=new Employee(181,"Oliver","BTA");
		employees[7]=new Employee(121,"Monica","AA");
		employees[8]=new Employee(166,"Jack","CSI");
		Arrays.sort(employees);
		for(int i=0;i<employees.length;i++)
			System.out.println(employees[i]);	

	}
}
