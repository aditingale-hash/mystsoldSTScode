<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>home</h1>
<%
	String msgVal = (String) request.getAttribute("msg_model");
out.println(msgVal);
%>

</body>
</html>