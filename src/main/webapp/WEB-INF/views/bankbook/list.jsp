<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h3>LIST PAGE</h3>
		
		<table border="1">
			<tr>
				<th>통장번호</th>
				<th>통장이름</th>
				<th>통장이율</th>
				<th>판매여부</th>
			</tr>
			
		<c:forEach items="${list}" var="list">
			<tr>
			
			<td>${list.bookNum}</td>
			<td>
			<a href="detail.ms?bookNum=${list.bookNum}">
			${list.bookName}
			</a>
			</td>
			<td>${list.bookRate}</td>
			
			<c:if test="${list.bookSale eq 1}">
			<td>판매중</td>
			</c:if>
			<c:if test="${list.bookSale eq 0}">
			<td>판매중단</td>
			</c:if>
			
			</tr>
		</c:forEach>
		</table>
		<a href="add.ms">ADD</a>
</body>
</html>