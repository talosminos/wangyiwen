<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎注册</title>
</head>
<body background=""image/11.jpg"">
	<form action="register">
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
							<td><label>昵称</label></td>
							<td><input type="text" name="nickname"></td>
						</tr>
						<tr>
							<td><label>密码</label></td>
							<td><input type="password" name="password"></td>
						</tr>
						<tr>
							<td><label>密码确认</label></td>
							<td><input type="password" name="reset_password"></td>
						</tr>
						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="注册"> <input type="reset" value="重置"></td>
						</tr>
						<tr>
							<td colspan="2" align="right" style="font-size: 10px"><a
								href="index.jsp">已有账号登录</a>
							<td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>