const carousel=document.querySelector(".carousel");
const prevBtn=document.querySelector(".prevBtn");
const nextBtn=document.querySelector(".nextBtn");

let idx=0;

if(idx==0){
    prevBtn.style.visibility="hidden";
}

prevBtn.addEventListener("click", function(){
    if(idx==0) {
        return;
    }
    if(idx==1){
        prevBtn.style.visibility="hidden";
    }
    nextBtn.style.visibility="visible";
    idx-=1;
    carousel.style.transform=`translateX(${-800*idx}px)`;
    console.log(idx);
});

nextBtn.addEventListener("click", function(){
    if(idx==2){
        return;
    }
    if(idx==1){
        nextBtn.style.visibility="hidden";
    }
    prevBtn.style.visibility="visible";
    idx+=1;
    carousel.style.transform=`translateX(${-800*idx}px)`;
    console.log(idx);
});