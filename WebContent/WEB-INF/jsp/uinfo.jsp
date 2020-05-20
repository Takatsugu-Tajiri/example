<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>売上詳細</title>
</head>
<body>

<h1>売上詳細</h1>

<p>売上ID:${uriage.uid}</p>
<p>商品ID:${uriage.sid}</p>
<p>商品名:${shouhin.sname}</p>
<p>単価:${shouhin.tanka}</p>
<p>個数:${uriage.kosu}</p>
<p>金額:${(shouhin.tanka)*(uriage.kosu)}</p>
<p>日付:${uriage.hi}</p>

</body>
</html>