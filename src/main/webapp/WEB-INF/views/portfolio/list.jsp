<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<main class="main">
	<section class="note-list">
		<h1 class="hidden">포트폴리오목록</h1>
		<ul>
			<c:forEach var="pf" items="${portfolios}">
			<li>
				<div><a href="">${pf.title}</a></div>
				<div>
					${pf.content}
				</div>
				<div><span>${pf.chapterId}</span><span>${pf.regDate}</span></div>
			</li>			
			</c:forEach>
		</ul>
	</section>
</main>