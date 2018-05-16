<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>多语言Demo</title>
</head>
<body>
Language:
<a href="/mvc/locale?lang=zh"><spring:message code="language.cn"/></a> &nbsp;| &nbsp;
<a href="/mvc/locale?lang=en"><spring:message code="language.en"/></a>

<h1><spring:message code="username"/></h1>
<h1><spring:message code="password"/></h1>

当前语言: ${pageContext.response.locale }<br/>
请求的: ${pageContext.request.locale }

</body>
</html>
