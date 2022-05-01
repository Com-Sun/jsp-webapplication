<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:setLocale value="${lang}" />
<fmt:setBundle basename="messages" var="message" />
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/boardRegister.do"><fmt:message key="boardRegister" bundle="${message}"/></a><br/>

<c:forEach var="post" items="${postRepository.getPosts()}">
    <p>${post}</p>
</c:forEach>
</body>
</html>
