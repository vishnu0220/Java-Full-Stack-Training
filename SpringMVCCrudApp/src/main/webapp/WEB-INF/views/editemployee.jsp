<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<html>

<head>

    <title>Edit Employee</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css">

</head>

<body>

<div class="container">

    <h1>Edit Employee</h1>

    <form action="${pageContext.request.contextPath}/updateEmployee"
          method="post">

        <input type="hidden"
               name="id"
               value="${employee.id}">

        <input type="text"
               name="name"
               value="${employee.name}">

        <input type="email"
               name="email"
               value="${employee.email}">

        <input type="text"
               name="department"
               value="${employee.department}">

        <input type="number"
               name="salary"
               value="${employee.salary}">

        <input type="submit"
               value="Update Employee">

    </form>

</div>

</body>
</html>