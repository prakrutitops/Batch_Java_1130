import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		
		Model m = UserDao.getdetailbyid(id2);
		
		out.print("<form action='EditServlet2' method='post'>");
		out.print("<table>");
		
		
		out.print("<tr><td></td><td><input type='hidden' name='id' value='"+m.getId()+"'/></td></tr>");
		
		out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+m.getName()+"'/></td></tr>");
		out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+m.getEmail()+"'/></td></tr>");
		out.print("<tr><td>Address:</td><td><input type='text' name='pass' value='"+m.getPass()+"'/></td></tr>");
	

		out.print("<tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr>");
		
		
		out.print("</table>");

		out.print("</form>");
		
		
		
		out.print("</form>");
	
	}
}
