<%--
  Created by IntelliJ IDEA.
  User: x
  Date: 2020/4/26
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
                    <td><a href="teacher/${th.id}">edit</a></td>
                    <td><a href="javascript:void(0)" onclick="del(${th.id})">delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <a href="teacher">新增</a>
    <form:form id="deleteForm" action="${pageContext.request.contextPath}" method="delete"/>
</body>
<script>
    function del(id) {
        var formObj=document.getElementById("deleteForm");
        formObj.action=formObj.action+"/teacher/"+id;
        formObj.submit();
    }
</script>
</html>
