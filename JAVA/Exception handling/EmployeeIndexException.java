
public class EmployeeIndexException extends Exception{
	private String msg;
	public EmployeeIndexException(){
		
	}
	public EmployeeIndexException(String msg){
		this.msg=msg;
	}
	public String toString(){
		if(msg==null)
			return "Cannot add more than 10";
		else
			return msg;
	}
}
