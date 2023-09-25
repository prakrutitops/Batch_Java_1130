

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.Imadata.ImageDao;

/**
 * Servlet implementation class imageSave
 */
@WebServlet("/imageSave")
@MultipartConfig(maxFileSize=16177216)
public class imageSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public imageSave() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession ss = request.getSession(false);
		
		if(ss != null)
		{
		
		String usl = "jdbc:mysql://localhost:3306/brassdata";
		String user = "root";
		String pass = "";
		
		Part p = request.getPart("image");
		String nam = request.getParameter("ittype");
		int itid = ImageDao.getITid(nam);
		
		int r = 0;
		Connection con = null;
		
		if(p!=null)
		{
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(usl, user, pass);
				
				PreparedStatement ps = con.prepareStatement("insert into tbl_image(IT_ID,Img_Data,Img_IsAct) values(?,?,?)");
			
				InputStream io = p.getInputStream();
				
				ps.setInt(1, itid);
				ps.setBlob(2,io);
				ps.setString(3,"true");
				r = ps.executeUpdate();
				
				if(r>0)
				{
					response.sendRedirect("UploadImg.jsp");
				}
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		}
		else
		{
			response.sendRedirect("adminlogin.jsp");
		}
		
		
	}

}
