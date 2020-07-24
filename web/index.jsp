<%-- 
    Document   : index.jsp
    Created on : 2 Apr, 2019, 6:15:52 PM
    Author     : rowdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  
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
  
  
  <style>
     *{
               margin: 0px;
              padding: 0px;
              border :0px;
      }
      .container-fluid{   
               margin: 0px;
              padding: 0px;
              border :0px;
      }
      .internal-body{   
       
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
      .empty{
          margin: 0;
       padding-top: 0;
      }
      
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Add a gray background color and some padding to the footer */
    footer {
        background-color: #ffffff;
      padding: 25px;
    }
  </style>
  
   
  
</head>
<body>

    <div>
         <%@include file="navbar.jsp" %>
    </div>

         <div class="internal-body">
        <% int s = 1;
            if(!(request.getParameter("m")==null))
            s = Integer.parseInt(request.getParameter("m")); 

        switch(s)
        {
            case 1: %> <%@include file="Movies.jsp" %>  <% break;
            case 2: %> <%@include file="login.jsp" %>  <% break;
            case 3: %> <%@include file="newAccount.jsp" %>  <% break;
            case 4: %> <%@include file="gallery.jsp" %>  <% break;
            case 5: %> <%@include file="about.jsp" %>  <% break;
            case 6: %> <%@include file="contact.jsp" %>  <% break;
          
        }
        
        
        %>
      
    </div> 


<footer>
    
   <%@include file="footer.jsp" %>
 
</footer>

</body>
</html>

