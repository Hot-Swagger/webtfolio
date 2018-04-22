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
			<div>
				<span>사용기술: </span>
				<div>
					<a>기술1</a>
					<a>기술2</a>
					<a>기술3</a>
				</div>
			</div>
			<div>
				<span>카테고리: </span>
				<div>
					<a>SI 프로젝트</a>
				</div>
			</div>
			<div>
				<span>개발기간: </span>
				<div>
					<span>3개월</span>
				</div>
			</div>
			<div>
				<span>참여인원: </span>
				<div>
					<span>6명</span>
				</div>
			</div>
		</section>
		<section class="portfolio-detail portfolio-detail-description">
			<h1>프로젝트 상세설명</h1>
			<div>
				<span>담당역할: </span>
				<div>
					<span></span>
				</div>
			</div>
			<div>
				<span>상세설명: </span>
				<div>
					<span></span>
				</div>
			</div>
		</section>
	</div>
</main>