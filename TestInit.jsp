<html>
	<body>
		<%! public void jspInit()
		{
			ServletConfig sConfig = getServletConfig();
			String emailAddr = sConfig.getInitParameter("email");
			ServletContext ctx = getServletContext();
			ctx.setAttribute("email",emailAddr);
		}
		
		%>
		
		Email=<%=application.getAttribute("email")%>
		
	</body>
</html>