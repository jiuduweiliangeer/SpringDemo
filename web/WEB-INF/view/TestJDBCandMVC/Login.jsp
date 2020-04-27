<%--
  Created by IntelliJ IDEA.
  User: x
  Date: 2020/4/27
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/student">
    <tr>
        <td><input type="text" name="username"></td>
    </tr>
    <tr>
        <td><input type="text" name="password"></td>
    </tr>
    <input type="submit" value="submit">
</form>
</body>
</html>
