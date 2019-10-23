<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>success.jsp</title>
</head>
<body>
小白成功了<br/>
<%--${sessionScope.get("sessionAttribute001")}--%>
${requestScope.get("abc")}
</body>
</html>
