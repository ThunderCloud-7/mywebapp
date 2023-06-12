package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class BookRideServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String source = request.getParameter("source");
        String destination = request.getParameter("destination");
        String date = request.getParameter("date");

        // Perform ride booking logic here

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Ride Booked Successfully!</h2>");
        out.println("<p>From: " + source + "</p>");
        out.println("<p>To: " + destination + "</p>");
        out.println("<p>Date: " + date + "</p>");
        out.println("</body></html>");
    }
}

