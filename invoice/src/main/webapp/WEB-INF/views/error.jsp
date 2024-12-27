<%@ page isErrorPage="true" contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Error Page</title>
</head>
<body>
    <h1>An Error Occurred</h1>
    <p>Sorry, an unexpected error occurred. Please try again later.</p>
    <p>Error Details:</p>
    <pre>
        <p>${exception}</p>
    </pre>
    <a href="/">Go to Home</a>
</body>
</html>
