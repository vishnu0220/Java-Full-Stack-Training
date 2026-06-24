<%@ page import="java.util.List" %>
<%@ page import="com.crud.model.Employee" %>

<%
List<Employee> employees =
(List<Employee>) request.getAttribute("employeeList");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>

<link rel="stylesheet" href="css/style.css">

</head>
<body>

<div class="container">

<h2>Employee Management System</h2>

<a class="add-btn"
   href="employee?action=NEW">
   Add Employee
</a>

<table>

<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Department</th>
<th>Salary</th>
<th>Actions</th>
</tr>

<%
for(Employee employee : employees){
%>

<tr>

<td><%= employee.getId() %></td>
<td><%= employee.getName() %></td>
<td><%= employee.getEmail() %></td>
<td><%= employee.getDepartment() %></td>
<td><%= employee.getSalary() %></td>

<td>

<a href="employee?action=EDIT&id=<%= employee.getId() %>">
Edit
</a>

<a href="employee?action=DELETE&id=<%= employee.getId() %>"
onclick="return confirm('Delete Employee?')">
Delete
</a>

</td>

</tr>

<%
}
%>

</table>

</div>

</body>
</html>