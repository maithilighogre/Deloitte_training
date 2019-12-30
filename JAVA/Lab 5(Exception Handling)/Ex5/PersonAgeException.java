package lab5;

public class PersonAgeException extends Exception {
	private String msg;
	public PersonAgeException()
	{
	}
	public PersonAgeException(String msg)
	{
		this.msg=msg;
	}
	public String toString(){
		if(msg==null)
				return "Age must be above 15...";
		else
			return msg;
	}
}
