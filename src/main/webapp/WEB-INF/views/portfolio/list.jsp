<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<main class="main">
	<section class="skills-section section">
		<h2 class="section-title"><i class="fa fa-rocket"></i>Skills &amp; Proficiency</h2>
		<div class="skillset">
			<c:forEach var="s" items="${skillList}" varStatus="status">
			<c:if test="${status.first}">
				<c:set var="first" value="${s.count}"/>
			</c:if>
		    <div class="item">
		        <h3 class="level-title"><span>${s.skillId}</span><span> [ ${s.count}회 ]</span></h3>
		        <div class="level-bar">
		            <div class="level-bar-inner" data-level="${s.count/first*100}%">
		            </div>                                      
		        </div><!--//level-bar-->                                 
		    </div><!--//item-->
		    </c:forEach>
	    </div>  
	</section><!--//skills-section-->
	<section class="index-portfolio">
		<h1 class="hidden">PORTFOLIO list</h1>
		<nav class="portfolio-category">
			<ul>
				<li class="btn-lg btn-bright">ALL</li>
				<li class="btn-lg btn-bright">SI 프로젝트</li>
				<li class="btn-lg btn-bright">어플리케이션</li>
			</ul>
		</nav>
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
</main>