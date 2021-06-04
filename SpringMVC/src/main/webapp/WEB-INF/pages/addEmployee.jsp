<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add" method="POST">
    ID : <input type="text" name="empID" value='${employee.empID}' />
    <span style="color:red">${errmsg} </span>
    <br><br>
    
    Name : <input type="text" name="empName" value='${employee.empName}' /><br><br>
     City : <input type="text" name="city" value='${employee.city}' /><br><br>
    <input type="submit" value="submit">
</form>
<br><br>
 <span style="color:green">${success} </span>
</body>
</html>