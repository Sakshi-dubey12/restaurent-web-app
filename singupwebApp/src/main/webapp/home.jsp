<%@ page import="java.util.*" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <%
        String username = (String) session.getAttribute("username");
        if (username == null) {
            response.sendRedirect("login.jsp");
        } else {
    %>
    <h2>Welcome, <%= username %>!</h2>
    <p><a href="LogoutServlet">Logout</a></p>
    <%
        }
    %>
</body>
</html>
