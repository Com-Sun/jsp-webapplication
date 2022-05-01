<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${lang}"/>
<fmt:setBundle basename="messages" var="message"/>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method='post' action='/userRegister.do'>
    <fmt:message key="id" bundle="${message}"/>: <input type='text' name='id'/><br/>
    <fmt:message key="pwd" bundle="${message}"/>: <input type='password' name='pwd'/><br/>
    <fmt:message key="name" bundle="${message}"/>: <input type='text' name='name'/><br/>
    <input type='submit' value='<fmt:message key="register" bundle="${message}" />'/>
</form>
</body>
</html>
