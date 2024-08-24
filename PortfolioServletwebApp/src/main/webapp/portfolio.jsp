<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Portfolio</title>
</head>
<body>
    <h1>Your Portfolio</h1>
    <p><strong>Name:</strong> ${sessionScope.name}</p>
    <p><strong>Email:</strong> ${sessionScope.email}</p>
    <p><strong>Description:</strong> ${sessionScope.description}</p>
</body>
</html>
