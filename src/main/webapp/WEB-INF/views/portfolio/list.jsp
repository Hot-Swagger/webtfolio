<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link rel="stylesheet" href="${root}/resource/css/Nwagon.css" type="text/css">
<script src="${root}/resource/js/Nwagon.js"></script>
<main class="main">
	<section>
		<h1 style="padding: 0 10px;">Programming skills</h1>
		<div id="chart_d" style="margin-left:-10px;"></div>
		<script>
			
			var options = {
				'dataset': {
					title: 'Web accessibility status',
					values:[18, 12, 3, 10, 7],
					colorset: ['#2BC8C9', '#FF8C00', '#DC143C','#2EB400', '#666666'],
					fields: ['Java', 'HTML/CSS',  'Oracle DB', 'JavaScript', 'Spring'] 
				},
				'donut_width' : 40, 
				'core_circle_radius':60,
				'chartDiv': 'chart_d',
				'chartType': 'donut',
				'chartSize': {width:370, height:240}
			};
	
			Nwagon.chart(options);
		</script>
	</section>
	<section class="index-portfolio">
		<h1 class="hidden">PORTFOLIO list</h1>
		<div class="portfolio-category">
			<button class="btn-lg btn-bright">ALL</button>
			<button class="btn-lg btn-bright">SI 프로젝트</button>
			<button class="btn-lg btn-bright">어플리케이션</button>
		</div>
		<article class="portfolio-frame">
			<img src="${root}/resource/images/yeogi-main.png" alt="포폴이미지"/>
			<div class="portfolio-rollover">
				<a href="${root}/portfolio/1">
					<img src="${root}/resource/images/ic_link_white_48dp_1x.png" alt="링크이미지">
				</a>
				<p>여행기록 웹페이지 "여기"</p>
			</div>
		</article>
		<article class="portfolio-frame">
			<img src="${root}/resource/images/yeogi-main.png" alt="포폴이미지"/>
			<div class="portfolio-rollover">
				<a href="${root}/portfolio/2">
					<img src="${root}/resource/images/ic_link_white_48dp_1x.png" alt="링크이미지">
				</a>
				<p>여행기록 웹페이지 "여기"</p>
			</div>
		</article>
		<article class="portfolio-frame">
			<img src="${root}/resource/images/yeogi-main.png" alt="포폴이미지"/>
			<div class="portfolio-rollover">
				<a href="${root}/portfolio/3">
					<img src="${root}/resource/images/ic_link_white_48dp_1x.png" alt="링크이미지">
				</a>
				<p>여행기록 웹페이지 "여기"</p>
			</div>
		</article>
	</section>
	<div id="index-load-portfolio">
		LOAD MORE PORTFOLIO
	</div>
</main>