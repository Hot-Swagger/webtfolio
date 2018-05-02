<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
<head>
<%-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=1">
<link href="${root}/resource/css/style.css" type ="text/css" rel ="stylesheet"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>Insert title here</title> --%>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=1">
	<link rel="shortcut icon" href="${root}/resource/assets/favicon.ico">  
    <link href='https://fonts.googleapis.com/css?family=Roboto:400,500,400italic,300italic,300,500italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <!-- Global CSS -->
    <link rel="stylesheet" href="${root}/resource/assets/plugins/bootstrap/css/bootstrap.min.css"> 
    <!-- Plugins CSS -->
    <link rel="stylesheet" href="${root}/resource/assets/plugins/font-awesome/css/font-awesome.css">
    
    <!-- Theme CSS -->  
    <%-- <link id="theme-style" rel="stylesheet" href="${root}/resource/assets/css/styles.css"> --%>
	<link href="${root}/resource/css/style.css" type ="text/css" rel ="stylesheet"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<title>Webtfolio</title>
</head>
<body>
	<!-- header -->
	<tiles:insertAttribute name="header"/>
	<!-- main -->
	<tiles:insertAttribute name="main"/>
	<!-- footer -->
	<tiles:insertAttribute name="footer"/>
	<!-- Javascript -->          
    <script type="text/javascript" src="${root}/resource/assets/plugins/jquery-1.11.3.min.js"></script>
    <script type="text/javascript" src="${root}/resource/assets/plugins/bootstrap/js/bootstrap.min.js"></script>    
    <!-- custom js -->
    <script type="text/javascript" src="${root}/resource/assets/js/main.js"></script>
</body>
</html>