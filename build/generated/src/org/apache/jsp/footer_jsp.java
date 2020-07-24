package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"page-footer font-small unique-color-dark\">\n");
      out.write("\n");
      out.write("  <div style=\"background-color: #6351ce;\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("      <!-- Grid row-->\n");
      out.write("      <div class=\"row py-4 d-flex align-items-center\">\n");
      out.write("\n");
      out.write("        <!-- Grid column -->\n");
      out.write("        <div class=\"col-md-6 col-lg-5 text-center text-md-left mb-4 mb-md-0\">\n");
      out.write("          <h6 class=\"mb-0\">Get connected with us on social networks!</h6>\n");
      out.write("        </div>\n");
      out.write("        <!-- Grid column -->\n");
      out.write("\n");
      out.write("        <!-- Grid column -->\n");
      out.write("        <div class=\"col-md-6 col-lg-7 text-center text-md-right\">\n");
      out.write("\n");
      out.write("          <!-- Facebook -->\n");
      out.write("          <a class=\"fb-ic\">\n");
      out.write("            <i class=\"fab fa-facebook-f white-text mr-4\"> </i>\n");
      out.write("          </a>\n");
      out.write("          <!-- Twitter -->\n");
      out.write("          <a class=\"tw-ic\">\n");
      out.write("            <i class=\"fab fa-twitter white-text mr-4\"> </i>\n");
      out.write("          </a>\n");
      out.write("          <!-- Google +-->\n");
      out.write("          <a class=\"gplus-ic\">\n");
      out.write("            <i class=\"fab fa-google-plus-g white-text mr-4\"> </i>\n");
      out.write("          </a>\n");
      out.write("          <!--Linkedin -->\n");
      out.write("          <a class=\"li-ic\">\n");
      out.write("            <i class=\"fab fa-linkedin-in white-text mr-4\"> </i>\n");
      out.write("          </a>\n");
      out.write("          <!--Instagram-->\n");
      out.write("          <a class=\"ins-ic\">\n");
      out.write("            <i class=\"fab fa-instagram white-text\"> </i>\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- Grid column -->\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- Grid row-->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Footer Links -->\n");
      out.write("  <div class=\"container text-center text-md-left mt-5\">\n");
      out.write("\n");
      out.write("    <!-- Grid row -->\n");
      out.write("    <div class=\"row mt-3\">\n");
      out.write("\n");
      out.write("      <!-- Grid column -->\n");
      out.write("      <div class=\"col-md-3 col-lg-4 col-xl-3 mx-auto mb-4\">\n");
      out.write("\n");
      out.write("        <!-- Content -->\n");
      out.write("        <h6 class=\"text-uppercase font-weight-bold\">Company name</h6>\n");
      out.write("        <hr class=\"deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("        <p>Here you can use rows and columns to organize your footer content. Lorem ipsum dolor sit amet,\n");
      out.write("          consectetur\n");
      out.write("          adipisicing elit.</p>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- Grid column -->\n");
      out.write("\n");
      out.write("      <!-- Grid column -->\n");
      out.write("      <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-4\">\n");
      out.write("\n");
      out.write("        <!-- Links -->\n");
      out.write("        <h6 class=\"text-uppercase font-weight-bold\">Products</h6>\n");
      out.write("        <hr class=\"deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("        <p>\n");
      out.write("          <a href=\"#!\">MDBootstrap</a>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("          <a href=\"#!\">MDWordPress</a>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("          <a href=\"#!\">BrandFlow</a>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("          <a href=\"#!\">Bootstrap Angular</a>\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- Grid column -->\n");
      out.write("\n");
      out.write("      <!-- Grid column -->\n");
      out.write("      <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-4\">\n");
      out.write("\n");
      out.write("        <!-- Links -->\n");
      out.write("        <h6 class=\"text-uppercase font-weight-bold\">Useful links</h6>\n");
      out.write("        <hr class=\"deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("        <p>\n");
      out.write("          <a href=\"#!\">Your Account</a>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("          <a href=\"#!\">Become an Affiliate</a>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("          <a href=\"#!\">Shipping Rates</a>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("          <a href=\"#!\">Help</a>\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- Grid column -->\n");
      out.write("\n");
      out.write("      <!-- Grid column -->\n");
      out.write("      <div class=\"col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4\">\n");
      out.write("\n");
      out.write("        <!-- Links -->\n");
      out.write("        <h6 class=\"text-uppercase font-weight-bold\">Contact</h6>\n");
      out.write("        <hr class=\"deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto\" style=\"width: 60px;\">\n");
      out.write("        <p>\n");
      out.write("          <i class=\"fas fa-home mr-3\"></i> New York, NY 10012, US</p>\n");
      out.write("        <p>\n");
      out.write("          <i class=\"fas fa-envelope mr-3\"></i> info@example.com</p>\n");
      out.write("        <p>\n");
      out.write("          <i class=\"fas fa-phone mr-3\"></i> + 01 234 567 88</p>\n");
      out.write("        <p>\n");
      out.write("          <i class=\"fas fa-print mr-3\"></i> + 01 234 567 89</p>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("      <!-- Grid column -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- Grid row -->\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!-- Footer Links -->\n");
      out.write("\n");
      out.write("  <!-- Copyright -->\n");
      out.write("  <div class=\"footer-copyright text-center py-3\">© 2020 Copyright:\n");
      out.write("    <a href=\"https://mdbootstrap.com/\"> MDBootstrap.com</a>\n");
      out.write("  </div>\n");
      out.write("  <!-- Copyright -->\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("<!-- Footer -->");
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
