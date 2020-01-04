
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthenticateServlet
 */
@WebServlet("/Authenticate")
public class AuthenticateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
		PrintWriter pw=res.getWriter();
		String lid=req.getParameter("loginId");
		String pwd=req.getParameter("password");
		
		if(lid.equals("admin") && pwd.equals("admin"))
			pw.println("<font color=green><h1>Login Successfull..</h1></font>");
		else
		{
			pw.println("<font color=red><h1>Login Unsuccessfull</h1></font>");
			pw.println("<a href='http://localhost:9090/Week2Test/WebContent/Login.html'>"
					+ "Go Back To Login Page</a>");
		}
			
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
		doGet(req,res);
	}
}
