const divBoard=document.querySelector(".table");
const divHome=document.querySelector(".home");
const navBoard=document.querySelector("#navBoard");
const navHome=document.querySelector("#navHome");
const navLogo=document.querySelector("#navLogo");

navHome.addEventListener("click", function(e){
	e.preventDefault();
	navBoard.classList.remove("currentNav");
	navHome.classList.add("currentNav");
	divBoard.classList.remove("currentPage");
	divHome.classList.add("currentPage");
});

navLogo.addEventListener("click", function(e){
	e.preventDefault();
});

navBoard.addEventListener("click", function(e){
    e.preventDefault();
    navHome.classList.remove("currentNav");
    navBoard.classList.add("currentNav");
    divHome.classList.remove("currentPage");
    divBoard.classList.add("currentPage");
})