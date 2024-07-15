<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이동한 페이지<br/>
<h2>상품목록</h2>
<c:forEach var="prd" items="${ prdList }">
<c:out value="${ prd }"/><br/>
</c:forEach>
</body>
</html>