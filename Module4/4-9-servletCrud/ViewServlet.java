import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		List<Model> list = UserDao.viewdata();
	
		out.print("<center>");
		out.print("<a href='form.html'>Add Details</a>");
		out.print("<table border='1'>");
		
		out.print("<tr><th>Id</th><th>Name</th><th>Email</th><th>Password</th><th>Edit</th><th>Delete</th></tr>");
		
		for(Model m :list)
		{
			out.print("<tr><td>"+m.getId()+"</td><td>"+m.getName()+"</td><td>"+m.getEmail()+"</td><td>"+m.getPass()+"</td><td><a href='EditServlet?id="+m.getId()+"'"+">Edit</a></td><td><a href='DeleteServlet?id="+m.getId()+"'"+">Delete</a></td></tr>");
		}
		out.print("</table>");
		out.print("</center>");
	}
}
