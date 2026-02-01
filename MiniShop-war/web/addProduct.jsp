<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add New Product</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h2>Add New Product</h2>
    <form action="ProductServlet" method="post">
        Name: <input type="text" name="name"><br/>
        Price: <input type="text" name="price"><br/>
        Quantity: <input type="text" name="quantity"><br/>
        <input type="hidden" name="action" value="add">
        <input type="submit" value="Add Product">
    </form>
</body>
</html>