<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info=""%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" href="http://stu6.sist.co.kr/spring_mvc/common/favicon.ico"/>
<!--bootstrap 시작-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!--bootstrap 끝-->
<link rel="stylesheet" href="http://stu6.sist.co.kr/spring_mvc/common/css/main.css" type="text/css" media="all" />
<link rel="stylesheet" href="http://stu6.sist.co.kr/spring_mvc/common/css/board.css" type="text/css" media="all" />
<!--jQuery CDN 시작-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!--jQuery CDN 끝-->
<style type="text/css">
	
</style>
<script type="text/javascript">
	$(function(){
	
	});//ready
</script>
</head>
<body>
<div>

<c:choose>
	<c:when test="${ requestScope.uploadFlag }">
	<strong><c:out value="${ requestScope.uploader }"/></strong>님
	<c:out value="${ requestScope.fileName }"/>파일이 업로드 되었습니다.
	</c:when>
	
	<c:otherwise>
	<span style="color: #FF0000">업로드 실패</span>
	<c:out value="${ requestScope.fileName }"/>파일은 10Mbyte를 초과합니다.
	</c:otherwise>
</c:choose>

</div>
</body>
</html>