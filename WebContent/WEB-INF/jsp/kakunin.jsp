<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>追加確認</title>
</head>
<body>

<h>追加確認</h>

<p>以下を追加します。よろしいですか

<p>商品名:<c:out value="${shouhin.sname }"/></p>
<p>単価:${shouhin.tanka }</p>

<form action="insert" method="post">
<input type="hidden" name="sname" value="${shouhin.sname }">
<input type="hidden" name="tanka" value="${shouhin.tanka }">
<input type="submit" value="追加">

</form>

</body>
</html>