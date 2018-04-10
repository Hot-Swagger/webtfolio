<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<section class="main">
	<article class="index-profile">
		<h1 class="hidden">프로필</h1>
		<p>Hello, I am a <br/>Computer Programming <br/>Engineer~</p>
		<a href="${root}/profile/detail" class="btn btn-profile-link">프로필 보기</a>
	</article>
	<section class="index-portfolio">
		<h1>RECENTLY PORTFOLIO</h1>
		<article>
			<img src="${root}/resource/images/portfolio-spl.png" alt="포폴이미지"/>
		</article>
		<article>
			<img src="${root}/resource/images/portfolio-spl.png" alt="포폴이미지"/>
		</article>
		<article>
			<img src="${root}/resource/images/portfolio-spl.png" alt="포폴이미지"/>
		</article>
		<article>
			<img src="${root}/resource/images/portfolio-spl.png" alt="포폴이미지"/>
		</article>
		<article>
			<img src="${root}/resource/images/portfolio-spl.png" alt="포폴이미지"/>
		</article>
		<article>
			<img src="${root}/resource/images/portfolio-spl.png" alt="포폴이미지"/>
		</article>
	</section>
	<div id="index-load-portfolio">
		LOAD MORE PORTFOLIO
	</div>
</section>