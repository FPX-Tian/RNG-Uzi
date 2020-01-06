<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1px">
	<tr>
		<td>序号</td>
		<td>用户ID</td>
		<td>用户名</td>
		<td>登录名</td>
		<td>角色</td>
		<td>操作</td>
	</tr>
	
	<c:forEach items="${ulist}" var="user" varStatus="vs">
	<form id="uf${vs.count}" action="updateUser" method="post">
	<tr>
		<td>${vs.count}</td>
		<td><input name="uid" value="${user.userId }" type="hidden"/>${user.userId }</td>
		<td>${user.userName }</td>
		<td>${user.loginName }</td>
		<td>
			<select name="rid">
				<option selected="selected" value="${user.role.roleId }">${user.role.roleName }</option>
			<c:forEach items="${rlist }" var="role">
				<option value="${role.roleId}">${role.roleName}</option>
			</c:forEach>
			</select>
		</td>
		<td><input type="submit" value="修改" /></td>
	</tr>
	</form>
	</c:forEach>
	
</table>

</body>
</html>