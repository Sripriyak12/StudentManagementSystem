<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Management System</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; }
        table { width: 100%; border-collapse: collapse; }
        th, td { padding: 12px; text-align: left; border: 1px solid #ddd; }
        th { background-color: #3498db; color: white; }
        .btn { padding: 8px 16px; margin: 5px; text-decoration: none; border-radius: 4px; color: white; }
        .btn-primary { background-color: #3498db; }
        .btn-success { background-color: #27ae60; }
        .btn-danger { background-color: #e74c3c; }
    </style>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles/style.css">
</head>
<body>
    <h1>Student Management System</h1>
    <a href="${pageContext.request.contextPath}/students/add" class="btn btn-success">Add New Student</a>
    <h2>All Students</h2>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Course</th>
                <th>Age</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.email}</td>
                    <td>${student.course}</td>
                    <td>${student.age}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/students/edit/${student.id}" class="btn btn-primary">Edit</a>
                        <a href="${pageContext.request.contextPath}/students/delete/${student.id}" class="btn btn-danger" onclick="return confirm('Are you sure?')">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
