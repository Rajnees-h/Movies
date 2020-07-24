package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div>  <input type=\"text\" class=\"form-control\" placeholder=\"Last Name\" name=\"lattname\" required=\"required\"></div>\n");
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
