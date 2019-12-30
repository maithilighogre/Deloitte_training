package lab5;
public class NullNameException extends Exception{
	private String msg;
	public NullNameException(){
		
	}
	public NullNameException(String msg){
		this.msg=msg;
	}
	public String toString(){
		if(msg==null)
			return "Name value cannot be null";
		else
			return msg;
	}

}
