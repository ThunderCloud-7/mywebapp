package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Perform registration logic here

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Registration Successful!</h2>");
        out.println("<p>Welcome, " + username + "!</p>");
        out.println("</body></html>");
    }
}

