
$(function(){
	var main = $(".main");
	var profileMain = $(".profile-detail");
	var experienceMain = $(".experience-detail");
	var footer = $(".footer");
	var menuButton = $(".header-menu li:last-child");
	var adminButton = $("#admin-menu");
	var mainMenu = $(".main-menu");
	var adminMenuList = $(".admin-sub-menu");
	var adminMenuImg = $("#admin-menu-img");
	var portFrame = $(".portfolio-frame");
	var portRoll = $(".portfolio-rollover");
	
	main.css("min-height","calc(100% - 51px - "+footer.outerHeight()+"px)");
	profileMain.css("min-height",main.outerHeight());
	experienceMain.css("min-height",main.outerHeight());
	portRoll.css("height",portFrame.outerHeight() + "px");
	
	$(window).resize(function(){
		main.css("min-height","calc(100% - 51px - "+footer.outerHeight()+"px)");
		profileMain.css("min-height",main.outerHeight());
		experienceMain.css("min-height",main.outerHeight());
		portRoll.css("height",portFrame.outerHeight() + "px");
	});
	
	menuButton.click(function(){
		if(!mainMenu.hasClass("show"))
			mainMenu.addClass("show");
		else
			mainMenu.removeClass("show");
	});
	
	adminButton.click(function(){
		var img = adminMenuImg.get(0);
		if(!adminMenuList.hasClass("show")){
			adminMenuList.addClass("show");
			img.src = img.src.replace("down","up");
		}
		else{
			adminMenuList.removeClass("show");
			img.src = img.src.replace("up","down");
		}
	});
	
});