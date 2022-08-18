<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
<c:if test="${empty sessionScope.user}">
<a href="./member/login.mg">로그인</a>
<a href="./member/join.mg">회원가입</a>
</c:if>

<c:if test="${not empty sessionScope.user}">
<h3> ${sessionScope.user.name}님 환영합니다 </h3>
<a href="#">마이페이지</a>
<a href="./member/logout.mg">로그아웃</a>
</c:if>

<hr>
<a href="./member/search.mg">멤버 검색</a>

<hr>
<a href="./bankbook/add.ms">상품 등록</a>
<a href="./bankbook/list.ms">상품 리스트 보기</a>

</body>
</html>
