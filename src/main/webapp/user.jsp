<%@ page contentType="text/html;charset=UTF-8" trimDirectiveWhitespaces="true" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${lang}" />
<fmt:setBundle basename="messages" var="message" />
<html>
<head>
    <title>user</title>
</head>
<body>

<%--<c:forEach var="item" items="${repository.getUsers()}">--%>
<%--    <tr>--%>
<%--        <td><input type='checkbox' name='item' value='${item.food.name}' /></td>--%>
<%--        <td><fmt:message key="${item.food.name}" bundle="${message}" /></td>--%>
<%--        <td>${item.food.price}</td>--%>
<%--        <td>${item.amount}</td>--%>
<%--    </tr>--%>
<%--</c:forEach>--%>


<a href="/userRegister.do"><fmt:message key="userRegister" bundle="${message}"/></a><br/>
<a href="/userFix.do"><fmt:message key="userFix" bundle="${message}"/></a><br/>
<a href="/userRemove.do"><fmt:message key="userRemove" bundle="${message}"/></a><br/>
<a href="/userGet.do"><fmt:message key="userGet" bundle="${message}"/></a><br/>



</body>
</html>
