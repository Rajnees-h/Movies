<%-- 
    Document   : Movies.jsp
    Created on : 21 Jul, 2020, 7:14:28 AM
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
        <title>Gallery</title>
        <style>
                @media (min-width: 768px) {
                .carousel-multi-item-2 .col-md-3 {
                float: left;
                width: 25%;
                max-width: 100%; } }

                .carousel-multi-item-2 .card img {
                border-radius: 2px; }
                
                
                 .pb-video-container {
        padding-top: 20px;
        background: #bdc3c7;
        font-family: Lato;
    }

    .pb-video {
        border: 1px solid #e6e6e6;
        padding: 5px;
    }

        .pb-video:hover {
            background: #2c3e50;
        }

    .pb-video-frame {
        transition: width 2s, height 2s;
    }

        .pb-video-frame:hover {
            height: 300px;
        }

    .pb-row {
        margin-bottom: 10px;
    }
                
                
        </style>
    </head>
    <body>
            
             <!--Carousel Wrapper-->
        
   
 <div class="container-fluid pb-video-container">
    <div class="col-md-10 col-md-offset-1">
        <h3 class="text-center">Movies Trailer</h3>    
          
          
  <%
       ArrayList<Movies> movies = DbConnection.getMovies();
       
     for(int i=0;i<Math.ceil(movies.size()/4f);i++)
       {
          %> 
            <div class="row pb-row">
               <%
                   if(4*i+0 < movies.size())
                   {
             %>
            <div class="col-md-3 pb-video">
                <iframe class="pb-video-frame" width="100%" height="230" src="<%= movies.get(4*i+0).getUrl() %>" frameborder="0" allowfullscreen></iframe>
                <label class="form-control label-warning text-center"><%= movies.get(4*i+0).getMovie_name() %></label>
            </div> 
                <%
                   }
                    if(4*i+1 < movies.size())
                    {
               %> 
             <div class="col-md-3 pb-video">
                <iframe class="pb-video-frame" width="100%" height="230" src="<%= movies.get(4*i+1).getUrl() %>" frameborder="0" allowfullscreen></iframe>
                <label class="form-control label-warning text-center"><%= movies.get(4*i+1).getMovie_name() %></label>
            </div> 
            <%
                }
                    if(4*i+2 < movies.size())
                    {
            %>
             <div class="col-md-3 pb-video">
                <iframe class="pb-video-frame" width="100%" height="230" src="<%= movies.get(4*i+2).getUrl() %>" frameborder="0" allowfullscreen></iframe>
                <label class="form-control label-warning text-center"><%= movies.get(4*i+2).getMovie_name() %></label>
            </div> 
            <%
                    }
                    if(4*i+3 < movies.size()){
            %>
             <div class="col-md-3 pb-video">
                <iframe class="pb-video-frame" width="100%" height="230" src="<%= movies.get(4*i+3).getUrl() %>" frameborder="0" allowfullscreen></iframe>
                <label class="form-control label-warning text-center"><%= movies.get(4*i+3).getMovie_name() %></label>
            </div>
            <%
            }
            %>
               </div> 
           <%
       }       
  %>
  
           
    </div>
</div>                                                                   
        

  

    </body>
</html>

