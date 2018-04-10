<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<script src="${root}/resource/js/header.js"></script>
<header class="header">
	<nav class="header-menu">
		<h1 class="hidden">헤더메뉴</h1>
		<ul>
			<li><a href=""></a></li>
			<li><img src="${root}/resource/images/ic_menu_white_24dp_1x.png" alt="메뉴"></li>
		</ul>
	</nav>
	<nav class="main-menu">
		<h1 class="hidden">메인메뉴</h1>
		<ul>
			<li><a href="${root}/profile/detail">PROFILE</a></li>
			<li><a href="${root}/experience/detail">EXPERIENCE</a></li>
			<li><a href="${root}/portfolio/list">PORTFOLIO</a></li>
			<li id="admin-menu-select"><span>ADMIN MENU</span><span><img src="${root}/resource/images/down-arrow.png"></span>
				<ul>
					<li><a href="${root}/admin/profile/reg">- EDIT PROFILE</a></li>
					<li><a href="${root}/admin/portfolio/reg">- REG PORTFOLIO</a></li>
				</ul>
			</li>
			<li class="login-menu"><a href="${root}/admin/home/login">LOG IN</a></li>
			<li class="login-menu"><a href="${root}/logout">LOG OUT</a></li>
		</ul>
	</nav>
</header>
<!-- 참조 -->
<li role="menuitem" id="mobile-menu-item-1478" class="fusion-mobile-nav-item menu-item-has-children" style="">
	<span href="#" aria-haspopup="true" class="fusion-open-submenu">
	</span>
	<a href="http://funnytem.co.kr/%ec%a0%9c%ec%9e%91%eb%ac%b8%ec%9d%98/" class="fusion-background-highlight">
		<span class="menu-text">제작문의</span>
	</a>
	<ul role="menu" class="sub-menu" style="display: block;">
		<li role="menuitem" id="mobile-menu-item-2151"
			class="fusion-mobile-nav-item" style=""><a
			href="http://funnytem.co.kr/%ed%99%88%ed%8e%98%ec%9d%b4%ec%a7%80-%ec%9c%a0%ed%98%95/"
			class="fusion-background-highlight"><span>디자인 가이드</span></a></li>
		<li role="menuitem" id="mobile-menu-item-1573"
			class="fusion-mobile-nav-item" style=""><a
			href="http://funnytem.co.kr/%ec%a0%9c%ec%9e%91%eb%ac%b8%ec%9d%98/"
			class="fusion-background-highlight"><span>상세 견적문의</span></a></li>
		<li role="menuitem" id="mobile-menu-item-1994"
			class="fusion-mobile-nav-item" style=""><a
			href="http://funnytem.co.kr/%eb%b9%a0%eb%a5%b8-%ec%a0%9c%ec%9e%91%eb%ac%b8%ec%9d%98/"
			class="fusion-background-highlight"><span>빠른 제작문의</span></a></li>
	</ul>
</li>