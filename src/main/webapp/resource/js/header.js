window.addEventListener("load",function(){
    var menuButton = document.querySelector(".header-menu li:last-child");
    var adminButton = document.querySelector("#admin-menu");
    var mainMenu = document.querySelector(".main-menu");
    var adminMenuList = document.querySelector(".admin-sub-menu");
    
    menuButton.onclick = function(){
        if(!mainMenu.classList.contains("show"))
            mainMenu.classList.add("show");
        else
            mainMenu.classList.remove("show");
    };

    adminButton.onclick = function(){
        var menubuttonImg = adminButton.querySelector("span:last-child>img");
        if(!adminMenuList.classList.contains("show")){
            adminMenuList.classList.add("show");
            menubuttonImg.src= menubuttonImg.src.replace("down","up");
        }
        else{
            adminMenuList.classList.remove("show");
            menubuttonImg.src = menubuttonImg.src.replace("up","down");
        }
    }
    
    
});