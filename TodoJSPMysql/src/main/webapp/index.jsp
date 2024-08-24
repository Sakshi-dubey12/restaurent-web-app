<html>
<body>
<%
   String taskName = request.getParameter("taskName");
   String taskDescription = request.getParameter("taskDescription");
   out.print(taskName +"  "  + taskDescription);


   session.setAttribute("taskNamekey",taskName);
   session.setAttribute("taskDescriptionkey",taskDescription);

    response.sendRedirect("http://localhost:8080/TodoJSPMysql/addTodo.jsp");
%>
</body>
</html>