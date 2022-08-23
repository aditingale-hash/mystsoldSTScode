<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
    
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
<hr>
<%
	String msgVal1 = (String) request.getAttribute("msg_request");
out.println(msgVal1);
%>
<hr>
<%
	String msgVal2 = (String) request.getAttribute("msg_mav");
out.println(msgVal2);
%>

<BR><BR>
<h4>products</h4>
<a href="${pageContext.request.contextPath}/products?name=laptops ">Laptops</a><BR>
<a href="${pageContext.request.contextPath}/products?name=Desktops ">Desktops</a><BR>
<a href="${pageContext.request.contextPath}/products?name=Mobiles ">Mobiles</a><BR>

<a href="${pageContext.request.contextPath}/customer">Go to customer</a><BR>

<BR><BR>
<h4>Enter Customer Details</h4>
<sf:form action="${pageContext.request.contextPath }/add-customer" method="post" modelAttribute="employee">
   Name:<sf:input type="text" path="name"/><sf:errors path="name" /><br><br>
City:<sf:input type="text" path="city"/><sf:errors path="city" /><br><br>
<input type="submit" value="Create Customer Account"/><br><br>
</sf:form>
</body>
</html>