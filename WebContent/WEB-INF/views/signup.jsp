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
<form:form action="userSignup" method="post" modelAttribute="signup">
<h2><center>SIGNUP</center></h2>
<table>
<tr>
<td>Username:</td>
<td><input type="text" name=name required></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="text" name=pass required></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="text" name=email required></td>
</tr>
<tr>
<td>Phone Number :</td>
<td><input type="text" name=phone required></td>
</tr>
<tr><td><input type="submit" value="Submit"></td></tr>
</table>
</form:form>
</body>
</html>