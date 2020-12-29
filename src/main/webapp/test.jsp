<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("NAME","北京");
    session.setAttribute("NAME","上海");
    application.setAttribute("NAME","广州");
%>
城市为：${NAME}
<hr/>
堵城：${requestScope.NAME}<br/>
海城：${sessionScope.NAME}<br/>
羊城：${applicationScope.NAME}<br/>
</body>
</html>