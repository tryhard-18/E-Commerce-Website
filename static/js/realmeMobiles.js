let First = document.getElementsByClassName('first');
let Heading = document.getElementsByClassName('Heading');

First[0].addEventListener('mouseover', function run(){
    Heading[0].style.color = 'blue';
})
First[0].addEventListener('mouseout', function run() {
  Heading[0].style.color = 'black';
});

First[1].addEventListener('mouseover', function run(){
    Heading[1].style.color = 'blue';
})
First[1].addEventListener('mouseout', function run() {
  Heading[1].style.color = 'black';
});

First[2].addEventListener('mouseover', function run(){
    Heading[2].style.color = 'blue';
})
First[2].addEventListener('mouseout', function run() {
  Heading[2].style.color = 'black';
});

First[3].addEventListener('mouseover', function run(){
    Heading[3].style.color = 'blue';
})
First[3].addEventListener('mouseout', function run() {
  Heading[3].style.color = 'black';
});

First[4].addEventListener('mouseover', function run(){
  Heading[4].style.color = 'blue';
})
First[4].addEventListener('mouseout', function run() {
Heading[4].style.color = 'black';
});

First[5].addEventListener('mouseover', function run(){
  Heading[5].style.color = 'blue';
})
First[5].addEventListener('mouseout', function run() {
Heading[5].style.color = 'black';
});

burger=document.querySelector('.burger')
buttons=document.querySelector('.buttons')
navigation=document.querySelector('.navigation')
thirty=document.querySelector('.thirty')
forty=document.querySelector('.forty')
// navleft=document.querySelector('.nav-left')
fifty=document.querySelector('.fifty')
sixty=document.querySelector('.sixty')

burger.addEventListener('click', ()=>{
  buttons.classList.toggle('v-class-resp')
  navigation.classList.toggle('h-nav-resp')
  thirty.classList.toggle('v-class-resp')
  forty.classList.toggle('v-class-resp')
  fifty.classList.toggle('v-class-resp')
  sixty.classList.toggle('v-class-resp')
  // navleft.classList.toggle('v-class-resp')
})

//function openPage() {
//  var search = document.getElementById('search');
//  var input = document.getElementById('searchInput');
//  if(input.value == "realme mobiles" || input.value == "realmemobiles")
//  search.action = '/real';
//  else if(input.value == "acer laptops" || input.value == "acerlaptops")
//  search.action = '/acer';
//}

function openPage() {
  var search = document.getElementById('search');
  var input = document.getElementById('searchInput');
  var sno = document.getElementById('unique').value;
  if(input.value == "realme mobiles" || input.value == "realmemobiles")
  search.action = '/real/'+sno;
  else if(input.value == "acer laptops" || input.value == "acerlaptops")
  search.action = '/acer/'+sno;
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

First[6].addEventListener('mouseover', function run(){
  Heading[6].style.color = 'blue';
})
First[6].addEventListener('mouseout', function run() {
Heading[6].style.color = 'black';
});

First[7].addEventListener('mouseover', function run(){
  Heading[7].style.color = 'blue';
})
First[7].addEventListener('mouseout', function run() {
Heading[7].style.color = 'black';
});


// burger=document.querySelector('.burger')
// buttons=document.querySelector('.buttons')
// navigation=document.querySelector('.navigation')
// thirty=document.querySelector('.thirty')
// forty=document.querySelector('.forty')
// // navleft=document.querySelector('.nav-left')
// fifty=document.querySelector('.fifty')
// sixty=document.querySelector('.sixty')

// burger.addEventListener('click', ()=>{
//   buttons.classList.toggle('v-class-resp')
//   navigation.classList.toggle('h-nav-resp')
//   thirty.classList.toggle('v-class-resp')
//   forty.classList.toggle('v-class-resp')
//   fifty.classList.toggle('v-class-resp')
//   sixty.classList.toggle('v-class-resp')
//   // navleft.classList.toggle('v-class-resp')
// })