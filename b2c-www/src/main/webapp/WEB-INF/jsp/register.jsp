<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-04-21
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <link  rel="stylesheet"  type="text/css" href="../js/register.css"/>
</head>
<body>
    <form action="/insertUser" method="post">
        <table >
            <tr ><td >用户名</td><td><input type="text" name="userName"></td></tr>
            <tr ><td >用户密码</td><td><input type="password" name="password"></td></tr>
        </table>
        <button type="submit" value="注册">注册</button>
    </form>
</body>
</html>
