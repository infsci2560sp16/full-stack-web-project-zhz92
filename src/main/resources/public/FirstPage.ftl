<!DOCTYPE HTML>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome</title>
    <link rel="stylesheet" href="stylesheets/stylesheet1.css ">


      </head>
      <body>
        <div id="header">
          <h1>Welcome to ${WebTitle}</h1>
        </div>


        <div id="nav">
        <#list references as reference>
        ${reference_index + 1}. <a class="btn" href="${reference.url}"> ${reference.title} </a>
        </#list>

        /*  <a class="btn" href="./FirstPage.html" >Introduction</a>
          <a class="btn" href="./SecondPage.html" >LogIn</a>
          <a class="btn" href="./ThirdPage.html" >SingIn</a>
          <a class="btn" href="./FourthPage.html" >Search</a>
          <a class="btn" href="./FifthPage.html" >Survey</a>
          */
        </div>

        <div id="section">
          <h1>Introduction</h1>
          <p>This is an introduction on my web pages. Basically, there are five separate web pages
            with HTML5 and I am going to apply javascript and css for each of them. This is my first
            web page design and hope you will like it.</p>
            <p>I am going to breakdown my list of webpages and give some more details about them hereafter.
            </p>
          </div>

          <div id="footer">
            Webpages@David  <br>zhz92@pitt.edu
          </div>

        </body>
        </html>
