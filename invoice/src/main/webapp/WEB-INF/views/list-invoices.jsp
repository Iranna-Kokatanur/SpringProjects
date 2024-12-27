<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.invoice.model.Invoice" %>
<!DOCTYPE html>
<html>
<head>
    <title>List of Invoices</title>
</head>
<body>
    <h1>List of Invoices</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Location</th>
            <th>Amount</th>
            <th>Actions</th>
        </tr>
        <%
            List<Invoice> invoices = (List<Invoice>) request.getAttribute("invoices");
            if (invoices != null) {
                for (Invoice invoice : invoices) {
        %>
        <tr>
            <td><%= invoice.getId() %></td>
            <td><%= invoice.getName() %></td>
            <td><%= invoice.getLocation() %></td>
            <td><%= invoice.getAmount() %></td>
            <td>
                <a href="/editInvoice/<%= invoice.getId() %>">Edit</a>
                <a href="/deleteInvoice/<%= invoice.getId() %>">Delete</a>
            </td>
        </tr>
        <%
                }
            }
        %>
    </table>
    <a href="/addInvoice">Add Invoice</a>
    <a href="/">Go to Home</a>
</body>
</html>
