<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<section class="main">
	<article class="index-profile">
		<h1 class="hidden">프로필</h1>
		<p>Hello, I am a <br/>Computer Programming <br/>Engineer~</p>
		<a href="${root}/profile/detail" class="btn-md btn-dark btn-profile-link">프로필 보기</a>
	</article>
	<section class="index-portfolio">
		<h1>RECENTLY PORTFOLIO</h1>
		<article class="portfolio-frame">
			<img src="${root}/resource/images/portfolio-spl.png" alt="포폴이미지"/>
			<div class="portfolio-rollover">
				<a href="${root}/portfolio/detail">
					<img src="${root}/resource/images/ic_link_white_48dp_1x.png" alt="링크이미지">
				</a>
				<p>여행기록 웹페이지 "여기"</p>
			</div>
		</article>
		<article class="portfolio-frame">
			<img src="${root}/resource/images/portfolio-spl.png" alt="포폴이미지"/>
			<div class="portfolio-rollover">
				<a href="${root}/portfolio/detail">
					<img src="${root}/resource/images/ic_link_white_48dp_1x.png" alt="링크이미지">
				</a>
				<p>여행기록 웹페이지 "여기"</p>
			</div>
		</article>
		<article class="portfolio-frame">
			<img src="${root}/resource/images/portfolio-spl.png" alt="포폴이미지"/>
			<div class="portfolio-rollover">
				<a href="${root}/portfolio/detail">
					<img src="${root}/resource/images/ic_link_white_48dp_1x.png" alt="링크이미지">
				</a>
				<p>여행기록 웹페이지 "여기"</p>
			</div>
		</article>
	</section>
	<div id="index-load-portfolio">
		LOAD MORE PORTFOLIO
	</div>
</section>