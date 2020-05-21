<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>]
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Memo</title>
</head>
<h1>Memo</h1>
<body>


<ul type="disc">
<li><c:forEach var="memo" items="${memo.title}">
	${memo.title}


</c:forEach></li>


</ul>



</body>
</html>