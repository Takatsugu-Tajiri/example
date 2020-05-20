<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ占い</title>
</head>
<body>
<p>${uranai.today }の運勢は${uranai.luck }です。
<jsp:include page="/footer.jsp"/>
<%@include file="/common.jsp" %>
</body>
</html>