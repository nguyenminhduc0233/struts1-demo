<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
<title>Strut1 demo</title>
<link href="css/login.css" rel="stylesheet">
</head>
<body>
	<div id="container">
	
		<form action="/Strut1-demo/viewUser.do" method="post">
		
			<h3>Login</h3>
			<logic:equal name="user" property="error" value="null"><p>Error</p></logic:equal>
			<logic:notEqual name="user" property="error" value="null"><p><bean:write name="user" property="error"/></p></logic:notEqual>
			<div class="form-group">
				<label>User name</label> <input id="username" type="text"
					maxlength="8" name="username" value="">
			</div>
			<div class="form-group">
			<label>Password</label>
			<input id="password" type="password" maxlength="8" name="password">
			</div>
			<div class="form-group">
			<input id="submit" type="submit" value="submit">
			</div>
		</form>
	</div>
</body>
</html>