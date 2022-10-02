var slideIndex = 1;
showSlides(slideIndex);

// Next/previous controls
function plusSlides(n) {
  showSlides(slideIndex += n);
}

// Thumbnail image controls
function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";
  dots[slideIndex-1].className += " active";
}

function openPage() {
  var search = document.getElementById('search');
  var input = document.getElementById('searchInput');
  var sno = document.getElementById('unique').value;
  if(input.value == "realme mobiles" || input.value == "realmemobiles")
  search.action = '/real/'+sno;
  else if(input.value == "acer laptops" || input.value == "acerlaptops")
  search.action = '/acer/'+sno;
  else if(input.value == "acer predator" || input.value == "acerpredator")
  search.action = '/acerpredator/'+sno+'/'+'1';
}

//function openPage() {
//  var search = document.getElementById('search');
//  var input = document.getElementById('searchInput');
//  if(input.value == "realme mobiles" || input.value == "realmemobiles")
//  search.action = '/real';
//  else if(input.value == "acer laptops" || input.value == "acerlaptops")
//  search.action = '/acer';
//}

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



// var slideIndex = 1;
// showSlides(slideIndex);

// // Next/previous controls
// function plusSlides(n) {
//   showSlides(slideIndex += n);
// }

// // Thumbnail image controls
// function currentSlide(n) {
//   showSlides(slideIndex = n);
// }

// function showSlides(n) {
//   var i;
//   var slides = document.getElementsByClassName("mySlides");
//   var dots = document.getElementsByClassName("dot");
//   if (n > slides.length) {slideIndex = 1}
//   if (n < 1) {slideIndex = slides.length}
//   for (i = 0; i < slides.length; i++) {
//       slides[i].style.display = "none";
//   }
//   for (i = 0; i < dots.length; i++) {
//       dots[i].className = dots[i].className.replace(" active", "");
//   }
//   slides[slideIndex-1].style.display = "block";
//   dots[slideIndex-1].className += " active";
// }

// function runlogin(){
//   let LoginSignUp=document.getElementById('loginsignup');
//   LoginSignUp.action='/login/login.html';
// }

// function openPage() {
//   var search = document.getElementById('search');
//   var input = document.getElementById('searchInput');
//   if(input.value == "realme mobiles" || input.value == "realmemobiles")
//   search.action = '/realmeMobiles.html';
//   else if(input.value == "acer laptops" || input.value == "acerlaptops")
//   search.action = '/acerLaptops.html';
// }





