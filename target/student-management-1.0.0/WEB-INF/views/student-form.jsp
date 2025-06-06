<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        form { max-width: 400px; }
        label { display: block; margin-top: 10px; }
        input { width: 100%; padding: 8px; margin-top: 5px; }
        .btn { padding: 8px 16px; margin-top: 15px; text-decoration: none; border-radius: 4px; color: white; }
        .btn-success { background-color: #27ae60; }
    </style>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles/style.css">
</head>
<body>
    <h1>${student.id == 0 ? "Add New Student" : "Edit Student"}</h1>
    <form action="${pageContext.request.contextPath}/students/save" method="post">
        <input type="hidden" name="id" value="${student.id}" />
        <label>Name:</label>
        <input type="text" name="name" value="${student.name}" required />
        <label>Email:</label>
        <input type="email" name="email" value="${student.email}" required />
        <label>Course:</label>
        <input type="text" name="course" value="${student.course}" required />
        <label>Age:</label>
        <input type="number" name="age" value="${student.age}" required min="1" />
        <button type="submit" class="btn btn-success">Save</button>
    </form>
</body>
</html>
