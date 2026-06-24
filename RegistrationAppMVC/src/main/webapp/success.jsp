<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<marquee><h1>User Registration success</h1></marquee>
	<% String name = (String) session.getAttribute("name"); %>
	<h2> Hey <%= name %>, you've registered successfully!  </h2>
</body>
</html>