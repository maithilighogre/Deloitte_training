package lab5;
import java.util.Scanner;
public class EmpClassApplication {
	
	public static void checkName(EmpClass emp) throws NullNameException{
		if(emp.getFirstName().isEmpty()&&emp.getLastName().isEmpty()){
			throw new NullNameException("Firat and Last NAme cannot be null");
		}
		else if(emp.getFirstName().isEmpty()||emp.getFirstName().equals(" ")){
			throw new NullNameException("First Name cannot be null");
		}
		else if(emp.getLastName().isEmpty()||emp.getLastName().equals(" ")){
			throw new NullNameException("Last Name cannot be null");
		}
		else 
			return;
	}
	
	public static boolean validateName(String n){
		n=n.toLowerCase();
	      char[] fc = n.toCharArray();
	      for (int i = 0; i < fc.length; i++) {
	         char ch = fc[i];
	         if (!(ch >= 'a' && ch <= 'z')) {
	            return false;
	         }
	      }
	      return true;
	}
	
	public static void main(String args[]){
		
		EmpClass emp0=new EmpClass("Monica"," ");
				
		try{
				EmpClassApplication.checkName(emp0);
				System.out.println("Checking if name is valid:\n");
				if(validateName(emp0.getFirstName()) && validateName(emp0.getLastName())){
					System.out.println("Employee name is valid\n\n");
				}
			}catch(NullNameException e){
			System.out.println(e);
		}
		
	}
}
