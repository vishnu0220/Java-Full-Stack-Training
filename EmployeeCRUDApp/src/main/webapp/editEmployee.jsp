<%@ page import="com.crud.model.Employee" %>

<%
Employee employee =
(Employee) request.getAttribute("employee");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>

<link rel="stylesheet" href="css/style.css">

</head>
<body>

<div class="container">

<h2>Edit Employee</h2>

<form action="employee" method="post">

<input type="hidden" name="action" value="UPDATE">

<input type="hidden"
       name="id"
       value="<%= employee.getId() %>">

<input type="text"
       name="name"
       value="<%= employee.getName() %>"
       required>

<input type="email"
       name="email"
       value="<%= employee.getEmail() %>"
       required>

<input type="text"
       name="department"
       value="<%= employee.getDepartment() %>"
       required>

<input type="number"
       step="0.01"
       name="salary"
       value="<%= employee.getSalary() %>"
       required>

<button type="submit">Update Employee</button>

</form>

</div>

</body>
</html>