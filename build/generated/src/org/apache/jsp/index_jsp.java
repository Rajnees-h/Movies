package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.movies.Movies;
import com.movies.DbConnection;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/navbar.jsp");
    _jspx_dependants.add("/Movies.jsp");
    _jspx_dependants.add("/login.jsp");
    _jspx_dependants.add("/newAccount.jsp");
    _jspx_dependants.add("/gallery.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Bootstrap Example</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <script src=\"jquery.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("  <style>\n");
      out.write("                @media (min-width: 768px) {\n");
      out.write("                .carousel-multi-item-2 .col-md-3 {\n");
      out.write("                float: left;\n");
      out.write("                width: 25%;\n");
      out.write("                max-width: 100%; } }\n");
      out.write("\n");
      out.write("                .carousel-multi-item-2 .card img {\n");
      out.write("                border-radius: 2px; }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 .pb-video-container {\n");
      out.write("        padding-top: 20px;\n");
      out.write("        background: #bdc3c7;\n");
      out.write("        font-family: Lato;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .pb-video {\n");
      out.write("        border: 1px solid #e6e6e6;\n");
      out.write("        padding: 5px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("        .pb-video:hover {\n");
      out.write("            background: #2c3e50;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    .pb-video-frame {\n");
      out.write("        transition: width 2s, height 2s;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("        .pb-video-frame:hover {\n");
      out.write("            height: 300px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    .pb-row {\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("    }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        </style>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <style>\n");
      out.write("     *{\n");
      out.write("               margin: 0px;\n");
      out.write("              padding: 0px;\n");
      out.write("              border :0px;\n");
      out.write("      }\n");
      out.write("      .container-fluid{   \n");
      out.write("               margin: 0px;\n");
      out.write("              padding: 0px;\n");
      out.write("              border :0px;\n");
      out.write("      }\n");
      out.write("      .internal-body{   \n");
      out.write("       \n");
      out.write("               margin: 0px;\n");
      out.write("              padding: 0px;\n");
      out.write("              border :0px;\n");
      out.write("      }\n");
      out.write("      .navbar{\n");
      out.write("          margin: 0px;\n");
      out.write("          padding: 0px;\n");
      out.write("          border-color:gray;\n");
      out.write("          border-style:solid;\n");
      out.write("          border-width:0px 0px 0.1px 0px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("      .empty{\n");
      out.write("          margin: 0;\n");
      out.write("       padding-top: 0;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("    /* Remove the navbar's default margin-bottom and rounded borders */ \n");
      out.write("    .navbar {\n");
      out.write("      margin-bottom: 0;\n");
      out.write("      border-radius: 0;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /* Add a gray background color and some padding to the footer */\n");
      out.write("    footer {\n");
      out.write("      background-color: #f2f2f2;\n");
      out.write("      padding: 25px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("  \n");
      out.write("   \n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("         ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("               margin: 0px;\n");
      out.write("                padding: 0px;\n");
      out.write("                border: 0px;\n");
      out.write("        }\n");
      out.write("        .container-fluid{\n");
      out.write("                  margin: 0px;\n");
      out.write("                padding: 0px;\n");
      out.write("                border: 0px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");

    String user = "Guest";
    
    Cookie[] cookie = request.getCookies();
    
    for(Cookie c : cookie)
    {
        if(c.getName().equals("username"))
        {
            user = c.getValue();
        }
    }




      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">");
      out.print( " "+user );
      out.write("</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"index.jsp?m=1\">Home</a></li>\n");
      out.write("        <li><a href=\"#\">About</a></li>\n");
      out.write("        <li><a href=\"index.jsp?m=4\">Premium Videos</a></li>\n");
      out.write("        <li><a href=\"#\">Contact</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("          <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Logout\"><span class=\"glyphicon glyphicon-log-out\"></span> Logout</a></li>\n");
      out.write("         <li><a href=\"index.jsp?m=2\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("</body>");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("         <div class=\"internal-body\">\n");
      out.write("        ");
 int s = 1;
            if(!(request.getParameter("m")==null))
            s = Integer.parseInt(request.getParameter("m")); 

        switch(s)
        {
            case 1: 
      out.write(' ');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Gallery</title>\n");
      out.write("        <style>\n");
      out.write("                @media (min-width: 768px) {\n");
      out.write("                .carousel-multi-item-2 .col-md-3 {\n");
      out.write("                float: left;\n");
      out.write("                width: 25%;\n");
      out.write("                max-width: 100%; } }\n");
      out.write("\n");
      out.write("                .carousel-multi-item-2 .card img {\n");
      out.write("                border-radius: 2px; }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 .pb-video-container {\n");
      out.write("        padding-top: 20px;\n");
      out.write("        background: #bdc3c7;\n");
      out.write("        font-family: Lato;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .pb-video {\n");
      out.write("        border: 1px solid #e6e6e6;\n");
      out.write("        padding: 5px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("        .pb-video:hover {\n");
      out.write("            background: #2c3e50;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    .pb-video-frame {\n");
      out.write("        transition: width 2s, height 2s;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("        .pb-video-frame:hover {\n");
      out.write("            height: 300px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    .pb-row {\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("    }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            \n");
      out.write("             <!--Carousel Wrapper-->\n");
      out.write("        \n");
      out.write("   \n");
      out.write(" <div class=\"container-fluid pb-video-container\">\n");
      out.write("    <div class=\"col-md-10 col-md-offset-1\">\n");
      out.write("        <h3 class=\"text-center\">Movies Trailer</h3>    \n");
      out.write("            <div class=\"row pb-row\">\n");
      out.write("          \n");
      out.write("  ");

       ArrayList<Movies> movies = DbConnection.getMovies();

     for(int i=0;i<movies.size();i++)
       {
          
      out.write("                  \n");
      out.write("            <div class=\"col-md-3 pb-video\">\n");
      out.write("                <iframe class=\"pb-video-frame\" width=\"100%\" height=\"230\" src=\"");
      out.print( movies.get(i).getUrl() );
      out.write("\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                <label class=\"form-control label-warning text-center\">");
      out.print( movies.get(i).getMovie_name() );
      out.write("</label>\n");
      out.write("            </div>                         \n");
      out.write("           ");

       }       
  
      out.write("\n");
      out.write("  \n");
      out.write("            </div>   \n");
      out.write("    </div>\n");
      out.write("</div>                                                                   \n");
      out.write("        \n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write(' ');
      out.write(' ');
 break;
            case 2: 
      out.write(' ');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Bootstrap Simple Login Form</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script> \n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t.login-form {\n");
      out.write("\t\twidth: 340px;\n");
      out.write("    \tmargin: 50px auto;\n");
      out.write("\t}\n");
      out.write("    .login-form form {\n");
      out.write("    \tmargin-bottom: 15px;\n");
      out.write("        background: #f7f7f7;\n");
      out.write("        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("        padding: 30px;\n");
      out.write("    }\n");
      out.write("    .login-form h2 {\n");
      out.write("        margin: 0 0 15px;\n");
      out.write("    }\n");
      out.write("    .form-control, .btn {\n");
      out.write("        min-height: 38px;\n");
      out.write("        border-radius: 2px;\n");
      out.write("    }\n");
      out.write("    .btn {        \n");
      out.write("        font-size: 15px;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"login-form\">\n");
      out.write("    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/LoginServelet\" method=\"get\">\n");
      out.write("        <h2 class=\"text-center\">Log in</h2>       \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Username\" name=\"username\" required=\"required\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"password\" required=\"required\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary btn-block\">Log in</button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clearfix\">\n");
      out.write("            <label class=\"pull-left checkbox-inline\"><input type=\"checkbox\"> Remember me</label>\n");
      out.write("            <a href=\"#\" class=\"pull-right\">Forgot Password?</a>\n");
      out.write("        </div>        \n");
      out.write("    </form>\n");
      out.write("    <p class=\"text-center\"><a href=\"index.jsp?m=3\">Create an Account</a></p>\n");
      out.write("</div\n");
      out.write("</body>\n");
      out.write("</html>  \n");
      out.write(' ');
      out.write(' ');
 break;
            case 3: 
      out.write(' ');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Bootstrap Simple Login Form</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script> \n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t.login-form {\n");
      out.write("\t\twidth: 340px;\n");
      out.write("    \tmargin: 50px auto;\n");
      out.write("\t}\n");
      out.write("    .login-form form {\n");
      out.write("    \tmargin-bottom: 15px;\n");
      out.write("        background: #f7f7f7;\n");
      out.write("        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("        padding: 30px;\n");
      out.write("    }\n");
      out.write("    .login-form h2 {\n");
      out.write("        margin: 0 0 15px;\n");
      out.write("    }\n");
      out.write("    .form-control, .btn {\n");
      out.write("        min-height: 38px;\n");
      out.write("        border-radius: 2px;\n");
      out.write("    }\n");
      out.write("    .btn {        \n");
      out.write("        font-size: 15px;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"login-form\">\n");
      out.write("    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/createAccount\" method=\"get\">\n");
      out.write("        <h2 class=\"text-center\">New Account</h2>       \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"First Name\" name=\"firstname\" required=\"required\">\n");
      out.write("        </div>\n");
      out.write("        <div>  <input type=\"text\" class=\"form-control\" placeholder=\"Last Name\" name=\"lastname\" required=\"required\"></div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write(" \n");
      out.write("            <br>\n");
      out.write("                \n");
      out.write("         <div class=\"form-group\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Username\" name=\"username\" required=\"required\">\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"password\" required=\"required\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary btn-block\">Create</button>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("    </form>\n");
      out.write("  \n");
      out.write("</div\n");
      out.write("</body>\n");
      out.write("</html>  \n");
      out.write(' ');
      out.write(' ');
 break;
            case 4: 
      out.write(' ');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Gallery</title>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("      ");

    
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
     
      out.write("\n");
      out.write("        \n");
      out.write("      <!--Carousel Wrapper-->\n");
      out.write("        \n");
      out.write("   \n");
      out.write(" <div class=\"container-fluid pb-video-container\">\n");
      out.write("    <div class=\"col-md-10 col-md-offset-1\">\n");
      out.write("        <h3 class=\"text-center\">Sample Video Gallery</h3>\n");
      out.write("        <div class=\"row pb-row\">\n");
      out.write("            <div class=\"col-md-3 pb-video\">\n");
      out.write("                <iframe class=\"pb-video-frame\" width=\"100%\" height=\"230\" src=\"https://www.youtube.com/embed/K68UrdUOr2Y?list=RDzuAcaBkcYGE?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                <label class=\"form-control label-warning text-center\">Claydee - Alena</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 pb-video\">\n");
      out.write("                <iframe class=\"pb-video-frame\" width=\"100%\" height=\"230\" src=\"https://www.youtube.com/embed/wjT2JVlUFY4?list=RDzuAcaBkcYGE?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                <label class=\"form-control label-warning text-center\">Manuel Riva - Mhm Mhm</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 pb-video\">\n");
      out.write("                <iframe class=\"pb-video-frame \" width=\"100%\" height=\"230\" src=\"https://www.youtube.com/embed/papuvlVeZg8?list=RDzuAcaBkcYGE?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                <label class=\"form-control label-warning text-center\">Clean Bandit - Rockabye</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 pb-video\">\n");
      out.write("                <iframe class=\"pb-video-frame\" width=\"100%\" height=\"230\" src=\"https://www.youtube.com/embed/Y1_VsyLAGuk?list=RDzuAcaBkcYGE?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                <label class=\"form-control label-warning text-center\">Burak Yeter - Tuesday</label>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row pb-row\">\n");
      out.write("            <div class=\"col-md-3 pb-video\">\n");
      out.write("                <iframe class=\"pb-video-frame\" width=\"100%\" height=\"230\" src=\"https://www.youtube.com/embed/UY1bt8ilps4?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                <label class=\"form-control label-warning text-center\">F.O. and Peeva - Lichnata</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 pb-video\">\n");
      out.write("                <iframe class=\"pb-video-frame\" width=\"100%\" height=\"230\" src=\"https://www.youtube.com/embed/QpbQ4I3Eidg?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                <label class=\"form-control label-warning text-center\">Machine Gun - Bad Things</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 pb-video\">\n");
      out.write("                <iframe class=\"pb-video-frame\" width=\"100%\" height=\"230\" src=\"https://www.youtube.com/embed/h3kRIxLruDs?ecver=\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                <label class=\"form-control label-warning text-center\">INNA - Say it with your body</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 pb-video\">\n");
      out.write("                <iframe class=\"pb-video-frame\" width=\"100%\" height=\"230\" src=\"https://www.youtube.com/embed/Jr4TMIU9oQ4?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                <label class=\"form-control label-warning text-center\">INNA - Gimme Gimme</label>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("             <div class=\"row pb-row\">\n");
      out.write("            <div class=\"col-md-3 pb-video\">\n");
      out.write("                <iframe class=\"pb-video-frame\" width=\"100%\" height=\"230\" src=\"https://www.youtube.com/embed/UY1bt8ilps4?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                <label class=\"form-control label-warning text-center\">F.O. and Peeva - Lichnata</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 pb-video\">\n");
      out.write("                <iframe class=\"pb-video-frame\" width=\"100%\" height=\"230\" src=\"https://www.youtube.com/embed/QpbQ4I3Eidg?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                <label class=\"form-control label-warning text-center\">Machine Gun - Bad Things</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 pb-video\">\n");
      out.write("                <iframe class=\"pb-video-frame\" width=\"100%\" height=\"230\" src=\"https://www.youtube.com/embed/h3kRIxLruDs?ecver=\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                <label class=\"form-control label-warning text-center\">INNA - Say it with your body</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 pb-video\">\n");
      out.write("                <iframe class=\"pb-video-frame\" width=\"100%\" height=\"230\" src=\"https://www.youtube.com/embed/Jr4TMIU9oQ4?ecver=1\" frameborder=\"0\" allowfullscreen></iframe>\n");
      out.write("                <label class=\"form-control label-warning text-center\">INNA - Gimme Gimme</label>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");

            
        }
        
       
    }

    


      out.write('\n');
      out.write(' ');
      out.write(' ');
 break;
          
        }
        
        
        
      out.write("\n");
      out.write("      \n");
      out.write("    </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"container-fluid text-center\">\n");
      out.write("  <p>Footer Text</p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
