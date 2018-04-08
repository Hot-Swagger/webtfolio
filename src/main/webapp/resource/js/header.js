window.addEventListener("load",function(){
    var menuButton = document.querySelector(".header-menu li:last-child");
    var adminButton = document.querySelector("#admin-menu-select");
    var mainMenu = document.querySelector(".main-menu");
    var adminMenuList = document.querySelectorAll(".admin-menu");
    
    menuButton.onclick = function(){
        if(!mainMenu.classList.contains("show"))
            mainMenu.classList.add("show");
        else
            mainMenu.classList.remove("show");
    };

    adminButton.onclick = function(){
        for(var i=0; adminMenuList.length; i++){
	        if(!adminMenuList[i].classList.contains("show"))
	            adminMenuList[i].classList.add("show");
	        else
	            adminMenuList[i].classList.remove("show");
        }
    }
});