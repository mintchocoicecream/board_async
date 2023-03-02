const writeBtnDiv=document.querySelector(".tableWriteBtn");
const writeBtn=writeBtnDiv.querySelector("button");
const writeDiv=document.querySelector(".write");
const detailDiv=document.querySelector(".detail");
const checkInfo=document.querySelector(".checkInfo");
const writeBtns=document.querySelector(".writeBtns");
const btnCancel=writeBtns.querySelector(".btnCancel");
const btnBack=document.querySelector(".btnBack");
const btnEdit=document.querySelector(".btnEdit");
const btnSave=document.querySelector(".btnSave");
const btnDel=document.querySelector(".btnDel");
const btnChkOk=document.querySelector(".btnChkOk");
const btnChkCancel=document.querySelector(".btnChkCancel");
const editTitle=document.querySelector("#editTitle");
const editContent=document.querySelector("#editContent");
//const detailBtn=document.querySelector("tbody>tr>td>a");

writeBtn.addEventListener("click", function(e){
    e.preventDefault();
    writeDiv.classList.add("showWrite");
});

btnCancel.addEventListener("click", function(e){
    e.preventDefault();
    writeDiv.classList.remove("showWrite");
});

btnBack.addEventListener("click", function(e){
    e.preventDefault();
    detailDiv.classList.remove("showDetail");
});

/*
detailBtn.addEventListener("click", function(e){
    e.preventDefault();
    detailDiv.classList.add("showDetail");
})
*/

btnEdit.addEventListener("click", function(e){
    e.preventDefault();
    //editTitle.removeAttribute("readonly");
    //editContent.removeAttribute("readonly");
    checkInfo.classList.remove("hideCheck");
});

btnChkOk.addEventListener("click", function(e){
    e.preventDefault();
    //btnEdit.classList.add("hideBtn");
    //btnSave.classList.remove("hideBtn");
    //checkInfo.classList.add("hideCheck");
});

btnChkCancel.addEventListener("click", function(e){
    e.preventDefault();
    checkInfo.classList.add("hideCheck");
});

btnSave.addEventListener("click", function(e){
    e.preventDefault();
    btnEdit.classList.remove("hideBtn");
    this.classList.add("hideBtn");
    detailDiv.classList.remove("showDetail");
});