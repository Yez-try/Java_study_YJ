<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>UPDATE PAGE</h3>
	<form action="update.ms" method="post">
		<input type="hidden" name="bookNum" value="${update.bookNum}">
	<table border="1">
		<tr>
			<th>BookNum</th>
			<th>BookName</th>
			<th>BookRate</th>
			<th>BookSale</th>
		</tr>
		<tr>
			<td>${update.bookNum}</td>
			<td>
				<input type="text" name="bookName" value="${update.bookName}">
			</td>
			<td>
				<input type="text" name="bookRate" value="${update.bookRate}">
			</td>
			<td>${update.bookSale}</td>
		</tr>
	</table>
	<input type="submit" value="UPDATE">
	</form>
	

</body>
</html>