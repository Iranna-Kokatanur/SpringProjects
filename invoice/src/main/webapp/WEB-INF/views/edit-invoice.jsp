<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Invoice</title>
</head>
<body>
    <h1>Edit Invoice</h1>
    <form action="/updateInvoice" method="post">
        <input type="hidden" name="id" value="${invoice.id}">
        Name: <input type="text" name="name" value="${invoice.name}"><br>
        Location: <input type="text" name="location" value="${invoice.location}"><br>
        Amount: <input type="text" name="amount" value="${invoice.amount}"><br>
        <button type="submit">Update Invoice</button>
    </form>
    <p>${message}</p>
    <a href="/listInvoices">List Of Invoices</a><br>
    <a href="/">Go to Home</a>
</body>
</html>
