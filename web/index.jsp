<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/3/2
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="method4" method="post">
      username:<input type="text" name="username"><br>
      password:<input type="text" name="password"><br>
      age:<input type="text" name="age"><br>
      email<input type="text" name="email"><br>
      <input type="submit" value="提交"><br>
  </form>
    <h2>this is index.jsp</h2>
    <h2><a href="hello">hello</a></h2>
    <h2><a href="method">DemoProduces</a></h2>
    <h2><a href="method1">DemoCookie</a></h2>
    <h2><a href="method2?name=tom">DemoParam</a></h2>
    <h2><a href="method3/123">DemoPath</a></h2>
    <h2><a href="method5">DemoAidMethodRecipteServletAPIParam</a></h2>
  --------------------------------------lession13----------------------------------------------------
    <h2>lession13</h2>
    <h2><a href="lession13/method1?name=tom">TestMap</a></h2>
    <h2><a href="lession13/method2?name=jerry">TestModelAttributesReturnNo</a></h2>
    <h2><a href="lession13/method3">TestModelAttributesReturn1</a></h2>
    <h2><a href="lession13/method4">TestModelAttributesReturn2</a></h2>
    <h2><a href="lession13/method5">TestModleAttributesReturn3</a></h2>
    <h2><a href="lession13/method6">TestModleAttributesReturnNo2</a></h2>
    <form action="lession13/method7" method="post">
        ID:      <input type="hidden" name="id" value="5"><br>
        USERNAME:<input type="text" name="username" value="Trump"><br>
        PASSWORD:<input type="text" name="age" value="65"><br>
        EMAIL:   <input type="text" name="email" value="64030931@qq.com"><br>
        <input type="submit" value="修改">
    </form>
  --------------------------------------lession16_17----------------------------------------------------
    <h2><a href="lession16_17/method1">TestRedirect</a></h2>
    <h2><a href="teachers">accessList.jsp</a></h2>
  </body>
</html>
