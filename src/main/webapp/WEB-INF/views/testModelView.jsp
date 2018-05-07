<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Model 2 View</title>
</head>
<body>
<h2>method:${requestScope.name}</h2>
${requestScope.date}<br>

${requestScope.get("date")}<br>

${date}
</body>
</html>
