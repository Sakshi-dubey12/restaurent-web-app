<html>
<body>

<%--to get the data from html page--%>
<%
String username = request.getParameter("usernameID");
    String password = request.getParameter("passwordID");

    if (username.equals("bbd") && password.equals("123"))
    {
        response.sendRedirect("http://localhost:8080/JSPDay2_war_exploded/user.jsp");
        session.setAttribute("username", username);
    }else {
        response.sendRedirect("http://localhost:8080/JSPDay2_war_exploded/pagenotfound.html");
    }
%>

</body>
</html>