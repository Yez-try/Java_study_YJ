<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Java_study_YJ 페이지 
</h1>

<P>  The time on the server is ${serverTime}. </P>
<hr>
<a href="./member/login.mg">로그인</a>
<a href="./member/join.mg">회원가입</a>
<hr>
<a href="./member/search.mg">멤버 검색</a>

</body>
</html>
