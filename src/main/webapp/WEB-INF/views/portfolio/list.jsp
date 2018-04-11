<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link rel="stylesheet" href="${root}/resource/css/Nwagon.css" type="text/css">
<script src="${root}/resource/js/Nwagon.js"></script>
<main class="main">
	<section>
		<h1>Language & Platform</h1>
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
	<section class="note-list">
		<h1>PORTFOLIO LIST</h1>
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