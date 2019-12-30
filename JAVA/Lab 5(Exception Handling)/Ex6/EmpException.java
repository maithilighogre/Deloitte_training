package lab5;

public class EmpException extends Exception{
	private String msg;
	public EmpException()
	{
	}
	public EmpException(String msg)
	{
		this.msg=msg;
	}
	public String toString(){
		if(msg==null)
				return "Salary should be greater than 3000";
		else
			return msg;
	}
}
