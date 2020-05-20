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
<form action="mupdate"method="post">
<input type="hidden" name="mid" value="${member.mid}">
氏名:<input type="text" name="name"value="${member.name}"><br>
住所:<input type="text" name="adr" value="${member.adr}"><br>
<input type="submit"value="変更"><br>
</form>

<h2>削除</h2>
<form action="mdel"method="post">
<input type="hidden" name="mid" value="${member.mid}">


<input type="submit"value="削除"><br>
</form>
</body>
</html>