<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link href="${root}/resource/css/Login.css" type ="text/css" rel ="stylesheet"/>

<main>
	<div class="background-wrap">
		<div class="background"></div>
	</div>
	
	<form id="accesspanel" action="login" method="post">
		<h1 id="litheader">ADMIN LOGIN</h1>
		<div class="inset">
			<p>
				<input type="text" name="username" id="id"
					placeholder="Admin ID">
			</p>
			<p>
				<input type="password" name="password" id="password"
					placeholder="Password">
			</p>
			<div style="text-align: center;">
				<div class="checkboxouter">
					<input type="checkbox" name="rememberme" id="remember"
						value="Remember"> <label class="checkbox"></label>
				</div>
				<label for="remember">Remember me for 14 days</label>
			</div>
			<input class="loginLoginValue" type="hidden" name="service"
				value="login" />
		</div>
		<p class="p-container">
			<input type="submit" name="Login" id="go" value="Authorize">
		</p>
	</form>
</main>

<script>
$(document).ready(function() {

    var state = false;

    //$("input:text:visible:first").focus();

    $('#accesspanel').on('submit', function(e) {

        e.preventDefault();

        state = !state;

        if (state) {
            document.getElementById("litheader").className = "poweron";
            document.getElementById("go").className = "";
            document.getElementById("go").value = "Initializing...";
        }else{
            document.getElementById("litheader").className = "";
            document.getElementById("go").className = "denied";
            document.getElementById("go").value = "Access Denied";
        }

    });

});
</script>