<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession session = request.getSession(false);
    if (session == null || session.getAttribute("name") == null) {
        response.sendRedirect("index.jsp");
        return;
    }

    String name = (String) session.getAttribute("name");
    String about = (String) session.getAttribute("about");
    String skills = (String) session.getAttribute("skills");
    String projects = (String) session.getAttribute("projects");
%>
<!DOCTYPE html>
<html>
<head>
    <title><%= name %>'s Portfolio</title>
</head>
<body>
    <h1>Welcome to <%= name %>'s Portfolio</h1>
    <h2>About Me</h2>
    <p><%= about %></p>

    <h2>Skills</h2>
    <p><%= skills %></p>

    <h2>Projects</h2>
    <p><%= projects %></p>
</body>
</html>
