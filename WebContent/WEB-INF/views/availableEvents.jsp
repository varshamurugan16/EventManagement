<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="eventReg" method="post" modelAttribute="availevent">
<h2><center>Events</center></h2>
<table align ="center" border = "0" cellspacing="20">
<tr>
<th> Event Name </th>
<th> Session </th>
</tr>
<tr>
<td> Project Presentation </td>
<td>  7-05-2019/morning </td>
</tr>
<tr>
<td> Paper Presentation </td>
<td> 7-05-2019/Afternoon </td>
</tr>
<tr>
<td> wokshop </td>
<td> 8-05-2019/morning </td>
</tr>
<tr>
<td> coding event </td>
<td> 8-05-2019/Afternoon </td>
</tr>
<tr><td>
<input type="submit" value="Register"></td></tr>
</table>
</form:form>
</body>
</html>