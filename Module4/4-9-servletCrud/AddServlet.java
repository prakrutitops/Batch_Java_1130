import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		Model m =new Model();
		m.setName(name);
		m.setEmail(email);
		m.setPass(pass);
		
		int status = UserDao.savedata(m);
		
		if(status>0)
		{
			resp.sendRedirect("ViewServlet");
		}
		else
		{
			out.print("fail");
		}
		
		
	}
}
