<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<main class="main">
	<div class="detail-main-container">
		<div class="portfolio-detail-visual">
			<h1 class="hidden">포트폴리오 상세페이지</h1>
			<p>여행기록 웹페이지 "여기"</p>
		</div>
		<section class="portfolio-img-slider">
			<h1 class="hidden">이미지 슬라이드</h1>
			<img src="${root}/resource/images/yeogi-main.png" alt="포폴이미지"/>
		</section>
		<section class="portfolio-detail portfolio-detail-info">
			<h1>프로젝트 정보</h1>
		</section>
		<section class="portfolio-detail portfolio-detail-description">
			<h1>프로젝트 상세설명</h1>
		</section>
	</div>
</main>