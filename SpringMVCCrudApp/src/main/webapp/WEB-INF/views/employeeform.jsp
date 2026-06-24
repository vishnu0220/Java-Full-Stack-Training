<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Add Employee</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>

<body>

<div class="container">

    <h1>Add Employee</h1>

    <form action="saveEmployee" method="post">

        <input type="text"
               name="name"
               placeholder="Enter Name"
               required>

        <input type="email"
               name="email"
               placeholder="Enter Email"
               required>

        <input type="text"
               name="department"
               placeholder="Enter Department"
               required>

        <input type="number"
               name="salary"
               placeholder="Enter Salary"
               required>

        <input type="submit" value="Save">

    </form>

</div>

</body>
</html>