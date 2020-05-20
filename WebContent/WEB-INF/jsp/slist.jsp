<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品一覧</title>
<style>

td,th{
	border:1px solid gray;
	padding:0.2em 0.5em;
	}

table{
	border-collapse: collapse;
	}

</style>
</head>
<h1>商品一覧</h1>
<a href="insert.html">追加</a>
<body>

<table>
<tr><th>商品ID</th><th>商品名</th><th>単価</th></tr>
<c:forEach var="shouhin" items="${list}">
	<tr>
		<td>${shouhin.sid }</td>
		<td>${shouhin.sname }</td>
		<td>${shouhin.tanka }</td>

		<td><a href="del?sid=${shouhin.sid }">削除</a></td>
		<td><a href="update?sid=${shouhin.sid }">変更</a></td>
		<td><a href="uriage?sid=${shouhin.sid }">売上</a></td>
	</tr>
</c:forEach>
</table>
<jsp:include page="/footer.jsp"/>
<%@include file="/common.jsp" %>

</body>
</html>