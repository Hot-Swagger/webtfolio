<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<script src="${root}/resource/js/header.js"></script>
<header class="header">
	<nav class="header-menu">
		<h1 class="hidden">헤더메뉴</h1>
		<ul>
			<li><a href="${root}/home/index"></a></li>
			<li><img src="${root}/resource/images/ic_menu_white_24dp_1x.png" alt="메뉴"></li>
		</ul>
	</nav>
	<nav class="main-menu">
		<h1 class="hidden">메인메뉴</h1>
		<ul>
			<li><a href="${root}/profile/detail">PROFILE</a></li>
			<li><a href="${root}/experience/detail">EXPERIENCE</a></li>
			<li><a href="${root}/portfolio/list">PORTFOLIO</a></li>
			<li id="admin-menu">
				<span>ADMIN MENU</span>
				<span>
					<img src="${root}/resource/images/ic_keyboard_arrow_down_white_24dp_1x.png">
				</span>
			</li>
			<li class="admin-sub-menu">
				<ul>
					<li><a href="${root}/admin/profile/reg">- EDIT PROFILE</a></li>
					<li><a href="${root}/admin/portfolio/reg">- REG PORTFOLIO</a></li>
				</ul>
			</li>
			<li class="login-menu"><a href="${root}/admin/home/login">LOG IN</a></li>
			<li class="login-menu"><a href="${root}/logout">LOG OUT</a></li>
		</ul>
	</nav>
	<div class=topBtn onclick="window.scrollTo(0,0);">
		<img alt="top" src="${root}/resource/images/ic_arrow_drop_up_white_36dp_1x.png">
	</div>
</header>