<!DOCTYPE html>
<html>
<head>
    <title>Add Invoice</title>
</head>
<body>
    <h1>Add Invoice</h1>
    <form action="/saveInvoice" method="post">
        Name: <input type="text" name="name"><br>
        Location: <input type="text" name="location"><br>
        Amount: <input type="text" name="amount"><br>
        <button type="submit">Save Invoice</button>
    </form>
    <p>${message}</p>
    <a href="/listInvoices">List Of Invoices</a><br>
    <a href="/">Go to Home</a>
</body>
</html>
