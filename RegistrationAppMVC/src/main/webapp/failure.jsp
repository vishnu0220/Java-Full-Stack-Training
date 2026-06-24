<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Failure</title>
</head>
<body>
	<marquee><h1>User Registration Failed</h1></marquee>
	<% String name = (String) session.getAttribute("name"); %>
	<h2> Hey <%= name %>, your registration failed!  </h2>
</body>
</html>