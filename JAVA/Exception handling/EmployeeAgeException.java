
public class EmployeeAgeException extends Exception{
	private String msg;
	public EmployeeAgeException(){
		
	}
	public EmployeeAgeException(String msg){
		this.msg=msg;
	}
	public String toString(){
		if(msg==null)
			return "Age must be above 18 to accept any individual account request...";
		else
			return msg;
	}
}
