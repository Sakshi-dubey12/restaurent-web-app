<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //add the todo data into mysql database

    String taskName = session.getAttribute("taskNamekey").toString();
    String taskDescription = session.getAttribute("taskDescriptionkey").toString();
    //to print the data
    out.print(taskName +" "+ taskDescription);
    //to get the database credentials into string
    String userName="root";
    String password="";
    String url="jdbc:mysql://localhost:3306/tododb";

    // load the mysql connect j driver
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    try {
        //to establish the mysql database connection with JSP and servlet
        Connection connection = DriverManager.getConnection(url,userName,password);
        System.out.println("Database connected");
        // to insert
        //String todotb = "insert into todotb(taskName,taskDescription)values(?,?)";
        //PreparedStatement ps = connection.prepareStatement(todotb);
        //ps.setString(1,taskName);
        //ps.setString(2,taskDescription);
        //ps.executeUpdate();
        //System.out.println("Database Inserted");

String data ="select * from todotb";
PreparedStatement ps = connection.prepareStatement(data);
ResultSet resultSet = ps.executeQuery();
while(resultSet.next()){
out.print(resultSet.getString("taskID")+resultSet.getString("taskName")+resultSet.getString("taskDescription")+"<br>");
}
    }catch (Exception e) {
        System.out.println(e);
    }

%>

</body>
</html>