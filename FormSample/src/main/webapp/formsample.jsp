<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
<p>Here is my form.</p>
<form action="/FormSample/FormServlet" method="post">
<p>名前</p>
<input type="text" name="name">
<p>性別</p>
男<input type="radio" name="gender" value="0">
女<input type="radio" name="gender" value="1">
<input type="hidden" name="errorMsg">

<input type="submit"  value="subbmit">
</form>
</body>
</html>