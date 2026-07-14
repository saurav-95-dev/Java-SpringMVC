<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Success</title>
</head>
<body>
<h1><marquee>Registration Successful</marquee></h1>
<% 
   String name = (String)session.getAttribute("username");
%>

<h2>Hi <%=name%> you have been registered</h2>
</body>
</html>