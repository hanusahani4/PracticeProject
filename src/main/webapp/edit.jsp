<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Edit User</title>
</head>
<body>
    <h1>Edit User</h1>
    <%
        User user = (User) request.getAttribute("user");
    %>
    <form action="user" method="post">
        Firstname : <input type="hidden" name="id" value="<%= user.getId() %>">
        Firstname : <input type="text" name="firstname" value="<%= user.getFirstname() %>"><br>
        LastName : <input type="text" name="username" value="<%= user.getLastname() %>"><br>
        Password : <input type="text" name="text" value="<%= user.getPassword() %>"><br>
        <input type="submit" value="Submit">-->
    </form>
</body>
</html>
