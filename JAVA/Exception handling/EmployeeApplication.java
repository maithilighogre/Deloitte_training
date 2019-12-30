import java.util.Scanner;
import java.util.Arrays;
public class EmployeeApplication {
	static Employee b[]=new Employee[10];
	static int index;

	public static void addEmp(Employee emp) throws EmployeeIndexException, EmployeeAgeException
	{
		if(emp.getAge()< 18)
			throw new EmployeeAgeException("Age must be greater than 18");
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==null)
			{
				b[i]=emp;
				index++;
				return;
			}
		}
		throw new EmployeeIndexException(" Space full!");
	}
	public static void main(String args[]){
		EmployeeApplication b[]=new EmployeeApplication[5];
		Scanner sc=new Scanner(System.in);
		Employee b1=new Employee(101,"Uttam","BTA",22);
		Employee b2=new Employee(102,"Yami","HR",12);
		System.out.println("Enter new Employee details(0 or 1)");
		int c=sc.nextInt();
		try{
			if(c==1){
				System.out.println("Enter Details:\n1.Employee Id:");
				int id=sc.nextInt();
				System.out.println("\n2.Name:");
				String name=sc.next();
				System.out.println("\n3.Designation:");
				String des=sc.next();
				System.out.println("\n4.Age:");
				int age=sc.nextInt();
				Employee b3=new Employee(id,name,des,age);
				addEmp(b3);
				System.out.println("Successfully Added");
			}
			index++;
			}
			catch(EmployeeAgeException e){
				System.out.println(e);
			}
			catch(EmployeeIndexException e){
				System.out.println(e);
			}
	}
}
