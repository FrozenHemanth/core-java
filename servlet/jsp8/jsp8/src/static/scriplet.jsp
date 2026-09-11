<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Scriptlet Demo</title>
</head>
<body>
    <h2>Scriptlet Example</h2>

    <%

        int marks = 16;

        if (marks >= 18) {
            out.println("<p style='color:green;'>Status: Not Allowed!</p>");
        } else {
            out.println("<p style='color:red;'>Status: Accepted!</p>");
        }
    %>
</body>
</html>