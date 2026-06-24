<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Employee</title>

<link rel="stylesheet" href="css/style.css">

</head>
<body>

<div class="container">

<h2>Add Employee</h2>

<form action="employee" method="post">

<input type="hidden" name="action" value="INSERT">

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
       placeholder="Department"
       required>

<input type="number"
       step="0.01"
       name="salary"
       placeholder="Salary"
       required>

<button type="submit">Save Employee</button>

</form>

<a href="employee">Back</a>

</div>

</body>
</html>