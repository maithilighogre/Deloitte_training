package User;
import java.sql.*;

public class UserDAO {

	Connection con;
	PreparedStatement pstmt;
	CallableStatement cstmt;
	ResultSet rs;

	public UserDAO()
	{
		try{
			Class.forName("jdbc.oracle.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("connection successful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public int insertUser(User user1)
	{
		int ra=0;
		try{
			pstmt=con.prepareStatement("insert into users values(?,?,?)");
			pstmt.setString(1, user1.getLoginId());
			pstmt.setString(2, user1.getPassword());
			pstmt.setString(3, user1.getEmail());
			ra=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ra;
	}
	
	public int updateUser(User user2){
		int ra=0;
		try{
			pstmt=con.prepareStatement("update users set password=?,email=? where loginId=?");
			pstmt.setString(3, user2.getLoginId());
			pstmt.setString(1, user2.getPassword());
			pstmt.setString(2, user2.getEmail());
			ra=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ra;
	}
	
//	public int deleteUser(String loginId)
//	{
//		int ra=0;
//		try{
//			pstmt=con.prepareStatement("delete from  user1  where loginId=?");
//			pstmt.setString(1,loginId);
//			ra=pstmt.executeUpdate();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		return ra;
//	}
//	
	public ResultSet retriveUsers(String loginId)
	{
		try
		{
			
			pstmt=con.prepareStatement("select * from users where loginId=?");
			pstmt.setString(1,loginId);
			rs=pstmt.executeQuery();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	
	public boolean validateUser(User u3)
	{
		boolean flag=false;
		try
		{
			
			pstmt=con.prepareStatement("select * from users");
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				if(rs.getString("loginId")==u3.getLoginId() && rs.getString("password")==u3.getPassword())
					flag=true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
}
