<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="http://192.168.130.149:8080/mytribe_game/login/login.do" method="post">
	<table>
	<thead>login</thead>
	<tbody>
	<tr><td>accountName</td><td><input type="text" name="accountName" value="张朋林@126.com" /></td></tr>
	<tr><td>platformType</td><td><input type="text" name="platformType" value="1" /></td></tr>
	<tr><td>passwd</td><td> <input type="text" name="passwd" value="2" /></td></tr>
	<tr><td>userKey</td><td> <input type="text" name="userKey" value="2" /></td></tr>
	<tr><td></td><td> <input type="submit" value="提交" /></td></tr>
	</tbody>
	
	
	</table>

	</form>
</body>
</html>