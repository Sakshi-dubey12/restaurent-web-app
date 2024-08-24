package com.portfolio;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PortfolioServlet")
public class PortfolioServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String about = request.getParameter("about");
        String skills = request.getParameter("skills");
        String projects = request.getParameter("projects");

        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("about", about);
        session.setAttribute("skills", skills);
        session.setAttribute("projects", projects);

        response.sendRedirect("portfolio.jsp");
    }
}
