<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="MVCView" >Test mvc:view</a>
<br><br><br>
	<a href="SpringMVC2/TestModelAttribute11"> TestModelAttribute</a>
	<br>
	<br>
	<form action="SpringMVC2/TestModelAttribute" method="POST">
		<input type="hidden" name="id" value="1"> username: <input
			type="text" name="Username" value="SpringMVC1"><br> <br>
		eamil: <input type="text" name="Email" value="139@qq"><br>
		<br> age :<input type="text" name="age" value="11"><br>
		<br> <input type="submit" value="submit">
	</form>
	<br>
	<br>
	<a href="SpringMVC/TestSessionAttributes">TestSessionAttributes</a>
	<br>
	<br>
	<a href="SpringMVC/TestMap">TestMap</a>
	<br>
	<br>
	<a href="SpringMVC/TestModleView">TestModleView</a>
	<br>
	<br>
	<form action="SpringMVC/TestPOJO" method="POST">
		username : <input type="text" name="username"><br>
		password : <input type="password" name="password"><br>
		age: <input type="text" name="age"><br> Email : <input
			type="text" name="Email"><br> City: <input type="text"
			name="adders.City"><br> province: <input type="text"
			name="adders.province"><br> <input type="submit"
			value="提交">
	</form>

	<br>
	<br>
	<br>
	<form action="SpringMVC/RequestMapping1" method="Post">
		<input type="submit" value="提交">
	</form>
	<br>
	<br>
	<a href="helloworld">Hello World</a>
	<br>
	<br>
	<a href="SpringMVC/RequestMapping2">RequestMapping 测试</a>
	<br>
	<br>
	<a href="SpringMVC/RequestParam?username=chenjian&age=12">RequestParam
		测试</a>
</body>
</html>