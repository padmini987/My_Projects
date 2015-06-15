package income;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Login login = new Login();
		login.setUsername(request.getParameter("username"));
		login.setPassword(request.getParameter("password"));
		
		HttpSession session=request.getSession();
		session.setAttribute("user", login);
	/*	PrintWriter out=response.getWriter();
		out.println("<html><body><center><h1>Login Page</h1></center>");
		out.println("<h3>Welcome, </h3>");
		out.println(((Login) session.getAttribute("user")).getUsername());
		out.println("</body></html>");		
		Used seperate page for more readability*/
		RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
		rd.forward(request, response);
	}

}
