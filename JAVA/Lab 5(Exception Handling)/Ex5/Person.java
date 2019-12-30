package lab5;

public class Person {
	String name;
	 int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void verifyApplication()throws PersonAgeException{
		if(age<15)
			throw new PersonAgeException("Age should be greater than 15");
		else
			System.out.println("Application registered successfully..");
	}
	public static void main(String[] args)
	{
		Person p1=new Person("Max",16);
		Person p2=new Person("Jack",19);
		try{
			p1.verifyApplication();
			p2.verifyApplication();
		}catch(PersonAgeException e)
		{
			System.out.println(e);
		}
		
	}	
}