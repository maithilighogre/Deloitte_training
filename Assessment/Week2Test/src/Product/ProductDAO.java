package Product;
import java.sql.*;

public class ProductDAO {
	Connection con;
	PreparedStatement pstmt;
	CallableStatement cstmt;
	ResultSet rs;

	public ProductDAO()
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
	
	public int insertProduct(Product p1)
	{
		int ra=0;
		try{
			pstmt=con.prepareStatement("insert into products values(?,?,?,?)");
			pstmt.setString(1, p1.getId());
			pstmt.setString(2, p1.getName());
			pstmt.setInt(3, p1.getPrice());
			pstmt.setString(4, p1.getCategory());
			ra=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ra;
	}
	
	public int updateProduct(Product p2){
		int ra=0;
		try{
			pstmt=con.prepareStatement("update products set id=?,name=?,price=?,category=? where id=?");
			pstmt.setString(1, p2.getId());
			pstmt.setString(2, p2.getName());
			pstmt.setInt(3, p2.getPrice());
			pstmt.setString(4, p2.getCategory());
			ra=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ra;
	}
	
	public int deleteProduct(String id)
	{
		int ra=0;
		try{
			pstmt=con.prepareStatement("delete from  products  where id=?");
			pstmt.setString(1,id);
			ra=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ra;
	}
	
	public ResultSet getProduct(String id)
	{
		try
		{
			
			pstmt=con.prepareStatement("select * from products where id=?");
			pstmt.setString(1,id);
			rs=pstmt.executeQuery();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet retriveProduct()// to retrieve products 
	{
		try
		{
			
			pstmt=con.prepareStatement("select * from products");
			rs=pstmt.executeQuery();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	
}
