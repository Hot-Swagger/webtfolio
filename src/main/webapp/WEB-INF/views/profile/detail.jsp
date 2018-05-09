<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<main class="main">
	<p class="hidden">프로필 페이지</p>
	<div class="wrapper">
        <div class="sidebar-wrapper">
            <div class="profile-container">
                <img class="profile" src="${root}/resource/assets/images/${profile.photo}" alt="" />
                <h1 class="name">${profile.name}</h1>
                <h3 class="tagline">${profile.mainJob}</h3>
            </div><!--//profile-container-->
            
            <div class="contact-container container-block">
                <ul class="list-unstyled contact-list">
                    <li class="email"><i class="fa fa-envelope"></i><a href="mailto: ${profile.email}">${profile.email}</a></li>
                    <li class="phone"><i class="fa fa-phone"></i><a href="tel:${profile.phone}">${profile.phone}</a></li>
                    <li class="website"><i class="fa fa-globe"></i><a href="http://${profile.website}/index" target="_blank">${profile.website}</a></li>
                    <!-- <li class="linkedin"><i class="fa fa-linkedin"></i><a href="#" target="_blank">linkedin.com/in/alandoe</a></li> -->
                    <li class="github"><i class="fa fa-github"></i><a href="http://${profile.github}" target="_blank">${profile.github}</a></li>
                    <!-- <li class="twitter"><i class="fa fa-twitter"></i><a href="https://twitter.com/3rdwave_themes" target="_blank">@twittername</a></li> -->
                </ul>
            </div><!--//contact-container-->
            <div class="languages-container container-block">
                <h2 class="container-block-title">PROFILE</h2>
                <ul class="list-unstyled interests-list">
                    <li><fmt:formatDate value="${profile.birthday}" pattern="yyyy"/>년생 <span class="lang-desc">(만32세)</span></li>
                    <li>${profile.address}</li>
                    <!-- <li>Spanish <span class="lang-desc">(Professional)</span></li> -->
                </ul>
            </div><!-- //interests -->
            <div class="education-container container-block">
                <h2 class="container-block-title">Education</h2>
                <div class="item">
                    <h4 class="degree">${profile.major} 전공</h4>
                    <h5 class="meta">${profile.school}</h5>
                    <div class="time"><fmt:formatDate value="${profile.matrDate}" pattern="yyyy"/> - <fmt:formatDate value="${profile.gradDate}" pattern="yyyy"/></div>
                </div><!--//item-->
               <!--  <div class="item">
                    <h4 class="degree">BSc in Applied Mathematics</h4>
                    <h5 class="meta">Bristol University</h5>
                    <div class="time">2007 - 2011</div>
                </div>//item -->
            </div><!--//education-container-->
            
            
            <div class="interests-container container-block">
                <h2 class="container-block-title">Certificate</h2>
                <ul class="list-unstyled interests-list">
                <c:forEach var="cert" items="${certList}">
                    <li>${cert.name}</li>
                </c:forEach>
                </ul>
            </div><!--//interests-->
            
        </div><!--//sidebar-wrapper-->
        
        <div class="main-wrapper">
            
            <section class="section summary-section">
                <h2 class="section-title"><i class="fa fa-user"></i>Career Profile</h2>
                <div class="summary">
                	${profile.produce}
                </div><!--//summary-->
            </section><!--//section-->
            
            <section class="section experiences-section">
                <h2 class="section-title"><i class="fa fa-briefcase"></i>Experiences</h2>
                <c:forEach var="exp" items="${expList}">
                <div class="item">
                    <div class="meta">
                        <div class="upper-row">
                            <h3 class="job-title">${exp.business}</h3>
                            <c:if test="${exp.inOffice == true}">
                            <div class="time"><fmt:formatDate value="${exp.entDate}" pattern="yyyy"/> - 재직중</div>
                            </c:if>
                            <c:if test="${exp.inOffice == false}">
                            <div class="time"><fmt:formatDate value="${exp.entDate}" pattern="yyyy"/> - <fmt:formatDate value="${exp.leavDate}" pattern="yyyy"/></div>
                            </c:if>
                        </div><!--//upper-row-->
                        <div class="company">${exp.company}</div>
                    </div><!--//meta-->
                    <div class="details">
                       ${exp.detail}                        
                    </div><!--//details-->
                </div><!--//item-->
                </c:forEach>
            </section><!--//section-->
            <!-- 
            <section class="section projects-section">
                <h2 class="section-title"><i class="fa fa-archive"></i>Projects</h2>
                <div class="intro">
                    <p>You can list your side projects or open source libraries in this section. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum et ligula in nunc bibendum fringilla a eu lectus.</p>
                </div>//intro
                <div class="item">
                    <span class="project-title"><a href="#hook">Velocity</a></span> - <span class="project-tagline">A responsive website template designed to help startups promote, market and sell their products.</span>
                    
                </div>//item
                <div class="item">
                    <span class="project-title"><a href="http://themes.3rdwavemedia.com/website-templates/responsive-bootstrap-theme-web-development-agencies-devstudio/" target="_blank">DevStudio</a></span> - 
                    <span class="project-tagline">A responsive website template designed to help web developers/designers market their services. </span>
                </div>//item
                <div class="item">
                    <span class="project-title"><a href="http://themes.3rdwavemedia.com/website-templates/responsive-bootstrap-theme-for-startups-tempo/" target="_blank">Tempo</a></span> - <span class="project-tagline">A responsive website template designed to help startups promote their products or services and to attract users &amp; investors</span>
                </div>//item
                <div class="item">
                    <span class="project-title"><a href="hhttp://themes.3rdwavemedia.com/website-templates/responsive-bootstrap-theme-mobile-apps-atom/" target="_blank">Atom</a></span> - <span class="project-tagline">A comprehensive website template solution for startups/developers to market their mobile apps. </span>
                </div>//item
                <div class="item">
                    <span class="project-title"><a href="http://themes.3rdwavemedia.com/website-templates/responsive-bootstrap-theme-for-mobile-apps-delta/" target="_blank">Delta</a></span> - <span class="project-tagline">A responsive Bootstrap one page theme designed to help app developers promote their mobile apps</span>
                </div>//item
            </section>//section
             -->
            <!-- <section class="skills-section section">
                <h2 class="section-title"><i class="fa fa-rocket"></i>Skills &amp; Proficiency</h2>
                <div class="skillset">        
                    <div class="item">
                        <h3 class="level-title">Java</h3>
                        <div class="level-bar">
                            <div class="level-bar-inner" data-level="98%">
                            </div>                                      
                        </div>//level-bar                                 
                    </div>//item
                    
                    <div class="item">
                        <h3 class="level-title">Javascript &amp; jQuery</h3>
                        <div class="level-bar">
                            <div class="level-bar-inner" data-level="98%">
                            </div>                                      
                        </div>//level-bar                                 
                    </div>//item
                    
                    <div class="item">
                        <h3 class="level-title">HTML5 &amp; CSS</h3>
                        <div class="level-bar">
                            <div class="level-bar-inner" data-level="98%">
                            </div>                                      
                        </div>//level-bar                                 
                    </div>//item
                    
                    <div class="item">
                        <h3 class="level-title">Spring Framework</h3>
                        <div class="level-bar">
                            <div class="level-bar-inner" data-level="95%">
                            </div>                                      
                        </div>//level-bar                                 
                    </div>//item
                    
                    <div class="item">
                        <h3 class="level-title">Mybatis Framework</h3>
                        <div class="level-bar">
                            <div class="level-bar-inner" data-level="85%">
                            </div>                                      
                        </div>//level-bar                                 
                    </div>//item
                    
                    <div class="item">
                        <h3 class="level-title">Oracle Database</h3>
                        <div class="level-bar">
                            <div class="level-bar-inner" data-level="60%">
                            </div>                                      
                        </div>//level-bar                                 
                    </div>//item
                    
                </div>  
            </section>//skills-section
             -->
        </div><!--//main-body-->
    </div>
</main>