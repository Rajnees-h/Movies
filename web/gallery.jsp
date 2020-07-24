<%-- 
    Document   : galary
    Created on : 3 Apr, 2019, 8:47:04 PM
    Author     : rowdy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


  

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gallery</title>
       
    </head>
    <body>
        
      <%
    
    Cookie[] c = request.getCookies();
    
    if(c!=null)
    {
        String cName="";
        String cValue="";
        for(int i =0 ; i< c.length;i++)
        {
               cName = c[i].getName();
               if(cName.equals("username"))
                cValue = c[i].getValue();
        }
                       if(cValue == null || cValue.equals(""))
                       response.sendRedirect("index.jsp?m=2");
                       else{
     %>
        
      <!--Carousel Wrapper-->
        
   
 <div class="container-fluid pb-video-container">
    <div class="col-md-10 col-md-offset-1">
        <h3 class="text-center">Sample Video Gallery</h3>
        <div class="row pb-row">
            <div class="col-md-3 pb-video">
                <iframe class="pb-video-frame" width="100%" height="230" src="https://www.youtube.com/embed/K68UrdUOr2Y?list=RDzuAcaBkcYGE?ecver=1" frameborder="0" allowfullscreen></iframe>
                <label class="form-control label-warning text-center">Claydee - Alena</label>
            </div>
            <div class="col-md-3 pb-video">
                <iframe class="pb-video-frame" width="100%" height="230" src="https://www.youtube.com/embed/wjT2JVlUFY4?list=RDzuAcaBkcYGE?ecver=1" frameborder="0" allowfullscreen></iframe>
                <label class="form-control label-warning text-center">Manuel Riva - Mhm Mhm</label>
            </div>
            <div class="col-md-3 pb-video">
                <iframe class="pb-video-frame " width="100%" height="230" src="https://www.youtube.com/embed/papuvlVeZg8?list=RDzuAcaBkcYGE?ecver=1" frameborder="0" allowfullscreen></iframe>
                <label class="form-control label-warning text-center">Clean Bandit - Rockabye</label>
            </div>
            <div class="col-md-3 pb-video">
                <iframe class="pb-video-frame" width="100%" height="230" src="https://www.youtube.com/embed/Y1_VsyLAGuk?list=RDzuAcaBkcYGE?ecver=1" frameborder="0" allowfullscreen></iframe>
                <label class="form-control label-warning text-center">Burak Yeter - Tuesday</label>
            </div>
        </div>
        <div class="row pb-row">
            <div class="col-md-3 pb-video">
                <iframe class="pb-video-frame" width="100%" height="230" src="https://www.youtube.com/embed/UY1bt8ilps4?ecver=1" frameborder="0" allowfullscreen></iframe>
                <label class="form-control label-warning text-center">F.O. and Peeva - Lichnata</label>
            </div>
            <div class="col-md-3 pb-video">
                <iframe class="pb-video-frame" width="100%" height="230" src="https://www.youtube.com/embed/QpbQ4I3Eidg?ecver=1" frameborder="0" allowfullscreen></iframe>
                <label class="form-control label-warning text-center">Machine Gun - Bad Things</label>
            </div>
            <div class="col-md-3 pb-video">
                <iframe class="pb-video-frame" width="100%" height="230" src="https://www.youtube.com/embed/h3kRIxLruDs?ecver=" frameborder="0" allowfullscreen></iframe>
                <label class="form-control label-warning text-center">INNA - Say it with your body</label>
            </div>
            <div class="col-md-3 pb-video">
                <iframe class="pb-video-frame" width="100%" height="230" src="https://www.youtube.com/embed/Jr4TMIU9oQ4?ecver=1" frameborder="0" allowfullscreen></iframe>
                <label class="form-control label-warning text-center">INNA - Gimme Gimme</label>
            </div>
        </div>
         
    </div>
</div>


    </body>
</html>
<%
            
        }
        
       
    }

    

%>
