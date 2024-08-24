<html>
<body>
<%--scriptlet jsp code in html--%>
<%
//to print the name
out.print("Hey, I am Sakshi Dubey");
%>
<br>

<%--JSP expression--%>
<%="My email s@gmail.com"%>
<br>

<%--Working on the datatype in JSP --%>
<%
String name = "Sakshi Dubey";
out.print("my frined name is " + "" +name);
%>
<%--Adding two Numbers --%>
<%
int a = 7, b = 9;
out.print("sum: " +(a+b));
%>
<br>
<%!
int square(int n){
return n*n;
}
%>

<%
out.print("Square is :" + square(2));
%>
<br>
<%
int table = 5;
for (int i = 1; i <= 10; i++) {
    out.print("<br>");
    out.print(i + " * " + i + "= " + table*i);
}
%>
<%
String data = request.getParameter("username");
out.print("my username is" + data);
response.sendRedirect("http://google.com");
%>

</body>
</html>
