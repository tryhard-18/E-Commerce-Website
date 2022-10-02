// const { getEnabledCategories } = require("trace_events");

let Remove = document.getElementsByClassName('remove');
let mainRemove = document.getElementsByClassName('main-remove');
let cartPage = document.getElementById('cart-page');
let second = document.getElementsByClassName('second');
let i=0;



Remove[0].onclick = function(){
    mainRemove[0].style.display = 'none';
    i++;
    // console.log(i);
    if(i==1){
        second[0].innerHTML = 'Price(2 items)';
        second[1].innerHTML = '150,000';
        second[2].innerHTML = '20,000';
        second[3].innerHTML = '130,000';
    }
    if(i==2){
        second[0].innerHTML = 'Price(1 item)';
        second[1].innerHTML = '78,000';
        second[2].innerHTML = '10,000';
        second[3].innerHTML = '68,000';
    }
    if(i==3){
        cartPage.innerHTML = '<h1>Nothing in cart.</h1>'
    }
}

Remove[1].onclick = function(){
    mainRemove[1].style.display = 'none';
    i++;
    if(i==1){
        second[0].innerHTML = 'Price(2 items)';
        second[1].innerHTML = '150,000';
        second[2].innerHTML = '20,000';
        second[3].innerHTML = '130,000';
    }
    if(i==2){
        second[0].innerHTML = 'Price(1 item)';
        second[1].innerHTML = '78,000';
        second[2].innerHTML = '10,000';
        second[3].innerHTML = '68,000';
    }
    // console.log(i);
    if(i==3){
        cartPage.innerHTML = '<h1>Nothing in cart.</h1>'
    }
}

Remove[2].onclick = function(){
    mainRemove[2].style.display = 'none';
    i++;
    // console.log(i);
    if(i==1){
        second[0].innerHTML = 'Price(2 items)';
        second[1].innerHTML = '150,000';
        second[2].innerHTML = '20,000';
        second[3].innerHTML = '130,000';
    }
    if(i==2){
        second[0].innerHTML = 'Price(1 item)';
        second[1].innerHTML = '78,000';
        second[2].innerHTML = '10,000';
        second[3].innerHTML = '68,000';
    }
    if(i==3){
        cartPage.innerHTML = '<h1>Nothing in cart.</h1>'
    }
}

burger=document.querySelector('.burger')
buttons=document.querySelector('.buttons')
navigation=document.querySelector('.navigation')
thirty=document.querySelector('.thirty')
// forty=document.querySelector('.forty')
// navleft=document.querySelector('.nav-left')
fifty=document.querySelector('.fifty')
sixty=document.querySelector('.sixty')

burger.addEventListener('click', ()=>{
  buttons.classList.toggle('v-class-resp')
  navigation.classList.toggle('h-nav-resp')
  thirty.classList.toggle('v-class-resp')
//   forty.classList.toggle('v-class-resp')
  fifty.classList.toggle('v-class-resp')
  sixty.classList.toggle('v-class-resp')
  // navleft.classList.toggle('v-class-resp')
})
// console.log(i);

function openPage() {
    var search = document.getElementById('search');
    var input = document.getElementById('searchInput');
    if(input.value == "realme mobiles" || input.value == "realmemobiles")
    search.action = '/real';
    else if(input.value == "acer laptops" || input.value == "acerlaptops")
    search.action = '/acer';
  }

  // Get the modal
var modal = document.getElementById("myModal");

// Get the button that opens the modal
var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks on the button, open the modal
btn.onclick = function() {
  modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
// window.onclick = function(event) {
//   if (event.target == modal) {
//     modal.style.display = "none";
//   }
// }
// Get the modal
var modal1 = document.getElementById("myModal1");

// Get the button that opens the modal
var btn1 = document.getElementById("myBtn1");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[1];

// When the user clicks on the button, open the modal
btn1.onclick = function() {
  modal1.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal1.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
  if (event.target == modal1) {
    modal1.style.display = "none";
  }
}



// for(let i=0;i<=Remove.length;i++)
// {
//     Remove[i].onclick = function(){
//     mainRemove[i].style.display = 'none';
// }
// }