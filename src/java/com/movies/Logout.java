/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rowdy
 */
@WebServlet(name = "Logout", urlPatterns = {"/Logout"})
public class Logout extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie[] c = request.getCookies();
        if(c!=null)
        {
        String value="";
        for(Cookie s : c)
        {
            if(s.getName().equals("uname"))
            {
                 value = s.getValue();
                  DbConnection.updateStatus(value);
                  Cookie cookie = new Cookie("uname","");
                 cookie.setMaxAge(0);
                 response.addCookie(cookie);
            }
            
            if(s.getName().equals("username"))
            {
                 Cookie cookie = new Cookie("username","");
                 cookie.setMaxAge(0);
                 response.addCookie(cookie);
            }
               
        }
    
       
       
        }
      response.sendRedirect("index.jsp");
       
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
            
        
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Logout</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Logout at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}
