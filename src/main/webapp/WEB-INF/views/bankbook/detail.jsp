<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>DETAIL PAGE</h3>
	
	<table border="1">
		<tr>
			<th>BookNum</th>
			<th>BookName</th>
			<th>BookRate</th>
			<th>BookSale</th>
		</tr>
		<tr>
			<td>${detail.bookNum}</td>
			<td>
			<a href="acoount.ms?bookNum${detail.bookNum}">
			${detail.bookName}
			</a>
			</td>
			<td>${detail.bookRate}</td>
			<c:if test="${detail.bookSale eq 1 }">
			<td>판매중</td>
			</c:if>
			<c:if test="${detail.bookSale eq 0 }">
			<td>판매중단</td>
			</c:if>
			
		</tr>
	</table>
	<a href="list.ms">Back LIST</a>
	<a href="update.ms?bookNum=${detail.bookNum}">UPDATE</a>
	<a href="delete.ms?bookNum=${detail.bookNum}">DELETE</a>
	

</body>
</html>