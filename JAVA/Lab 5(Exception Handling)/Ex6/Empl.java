package lab5;

public class Empl {
	int eId;
	 String name;
	 int salary;
	 
	public Empl(int eId, String name, int salary) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}
	public void verifyApplication()throws EmpException{
		if(salary<3000)
			throw new EmpException("Salary should be greater than 3000");
		else
			System.out.println("Application registered successfully");
	}
	public static void main(String[] args)
	{
		Empl p1=new Empl(1,"asd",16000);
		Empl p2=new Empl(2,"asf",19);
		try{
			p1.verifyApplication();
			p2.verifyApplication();
		}catch(EmpException e)
		{
			System.out.println(e);
		}
		
	}	
}
