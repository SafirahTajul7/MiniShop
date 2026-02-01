<%-- 
    Document   : product
    Created on : 12 Jun 2025, 6:12:01 pm
    Author     : Acer
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, entity.Product" %>
<%
    List<Product> productList = (List<Product>) request.getAttribute("products");
%>
<!DOCTYPE html>
<html>
<head>
    <title>All Products</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h2>Available Products</h2>
    <table border="1">
        <tr><th>ID</th><th>Name</th><th>Price</th><th>Quantity</th></tr>
        <%
            if (productList != null) {
                for (Product p : productList) {
        %>
        <tr>
            <td><%= p.getProductID() %></td>
            <td><%= p.getName() %></td>
            <td><%= p.getPrice() %></td>
            <td><%= p.getQuantity() %></td>
        </tr>
        <%
                }
            }
        %>
    </table>
</body>
</html>