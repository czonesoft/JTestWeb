<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Spring MVC CZJ Demo</title>
</head>
<body>
Hello My(czj) Spring MVC Demo<br>
操作成功！当前页：${pageContext.request.requestURL} ,上一页： <%=request.getHeader("Referer")%>
</body>
</html>
