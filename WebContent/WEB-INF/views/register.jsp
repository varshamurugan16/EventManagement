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
<h2><center>Register Form</center></h2>
<table align="center" cellspacing="20">
<tr>
<td>Name :</td>
<td><input type="text" name=name required></td>
</tr>
<tr>
<td>Event Name:</td>
<td><input type="text" name=eventname required></td>
</tr>
<tr><td><input type="submit" value="Submit"></td></tr>
</table>
</form:form>
</body>
</html>