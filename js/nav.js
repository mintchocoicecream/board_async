const navBoard=document.querySelector("#navBoard");
const divBoard=document.querySelector(".table");
const curNav =document.querySelector(".currentNav");

navBoard.addEventListener("click", function(e){
    e.preventDefault("currentNav");
    curNav.classList.remove(".currentNav");
    navBoard.classList.add(".currentNav");
    divBoard.style.display="flex";
})