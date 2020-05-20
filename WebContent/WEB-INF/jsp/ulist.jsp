<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>売上一覧</title>
</head>

<h1>売上一覧</h1>

<body>
<a href="uinsert">追加</a><p>

<table>
<tr><th>売上ID</th><th>商品ID</th><th>個数</th><th>日付</th></tr>
<c:forEach var="uriage" items="${list}">
	<tr>
		<td>${uriage.uid }</td>
		<td>${uriage.sid }</td>
		<td>${uriage.kosu }</td>
		<td>${uriage.hi }</td>
		<td><a href="uinfo?uid=${uriage.uid}">詳細</a> </td>
	</tr>
</c:forEach>
</table>


</body>
</html>