<%@ page import="com.mongodb.client.MongoClient" %>
<%@ page import="com.mongodb.client.MongoClients" %>
<%@ page import="com.mongodb.client.MongoCollection" %>
<%@ page import="org.bson.Document" %>
<%@ page import ="com.mongodb.client.FindIterable" %>
<html>
<body>

<%--Add the jsp code--%>
<%

//to get the request from html to string object
    String username =request.getParameter("username");
    String blog = request.getParameter("blog");
        //to validate the form can,t be empty
        if(username.isEmpty()|| blog.isEmpty())
        {
    %>
          <script type="text/javascript">
                alert("form can't be empty");
            </script>
        <%
            }else {
            out.print(username + blog);
            var client = MongoClients.create("mongodb://localhost:27017/");
            var blogDB = client.getDatabase("blogDB");
            MongoCollection collectionName = blogDB.getCollection("dailyBlogs");
            var blogDoc = new Document();
            blogDoc.append("username",username);
            blogDoc.append("blog",blog);
            collectionName.insertOne(blogDoc);

// to fetch all the document from mongodb
           FindIterable<Document> iterDoc = collectionName.find();

            for(Document document: iterDoc)
            {
            out.print("<br>"+document.getString("username") + document.getString("blog") +"<br>");



            }
        %>

</body>
</html>
