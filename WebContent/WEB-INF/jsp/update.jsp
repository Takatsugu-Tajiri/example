<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>変更</title>
</head>
<body>
<h1>変更</h1>
<form action="update"method="post">
<input type="hidden" name="sid" value="${shouhin.sid }">
商品名:<input type="text" name="sname" value="${shouhin.sname }"><br>
単価<input type="text"name="tanka" value="${shouhin.tanka }"><br>
<input type="submit"value="送信"><br>
</form>
</body>
</html>