import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyDeatils extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");//response -> html
		PrintWriter out = resp.getWriter();//print something in web browser
		
		String name = req.getParameter("Name");
		String email = req.getParameter("Email");
		String phone_number = req.getParameter("Phone");
		String message = req.getParameter("message");
		
		out.print(name);
		out.print("<br>");
		out.print(email);
		out.print("<br>");
		out.print(phone_number);
		out.print("<br>");
		out.print(message);
		
	
	}
}
