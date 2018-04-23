<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<main class="main">
	<div class="profile-main-container">
		<div class="profile-detail-visual">
			<p>포트폴리오 등록 페이지</p>
			<form>
				<section class="portfolio-detail portfolio-detail-info">
					<h1>포트폴리오 등록</h1>
					<div>
						<label for="title">제목:</label>
						<input id="title" type="text" name="title"/>
						<label for="category">카테고리:</label>
						<select id="category">
							<option>ALL</option>
							<option>SI 프로젝트</option>
							<option>어플리케이션</option>
						</select>
						<input type="date" name="startDate"/>
						
						<input type="date" name="endDate"/>
						
						<div>
							<div>
								<span>아사아블로이코리아(주)유니락</span>
								<span>웹개발자</span>
							</div>
							<div>
								<span>ERP 개발</span>
								<span>ERP 개발</span>
								<span>ERP 개발</span>
							</div>
						</div>
					</div>
				</section>
			</form>
		</div>
	</div>
</main>