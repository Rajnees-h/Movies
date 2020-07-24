<%-- 
    Document   : home
    Created on : 2 Apr, 2019, 7:11:07 PM
    Author     : rowdy
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.movies.Movies"%>
<%@page import="com.movies.DbConnection"%>
<%@page import="java.util.*"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
         <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="/css/bootstrap.min.css">
  <script src="jquery.min.js"></script>
  <script src="/js/bootstrap.min.js"></script>
  
    <style>
        .container-fluid{
           margin: 0px;
           padding: 0px;
           border :0px;
    
        }
        body{
           margin: 0px;
           padding: 0px;
           border :0px;
           background-color: lightblue;
        }
        
        .row{
           margin: 0px;
           padding: 0px;
           border :0px;
        
        }
        .navbar{
          margin: 0px;
          padding: 0px;
          border-color:gray;
          border-style:solid;
          border-width:0px 0px 0.1px 0px;

        }
        
  </style>
  
    </head>
    <body>
       

 
    <div class="container-fluid">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
        <li data-target="#myCarousel" data-slide-to="4"></li>
      <li data-target="#myCarousel" data-slide-to="5"></li>
      <li data-target="#myCarousel" data-slide-to="6"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="img/corosal/endgame_1.jpg" alt="End Game" style="width:100%;">
      </div>

      <div class="item">
        <img src="img/corosal/captain-marvel.jpeg" alt="Captain-marvel" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="https://gdurl.com/leyE" alt="Spider-man" style="width:100%;">
      </div>
          <div class="item">
        <img src="img/corosal/kick.jpg" alt="Kick" style="width:100%;">
      </div>
           <div class="item">
        <img src="img/corosal/r_rajkumar.jpg" alt="R_Rajkumar" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="img/corosal/dhoom.jpg" alt="Dhoom" style="width:100%;">
      </div>
          <div class="item">
        <img src="img/corosal/tadakha.jpg" alt="Tadakha" style="width:100%;">
      </div>
        
    </div>
    
    

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
  

  
<div class="container-fluid bg-3 text-center">    
  <h3>Super Hit Movies</h3><br>
  
  <%
       ArrayList<Movies> movies = DbConnection.getMovies();
     
       for(int i=0;i<movies.size();i += 4)
       {
               %>                
               <div class="row">                   
                  <%
                      for(int j=i; j<movies.size() && j< i+4 ;j++)
                      {
                          %>                  
                            <div class="col-sm-3"> 
                                <img src="img/<%= movies.get(j).getThumbnail() %>" class="img-responsive" style="width:600px ; height:200px" alt="Image">
                                <h5><a href=""  ><%= movies.get(j).getMovie_name() %> </a></h5>
                            </div>                          
                           <%                      
                      }
                  %>
                </div>
                <br>
               
               <%
      
       }
       
  %>
  
</div>



</body>
</html>
    </body>
</html>
