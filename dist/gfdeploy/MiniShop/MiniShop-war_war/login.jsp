<%-- 
    Document   : login.jsp
    Created on : 12 Jun 2025, 6:11:22 pm
    Author     : Acer
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h2>Login</h2>
    <form action="LoginServlet" method="post">
        Email: <input type="text" name="email" /><br/>
        <input type="submit" value="Login" />
    </form>

    <%
        String error = request.getParameter("error");
        if ("true".equals(error)) {
    %>
    <p style="color:red;">Invalid email. Try again.</p>
    <% } %>
</body>
</html>