
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import User.User;
import User.UserDAO;

	@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	PrintWriter out;
	User u;
	UserDAO dao;
	    
    public LoginServlet() {
        super();
        dao=new UserDAO();

        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		out=response.getWriter();
		String uid=request.getParameter("LoginId");
		String password=request.getParameter("password");
		String email="";
		
		u=new User(uid, password, email);
		boolean ra=dao.validateUser(u);
		if(ra==false)
			out.println("<font color=yellow login Unsucccessfully.</font>");
		else{
			out.println("<font color=blue>login successful</font>");
			out.println("Search for a Product <a href='http://localhost:9080/Week2Test/Search.html'>Click Here</a>");
			out.println("List all the products<a href='http://localhost:9080/Week2Test/Prod.html'>Click Here</a>");
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		out=response.getWriter();
		String uid=request.getParameter("loginId");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		
		u=new User(uid, password, email);
		
		int ra=dao.insertUser(u);
		if(ra>0)
			out.println("<font color=yellow>User Registered Succcessfully.</font>");
		else
			out.println("<font color=blue>User not registered.</font>");
		
		
	}

}
