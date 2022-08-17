<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>ADD PAGE</h3>
	<form action="add.ms" method="post">
		<table border="1">
			<div>
			통장이름 :	
				<input type="text" name="bookName">
			</div>	
			<div>
			통장이자율 :
				<input type="text" name="bookRate">
			</div>	
		</table>
		<input type="submit" value="ADD">
		
		<br><a href="/">Back Home</a>
	</form>

</body>
</html>