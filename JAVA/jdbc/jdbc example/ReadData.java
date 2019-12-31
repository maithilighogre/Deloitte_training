

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {
	Connection con;
	Statement stat;
	ResultSet res;
	
	// Establishes Connection to Database.
	public ReadData()


	{
		try
		{
			// Loads required driver class from jdbc.jar in JRE 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Establishes connection to given URL of Database using Provided Credentials
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Database Connected....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void getData()
	{
		try 
		{
			// Creates query object for database connected through con object
			stat=con.createStatement();
			//Executes SQL Select Query and returns data as ResultSet Object
			res=stat.executeQuery("select * from emp");
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	public void printData()
	{
		try
		{
			while(res.next())
			{
				System.out.println(res.getInt("EMPLOYEE_ID"));
				System.out.println(res.getString("FIRST_NAME"));
				System.out.println(res.getString("LAST_NAME"));
				System.out.println(res.getInt("SALARY"));
				System.out.println(res.getInt("DEPARTMENT_ID"));
				System.out.println("===============================");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ReadData rd=new ReadData();
		rd.getData();
		rd.printData();

	}

}
