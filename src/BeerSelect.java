package com.example.web;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.example.model.*;
import java.util.*;

public class BeerSelect extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse reponse) throws IOException,ServletException
	{
		reponse.setContentType("text/html");
		PrintWriter out = reponse.getWriter();
		String[] c = request.getParameter("size");
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		Iterator it = result.iterator();
		for (int i=0; i< size.length; i++)
		{
			out.print("<br> size:" + size[i]);
		}
		//out.println("Beer Selection Advice <br>");
		//while (it.hasNext())
		//{
			//out.print("<br> try: " + it.next());
		//}
		
	}
	
}