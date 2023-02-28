const writeBtnDiv=document.querySelector(".tableWriteBtn");
const writeBtn=writeBtnDiv.querySelector("button");
const writeDiv=document.querySelector(".write");
const writeBtns=document.querySelector(".writeBtns");
const btnCancel=writeBtns.querySelector(".btnWhite");

writeBtn.addEventListener("click", function(e){
    e.preventDefault();
    writeDiv.classList.add("showWrite");
});

btnCancel.addEventListener("click", function(e){
    e.preventDefault();
    writeDiv.classList.remove("showWrite");
});