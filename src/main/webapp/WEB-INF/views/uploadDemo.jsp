<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件Dmeo</title>
</head>
<body>
<form action="/mvc/testUploadAction" method="post" enctype="multipart/form-data">
    <input type="file" name="myfile"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
