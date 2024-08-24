package com.portfolio;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/portfolio")
public class PortfolioServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String description = request.getParameter("description");

        // Store data in session
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("email", email);
        session.setAttribute("description", description);

        // Forward to JSP for display
        request.getRequestDispatcher("/jsp/portfolio.jsp").forward(request, response);
    }
}
