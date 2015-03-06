import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DatingServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse reponse) throws IOException
	{
		PrintWriter out = reponse.getWriter();
		out.println("something really ugly  goes here");
		
	}
	
}