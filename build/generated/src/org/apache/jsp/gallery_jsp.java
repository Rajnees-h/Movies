package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");

    String username = null;
    Cookie[] c = request.getCookies();
    
    if(c!=null)
    {
        username = c[0].getValue();
        if(!username.equals("") || username != null )
        {
            
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <!--Carousel Wrapper-->\n");
      out.write("      <h1> ");
      out.print(  username );
      out.write("   </h1>\n");
      out.write("<div id=\"multi-item-example\" class=\"carousel slide carousel-multi-item carousel-multi-item-2\" data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("  <!--Controls-->\n");
      out.write("  <div class=\"controls-top\">\n");
      out.write("    <a class=\"black-text\" href=\"#multi-item-example\" data-slide=\"prev\"><i class=\"fas fa-angle-left fa-3x pr-3\"></i></a>\n");
      out.write("    <a class=\"black-text\" href=\"#multi-item-example\" data-slide=\"next\"><i class=\"fas fa-angle-right fa-3x pl-3\"></i></a>\n");
      out.write("  </div>\n");
      out.write("  <!--/.Controls-->\n");
      out.write("\n");
      out.write("  <!--Slides-->\n");
      out.write("  <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("\n");
      out.write("    <!--First slide-->\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 mb-3\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img class=\"img-fluid\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(38).jpg\"\n");
      out.write("            alt=\"Card image cap\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 mb-3\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img class=\"img-fluid\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(19).jpg\"\n");
      out.write("            alt=\"Card image cap\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 mb-3\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img class=\"img-fluid\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(42).jpg\"\n");
      out.write("            alt=\"Card image cap\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 mb-3\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img class=\"img-fluid\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(8).jpg\"\n");
      out.write("            alt=\"Card image cap\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!--/.First slide-->\n");
      out.write("\n");
      out.write("    <!--Second slide-->\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 mb-3\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img class=\"img-fluid\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(53).jpg\"\n");
      out.write("            alt=\"Card image cap\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 mb-3\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img class=\"img-fluid\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(25).jpg\"\n");
      out.write("            alt=\"Card image cap\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 mb-3\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img class=\"img-fluid\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(47).jpg\"\n");
      out.write("            alt=\"Card image cap\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 mb-3\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img class=\"img-fluid\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(26).jpg\"\n");
      out.write("            alt=\"Card image cap\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!--/.Second slide-->\n");
      out.write("\n");
      out.write("    <!--Third slide-->\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 mb-3\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img class=\"img-fluid\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(64).jpg\"\n");
      out.write("            alt=\"Card image cap\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 mb-3\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img class=\"img-fluid\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(51).jpg\"\n");
      out.write("            alt=\"Card image cap\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 mb-3\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img class=\"img-fluid\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(59).jpg\"\n");
      out.write("            alt=\"Card image cap\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-3 mb-3\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <img class=\"img-fluid\" src=\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(63).jpg\"\n");
      out.write("            alt=\"Card image cap\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!--/.Third slide-->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!--/.Slides-->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!--/.Carousel Wrapper-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");

            
        }
        
       
    }
 else{
            response.sendRedirect("login.jsp");
        }
    


      out.write('\n');
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
