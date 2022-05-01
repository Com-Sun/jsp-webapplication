<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${lang}" />
<fmt:setBundle basename="messages" var="message" />
<html>
<head>
    <title>Board</title>
</head>
<body>
<a href="/board.do"><fmt:message key="board" bundle="${message}"/></a><br/>

<br>

<a href="/logout.do"><fmt:message key="logout" bundle="${message}" /></a><br />
</body>
</html>
