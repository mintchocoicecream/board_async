const divBoard=document.querySelector(".table");
const curPage=document.querySelector(".currentPage");
const navBoard=document.querySelector("#navBoard");
const curNav =document.querySelector(".currentNav");

navBoard.addEventListener("click", function(e){
    e.preventDefault();
    curNav.classList.remove("currentNav");
    navBoard.classList.add("currentNav");
    curPage.classList.remove("currentPage");
    divBoard.classList.add("currentPage");
})