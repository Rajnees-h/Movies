package com.movies;



import com.movies.DbConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/LoginServelet"})
public class LoginServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
      
            
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServelet</title>");            
            out.println("</head>");
            out.println("<body>");
              if(!DbConnection.validUsername(username))
                  out.println("<h1> Invalid Username </h1>");
              else if
               (!DbConnection.validPassword(username,password))
                  out.println("<h1> Invalid Password</h1>");
           //   else if (DbConnection.getStatus(username) == 1)
           //       out.println("<h1> Alery Login Some Other Browser .......First logout from There. </h1>");
              else
              {
                  DbConnection.updateStatus(username);
                   User user = DbConnection.getUser(username);
                   
                   String name = user.getFirstname()+" "+user.getLastname();
                   String uname = user.getUsername();
                   
                   Cookie cookie = new Cookie("username",name);
                   Cookie cookie1 = new Cookie("uname",uname);
                  response.addCookie(cookie);
                  response.addCookie(cookie1);
                   
                   response.sendRedirect("index.jsp");
                    out.println("<h1> Hello "+name+"</h1>");
                         
              }
                  
               
            out.println("</body>");
            out.println("</html>");
        }
    }


}
