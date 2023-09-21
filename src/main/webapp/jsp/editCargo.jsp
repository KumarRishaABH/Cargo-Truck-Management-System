<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="update" modelAttribute="cargoEntity">

 <form:hidden path="cno"/>
CargoName : <form:input path="name"/><br><br>

Phone : <form:input path="phone"/><br><br>

Email     : <form:input path="email"/> <br><br>


<input type="submit" value="EditCargo">



</form:form>


<a href="viewAll">ViewAllCargo </a>

</body>
</html>