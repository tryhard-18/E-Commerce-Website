let ProductImg = document.getElementById('productImg');
let SmallImg = document.getElementsByClassName('small-img-1');
let Img = document.getElementsByClassName('small-img');

// SmallImg[0].addEventListener('click', function run(){
//   ProductImg.src = SmallImg[0].src;
// });
// SmallImg[1].addEventListener('click', function run(){
//   ProductImg.src = SmallImg[1].src;
// });
// SmallImg[2].addEventListener('click', function run(){
//   ProductImg.src = SmallImg[2].src;
// });
// SmallImg[3].addEventListener('click', function run(){
//   ProductImg.src = SmallImg[3].src;
// });
// SmallImg[4].addEventListener('click', function run(){
//   ProductImg.src = SmallImg[4].src;
// });
// SmallImg[5].addEventListener('click', function run(){
//   ProductImg.src = SmallImg[5].src;
// });


Img[0].style.border = '2px solid black';

Img[0].onclick = function(){
  ProductImg.src = SmallImg[0].src;
  // ProductImg.style.width = '231px';
  ProductImg.style.width = '15vw';
  Img[0].style.border = '2px solid black';
  Img[1].style.border = '1px solid black';
  Img[2].style.border = '1px solid black';
  Img[3].style.border = '1px solid black';
  Img[4].style.border = '1px solid black';
  Img[5].style.border = '1px solid black';
}
Img[1].onclick = function(){
  // ProductImg.style.height = '500px';
  // ProductImg.style.width = '500px';
  ProductImg.style.height = '30vw';
  ProductImg.style.width = '30vw';
  ProductImg.src = SmallImg[1].src;
  Img[0].style.border = '1px solid black';
  Img[1].style.border = '2px solid black';
  Img[2].style.border = '1px solid black';
  Img[3].style.border = '1px solid black';
  Img[4].style.border = '1px solid black';
  Img[5].style.border = '1px solid black';
}
Img[2].onclick = function(){
  ProductImg.src = SmallImg[2].src;
  // ProductImg.style.width = '231px';
  ProductImg.style.width = '15vw';
  Img[0].style.border = '1px solid black';
  Img[1].style.border = '1px solid black';
  Img[2].style.border = '2px solid black';
  Img[3].style.border = '1px solid black';
  Img[4].style.border = '1px solid black';
  Img[5].style.border = '1px solid black';
}
Img[3].onclick = function(){
  ProductImg.src = SmallImg[3].src;
  // ProductImg.style.height = '500px';
  // ProductImg.style.width = '500px';
  ProductImg.style.height = '30vw';
  ProductImg.style.width = '30vw';
  Img[0].style.border = '1px solid black';
  Img[1].style.border = '1px solid black';
  Img[2].style.border = '1px solid black';
  Img[3].style.border = '2px solid black';
  Img[4].style.border = '1px solid black';
  Img[5].style.border = '1px solid black';
}
Img[4].onclick = function(){
  ProductImg.src = SmallImg[4].src;
  // ProductImg.style.width = '150px';
  ProductImg.style.width = '20vw';
  Img[0].style.border = '1px solid black';
  Img[1].style.border = '1px solid black';
  Img[2].style.border = '1px solid black';
  Img[3].style.border = '1px solid black';
  Img[4].style.border = '2px solid black';
  Img[5].style.border = '1px solid black';
}
Img[5].onclick = function(){
  ProductImg.src = SmallImg[5].src;
  // ProductImg.style.width = '150px';
  ProductImg.style.width = '10vw';
  Img[0].style.border = '1px solid black';
  Img[1].style.border = '1px solid black';
  Img[2].style.border = '1px solid black';
  Img[3].style.border = '1px solid black';
  Img[4].style.border = '1px solid black';
  Img[5].style.border = '2px solid black';
}

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