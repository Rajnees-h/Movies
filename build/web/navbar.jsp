<%-- 
    Document   : navbar
    Created on : 26-mar-2018, 21.52.23
    Author     : prof.andreapollini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<head>
    <style>
        *{
               margin: 0px;
                padding: 0px;
                border: 0px;
        }
        .container-fluid{
                  margin: 0px;
                padding: 0px;
                border: 0px;
        }
    </style>
</head>

<%
    String user = "Guest";
    
    Cookie[] cookie = request.getCookies();
    
    for(Cookie c : cookie)
    {
        if(c.getName().equals("username"))
        {
            user = c.getValue();
        }
    }



%>

<body>
    <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#"><%= " "+user %></a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="index.jsp?m=1">Home</a></li>
        <li><a href="index.jsp?m=5">About</a></li>
        <li><a href="index.jsp?m=4">Premium Videos</a></li>
        <li><a href="index.jsp?m=6">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">

          <li><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
         <li><a href="index.jsp?m=2"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
</body>