<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버List</title>
</head>
<body>
	<h1>멤버 Search List</h1>
	<hr>
	<table border="1">
	<thead>
		<tr>
		<th>아이디</th><th>이름</th><th>E-Mail</th><th>Phone</th><th>Level</th>
		</tr>
	</thead>
	<tbody>	
		<c:forEach items="#{memberList}" var="member">
			<tr>
			<td>${member.id }</td><td>${member.name }</td><td>${member.email }</td><td>${member.phone }</td><td>${member.lv }</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
</body>
</html>