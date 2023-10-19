import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out  = response.getWriter();

		String name = request.getParameter("user");

if (name.equalsIgnoreCase("spot"))
	{
		RequestDispatcher rd = request.getRequestDispatcher("profile");
		rd.forward(request, response);
	//	response.sendRedirect("profile");
	}
	else
	{
		out.println("Please give valid user,, try spot");
		RequestDispatcher rd = request.getRequestDispatcher("File.html");
		rd.include(request, response);

		//	response.sendRedirect("File.html");
	}
	
	}


}
