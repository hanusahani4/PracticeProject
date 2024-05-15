<%@page import="javax.xml.registry.infomodel.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
    <title>Users List</title>
</head>
<body>
    <h1>Users List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Email</th>
            <th>Action</th>
        </tr>
        <%
            List<User> users = (List<User>) request.getAttribute("users");
            if (users != null) {
                for (User user : users) {
        %>
<!--        <tr>
            <td><%= user.getId() %></td>
            <td><%= user.getUsername() %></td>
            <td><%= user.getEmail() %></td>
            <td>
                <a href="edit.jsp?id=<%= user.getId() %>">Edit</a>
                <a href="user?id=<%= user.getId() %>&action=delete">Delete</a>
            </td>
        </tr>-->
        <%
                }
            }
        %>
    </table>
</body>
</html>
