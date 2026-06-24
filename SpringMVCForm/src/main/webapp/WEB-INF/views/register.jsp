<%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form" %>

<html>

<head>

<title>Registration Form</title>

<style>

.error {
    color: red;
}

table {
    margin-top: 50px;
}

</style>

</head>

<body>

<h2>User Registration Form</h2>

<form:form action="register"
           method="post"
           modelAttribute="user">

<table>

<tr>
    <td>Name:</td>

    <td>
        <form:input path="name"/>
    </td>

    <td>
        <form:errors path="name"
                     cssClass="error"/>
    </td>
</tr>

<tr>
    <td>Email:</td>

    <td>
        <form:input path="email"/>
    </td>

    <td>
        <form:errors path="email"
                     cssClass="error"/>
    </td>
</tr>

<tr>
    <td>Password:</td>

    <td>
        <form:password path="password"/>
    </td>

    <td>
        <form:errors path="password"
                     cssClass="error"/>
    </td>
</tr>

<tr>
    <td>Mobile:</td>

    <td>
        <form:input path="mobile"/>
    </td>

    <td>
        <form:errors path="mobile"
                     cssClass="error"/>
    </td>
</tr>

<tr>
    <td colspan="2">
        <input type="submit"
               value="Register"/>
    </td>
</tr>

</table>

</form:form>

</body>
</html>