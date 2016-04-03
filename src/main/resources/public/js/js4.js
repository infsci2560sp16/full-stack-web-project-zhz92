var element = document.getElementById("h2");
element.innerHTML = "Search for what you like here!";

function myFunction1() {
    var str = "Must See Links!";
    var result = str.link( "http://store.steampowered.com");
    document.getElementById("link1").innerHTML = result;
  }

  function myFunction2() {
      var str = "Must See Links!";
      var result = str.link( "http://us.blizzard.com/en-us/");
      document.getElementById("link2").innerHTML = result;
    }

    function myFunction3() {
        var str = "Must See Links!";
        var result = str.link( "http://www.tgbus.com");
        document.getElementById("link3").innerHTML = result;
      }

      function loadDoc() {
          var str = "View Collections";
          var result = str.link( "./FirstPage.html");
          document.getElementById("link4").innerHTML = result;
        }
