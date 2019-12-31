package jdbc2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AddAuthor {

	Connection con;
	PreparedStatement pre;
	Statement stat;
	ResultSet res;
	int AId=1;
	String firstName, middleName, lastName, phone;
	
	public AddAuthor()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Database Connected....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void insert()


	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first name:");
			firstName=sc.next();
			System.out.println("Enter middle name:");
			middleName=sc.next();
			System.out.println("Enter last name:");
			lastName=sc.next();
			System.out.println("Enter Contact no:");
			phone=sc.next();
			
			pre=con.prepareStatement("insert into author values(?,?,?,?,?)");
			pre.setInt(1, AId);			
			pre.setString(2,firstName);
			pre.setString(3,middleName);
			pre.setString(4,lastName);
			pre.setString(5,phone);
			AId++;
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Author Details Committed..");
			else
				System.out.println("Author Details are Not Committed..");
			sc.close();
			pre.close();
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void printAuthorDetails()

	{
		try
		{
			stat=con.createStatement();
			res=stat.executeQuery("select * from author");
			while(res.next())
			{
				System.out.println("ID: "+res.getInt("AId"));
				System.out.println("Name: "+res.getString("firstName")+" "+res.getString("middleName")+" "+res.getString("lastName"));
				System.out.println("Phone No: "+res.getLong("phone"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateAuthorDetails()


	{
		try
		{
			pre=con.prepareStatement("update author set firstName=? where AId=?");
			pre.setString(1, "ghanu");
			pre.setInt(2,679);
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Name updated for author id 111");
			else
				System.out.println("Name is not updated..");
			pre.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteAuthorDetails()

	{
		try
		{
			pre=con.prepareStatement("delete from author where AId=?");
			pre.setInt(1,111);
			
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Record Deleted...");
			else
				System.out.println("Record has not Deleted...");
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		AddAuthor uttam=new AddAuthor();
		uttam.insert();
		uttam.printAuthorDetails();
		System.out.println("=======================================================");
		uttam.updateAuthorDetails();
		uttam.printAuthorDetails();
		uttam.deleteAuthorDetails();
		uttam.printAuthorDetails();
	}

}
