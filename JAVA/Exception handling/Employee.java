
import java.util.*;

public class Employee implements Comparable{
	private int eId;
	private String eName;
	private String designation;
	int age;
	
	
	public Employee(int eId, String eName, String designation,int age) {
		this.eId = eId;
		this.eName = eName;
		this.designation = designation;
		this.age=age;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getdesignation() {
		return designation;
	}
	public void setdesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Employee s=(Employee)o;
		String d1=s.getdesignation();
		String d2=this.getdesignation();
		
		return d1.compareTo(d2);
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", designation=" + designation + ", age=" + age + "]";
	}
}
