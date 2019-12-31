package jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class StatementPreparedStatementDemo {
	Scanner sc=new Scanner(System.in);
	Connection con;
	Statement stat;
	int AId=1;
	String firstName, middleName, lastName, phone;
	PreparedStatement pre;
	
	public StatementPreparedStatementDemo()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system","seed1234");
			System.out.println("connected....");
			
			System.out.println("Enter first name:");
			firstName=sc.next();
			System.out.println("Enter middle name:");
			middleName=sc.next();
			System.out.println("Enter last name:");
			lastName=sc.next();
			System.out.println("Enter Contact no:");
			phone=sc.next();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void insertStatement()

	{
		try
		{
			stat=con.createStatement();
			int ra=stat.executeUpdate("insert into student1 values("+AId+",'"+firstName+"','"+middleName+"','"+lastName+"','"+phone+"')");
			if(ra>0)
				System.out.println("Record Inserted...");
			else
				System.out.println("Record Not Inserted...");
				
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void insertPreStatement(){
		try
		{
			pre=con.prepareStatement("insert into student1 values(?,?,?,?,?)");
			pre.setInt(1, AId);			
			pre.setString(2,firstName);
			pre.setString(3,middleName);
			pre.setString(4,lastName);
			pre.setString(5,phone);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Record Inserted...");
			else
				System.out.println("Record Not Inserted...");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		StatementPreparedStatementDemo s=new StatementPreparedStatementDemo();
		//s.insertStatement();
		s.insertPreStatement();
	}

}
