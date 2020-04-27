<%--
  Created by IntelliJ IDEA.
  User: x
  Date: 2020/4/27
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Input</title>
</head>
<body>
    <%--spring表单，必须传入对象，通过path自动绑定属性到控件（name）--%>
    <form:form action="${pageContext.request.contextPath}/teacher" method="post" modelAttribute="teacher" >
      <form:hidden path="id" value="${teacher.id}"/>
      username:<form:input path="username"/><br>
      password:<form:input path="password"/><br>
      gender:<form:radiobuttons path="gender"
                                items="${genders}"/><br>
      email:<form:input path="email"/><br>
      department:<form:select path="departement.id"
                              items="${departements}"
                              itemValue="id"
                              itemLabel="departementname"/><br>
        <input type="submit" value="submit">
    </form:form>
</body>
</html>
