<%--
  Created by IntelliJ IDEA.
  User: x
  Date: 2020/4/26
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>List</title>
</head>
<body>
    <c:if test="${empty teacher}">
        Teacher null
    </c:if>
    <c:if test="${!empty teacher}">
        <table border="1px">
            <tr>
                <th>username</th>
                <th>gender</th>
                <th>email</th>
                <th>department</th>
                <th>edit</th>
                <th>delete</th>
            </tr>
            <c:forEach items="${requestScope.teacher}" var="th">
                <tr>
                    <td>${th.username}</td>
                    <td>${th.gender==1?'男':'女'}</td>
                    <td>${th.email}</td>
                    <td>${th.departement.departementname}</td>
                    <td><a href="">edit</a></td>
                    <td><a href="">delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>

</body>
</html>
