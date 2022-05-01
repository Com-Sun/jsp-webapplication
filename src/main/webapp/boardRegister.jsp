<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${lang}" />
<fmt:setBundle basename="messages" var="message" />
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method='post' action='/boardRegister.do'>
    <fmt:message key="id" bundle="${message}"/>: <input type='text' name='id'/><br/>
    <fmt:message key="title" bundle="${message}"/>: <input type='text' name='title'/><br/>
    <textarea rows="10" cols="80" name="content"></textarea>
    <input type='submit' value='<fmt:message key="register" bundle="${message}" />'/>
</form>

</body>
</html>
