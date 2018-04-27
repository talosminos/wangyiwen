<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到我的网站</title>
</head>
<body background="image/11.jpg">
	<form action="login">
		<table border="1">
			<tr>
				<td>
					<table>
						<tr>
							<td colspan="2" align="center"><label
								style="font-size: 10px"><s:property value="prompt" /></label></td>
						</tr>
						<tr>
							<td><label>用户名</label></td>
							<td><input type="text" name="username"></td>
						</tr>
						<tr>
							<td><label>密码</label></td>
							<td><input type="password" name="password"></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="登录"> <input type="button" value="注册"
								onclick="javascrtpt:window.location.href='register.jsp'">
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>

	</form>
</body>
</html>