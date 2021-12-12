<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>	
<h1 class="col"> This is my first JSP file</h1>



<!-- below is inline java  -->
<h2>
<%! int count=10; %>
<%= count %>
</h2>

<!-- below is passing values from model.addAttribute in .java file -->
<p>
Created By: <c:out value="${firstName}"/>
During the <c:out value="${stack}"/> stack! 
</p>
<c:out value="${search}"/>
<c:out value="${userName}"/>
</body>
</html>