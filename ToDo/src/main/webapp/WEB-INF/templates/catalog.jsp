<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 21.10.2019
  Time: 21:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<%@include file="menu.jsp" %>
<h1>Это каталог нашего приложения</h1>
<div><strong>URL-адрес страницы:</strong><%=request.getRequestURI()%>
</div>
<div><strong>ID сессии:</strong><@=session.getId()%></div>

<%--Получение атрибута сессии --%>
<div><strong>Получение атрибута сессии:</strong><%=session.getAttribute("hello")%>
</div>


</body>
</html>
