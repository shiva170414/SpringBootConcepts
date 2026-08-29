<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome!!</h1>
<h3>Name : ${user.getName()}</h3>
<h3>Roll no : ${user.getRoll()}</h3>
<h3>Email : ${user.getEmail()}</h3>
<h3>Phone Number : ${user.getPhone()}</h3>

</body>
</html>