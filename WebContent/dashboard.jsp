<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<%
		if(session.getAttribute("name") != null){
			out.println("<button><a href='logout'>Logout</a></button>");
			}
	%>
</div>
	<%
		if (session.getAttribute("name") == null) {
		out.println("<p>You have to login first</p>");
		request.getRequestDispatcher("login.jsp").include(request,response);
	}
	%>
	<%
		if(session.getAttribute("name") != null){
			out.print("<h1>Welcome" + session.getAttribute("name") +"</h1>" );
		}
	%>
</body>
</html>