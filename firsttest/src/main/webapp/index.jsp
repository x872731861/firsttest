<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	<div>
		<h1>欢迎你</h1>
		<a href="${pageContext.request.contextPath }/index.jsp">首页</a>
		<form action="${pageContext.request.contextPath }/perUser/login" method="post">
			<input type="text" name="username" value="请输入">
			<input type="password" name="password" >
			<button type="submit">注册</button>
		</form>
	</div>

</body>
</html>