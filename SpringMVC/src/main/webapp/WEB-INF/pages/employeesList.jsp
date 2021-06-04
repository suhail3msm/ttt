<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>List Employees</h1>
<h3><a href="add.html">Add More Employee</a></h3>


 <table align="left" border="1">
  <tr>
   <th>Employee ID</th>
   <th>Employee Name</th>
   <th>Employee city</th>

  </tr>

  
  <c:forEach items="${documentList}" var="document">
	<tr>
		<td>${document.empID}</td>
		<td>${document.empName}</td>
		<td">${document.city}</td>

	</tr>
</c:forEach>
 </table>

</body>
</html>