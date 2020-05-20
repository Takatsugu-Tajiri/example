<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>売上追加</title>
</head>
<body>

<h1>売上追加</h1>

<form action="uinsert"method="post">
商品:<select name="sid"><br>
<c:forEach var="shouhin" items="${list}">
	<option value="${shouhin.sid}">${shouhin.sname}</option>
	</c:forEach>
</select>
個数<input type="text"name="kosu"><br>
<input type="submit"value="送信"><br>
</form>
</body>
</html>