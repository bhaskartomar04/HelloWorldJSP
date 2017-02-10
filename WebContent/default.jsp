<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body style="text-align: center; font-size: 150%; font-family: courier">
	<h1>JSP</h1>
	<%@ page info="Created by Bhaskar Tomar."%>
	<%!int cubeRoot(int num) {
		return num * num * num;
	}

	String tagName() {
		return "Declartion Tag";
	}%>

	<%
		this.log("abc");
		this.log(getServletInfo());
		pageContext.setAttribute("message", "hello from default.jsp", PageContext.SESSION_SCOPE);
		String userName = request.getParameter("userId");
		application.setInitParameter("userId", userName);
		out.println("Welcome to Scripting tag " + userName + ", it is used to execute java code.");
	%>
	<p />
	<%="This is expression tag.In this you directly wirte to output stream,without using out.println()."
					+ "It is used to print varible or method values."%>
	<p />
	<%="This is from " + tagName() + " \n Cube Root = " + cubeRoot(10) + session.getAttribute("user")%>
	<%="This page is" + getServletInfo()%>
	<form action="/HelloWorldJSP/getMyAction.action">
		<input type="submit" value="Home Page" 
			style="background-color: #0011FF; font-size: 200%; font-family: courier">
	</form>
	
</body>
</html>