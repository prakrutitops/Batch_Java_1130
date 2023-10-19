import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
	
		if(pass.equals("1234"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("https://www.google.com");
			rd.forward(req, resp);
			//rd.include(req, resp)
		}
		else
		{
			System.out.println("Error");
		}
}
}
