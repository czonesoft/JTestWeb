<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC Json demo</title>
    <script src="/js/jquery-3.3.1.min.js" type="text/javascript"></script>
</head>
<body>
<input type="button" value="添加用户" onclick="sendJson()"/>
<script type="text/javascript">
    function sendJson() {
        $.ajax({
            type:"post",
            url:"${pageContext.request.contextPath}/json/adduser",
            date:{"id":1,"name":"czj"},
            contentType:"application/json;charset=utf-8",
            success:function (data) {
                console.log(data);
            }
        })
    }
</script>
</body>
</html>
