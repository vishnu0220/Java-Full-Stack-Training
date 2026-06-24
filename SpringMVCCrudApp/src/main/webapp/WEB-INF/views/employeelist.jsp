<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>

<html>

<head>

    <title>Employee List</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css">

</head>

<body>

<div class="container">

    <h1>Employee Management System</h1>

    <a href="addEmployee"
       class="btn add-btn">
        Add Employee
    </a>

    <table>

        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Department</th>
            <th>Salary</th>
            <th>Action</th>
        </tr>

        <c:forEach var="emp" items="${employees}">

            <tr>

                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.email}</td>
                <td>${emp.department}</td>
                <td>${emp.salary}</td>

                <td>

                    <a href="editEmployee/${emp.id}"
                       class="btn edit-btn">
                        Edit
                    </a>

                    <a href="deleteEmployee/${emp.id}"
                       class="btn delete-btn">
                        Delete
                    </a>

                </td>

            </tr>

        </c:forEach>

    </table>

</div>

</body>
</html>