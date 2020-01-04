import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Product.Product;
import Product.ProductDAO;

import java.io.PrintWriter;
import java.sql.ResultSet;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Product p;
	ProductDAO dao;
	PrintWriter out;   
	ResultSet rs;

  
    public ProductServlet() {
       // super();
        // TODO Auto-generated constructor stub
        dao=new ProductDAO();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try{
			out=response.getWriter();
			String pid=request.getParameter("pid");
			
			ResultSet res=dao.getProduct(pid);
			out.println("<table border=3><tr><th>product Id</th><th>product Name</th><th>price</th><th>category</th></tr>");
			while(res.next())
			{
				out.println("<tr>");
				out.println("<td>"+res.getString("id")+"</td>");
				out.println("<td>"+res.getString("name")+"</td>");
				out.println("<td>"+res.getString("price")+"</td>");
				out.println("<td>"+res.getString("category")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("To Go Back To The Form <a href='http://localhost:9080/Week2Assessment/home.html'>Click Here</a>");
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try{
			out=response.getWriter();
			ResultSet res=dao.retriveProduct();
			out.println("<table border=3><tr><th>product Id</th><th>product Name</th><th>price</th><th>category</th></tr>");
			while(res.next())
			{
				out.println("<tr>");
				out.println("<td>"+res.getString("id")+"</td>");
				out.println("<td>"+res.getString("name")+"</td>");
				out.println("<td>"+res.getString("price")+"</td>");
				out.println("<td>"+res.getString("category")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("To Go Back To The Form <a href='http://localhost:9080/Week2Assessment/home.html'>Click Here</a>");
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
		
		
	}
  
