<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<section class="main">
	<article class="index-profile">
		<h1 class="hidden">프로필</h1>
		<p>Hello Java !!</p>
		<a href="${root}/profile/detail" class="btn-md btn-dark btn-profile-link">프로필 보기</a>
	</article>
	<section class="index-portfolio">
		<h1>RECENTLY PORTFOLIO</h1>
		<c:forEach var="p" items="${portList}">
		<article class="portfolio-frame">
			<c:forEach var="i" items="${imgList}">
			<c:if test="${p.id == i.portfolioId}">
			<img src="${root}/resource/images/${i.image}" alt="포폴이미지"/>
			</c:if>
			</c:forEach>
			<div class="portfolio-rollover">
				<a href="${root}/portfolio/${p.id}">
					<img src="${root}/resource/images/ic_link_white_48dp_1x.png" alt="링크이미지">
				</a>
				<p>${p.title}</p>
			</div>
		</article>
		</c:forEach>
	</section>
	<div id="index-load-portfolio">
		LOAD MORE PORTFOLIO
	</div>
</section>