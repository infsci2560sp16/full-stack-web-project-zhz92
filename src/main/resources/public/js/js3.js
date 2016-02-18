
var element = document.getElementById("h2");
element.innerHTML = "No accout yet? Get your account here by just one click!";

function myFunction() {
    var str = "Must See Links!";
    var result = str.link( "https://www.ted.com/talks/jane_mcgonigal_gaming_can_make_a_better_world?language=en");
    document.getElementById("demo").innerHTML = result;}
