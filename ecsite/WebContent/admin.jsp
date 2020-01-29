<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type = "text/css" href="./css/style.css">
<title>Admin画面</title>
</head>
<body>
	<div id = "header"></div>
	<div id = "main">
		<div id="top"><p>Admin</p></div>
		<div>
		<table>
		<tr>
		<td><label>商品</label></td>
			<td><s:form action="ItemCreateAction">
			<s:submit value="新規登録"/>
			</s:form></td>
			<td><s:form action="ItemListAction">
			<s:submit value="一覧"/>
			</s:form></td>
		</tr>
		<tr>
			<td><label>ユーザー</label></td>
			<td><s:form action="UserCreateAction">
			<s:submit value="新規登録"/>
			</s:form></td>
			<td><s:form action="UserListAction">
			<s:submit value="一覧"/>
			</s:form></td>
		</tr>
		</table>
		</div>
	</div>
	<div id="footer"></div>
</body>
</html>