<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location</title>
</head>
<body>
<h1>Location Details</h1>
<form action="saveLocation">
<pre>
Id   :<input type="text" name="id"/><br>
Code :<input type="text" name="code"/><br>
Name :<input type="text" name="name"/><br>
Type :
Urban <input type="radio" name="type" value="Urban"/>
Rural <input type="radio" name="type" value="Rural"/>
<input type="submit" value="Submit">
</pre>
</form>
${msg}

</body>
</html>