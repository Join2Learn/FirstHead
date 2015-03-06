<%@ page import="java.util.*" %>
<html>
<body>
  1
  <p>
  Test scriptlests.............
  <% int x=2; %>
  <% int y=5+x; %>
 
  
   Result
   <%=y %>
   <%=x %>
   <p>
   2
   <p>
   <% List list= new ArrayList();
      list.add(new String("Test"));
   %>
   <%=list.get(0) %>
   
   <p>3
    <p>
	<%!int b=222;%>
	<% int b=22;%>
	<p>
	p=<%=b%>
	
	
   
   
   </body>
</html>