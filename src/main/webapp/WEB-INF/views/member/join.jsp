<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h1> 회원가입 </h1>
	<hr>
	<form action="join.mg" method="post">
		아이디<br>
		<input type="text" name="id"><br>
		비밀번호<br>
		<input type="text" name="pw"><br>
		이름<br>
		<input type="text" name="name"><br>
		이메일<br>
		<input type="text" name="email"><br>
		전화번호<br>
		<input type="text" name="phone"><br>
		<br><br><br>
		관리자인증번호<br>
		<input type="text" name="lv">
		<button type="submit">회원가입요청</button>
	</form>

</body>
</html>