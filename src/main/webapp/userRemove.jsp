<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:setLocale value="${lang}" />
<fmt:setBundle basename="messages" var="message" />
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/userRemove.do" method="post">
<c:forEach var="user" items="${repository.getUsers()}">
    <p>${user}</p>
    <input type='checkbox' name='user' value='${user.id}' />
</c:forEach>
<input type='submit' />

</form>
</body>
</html>
