<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-05-10
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>后台类目</title>
    <style>
        .table {
            width: auto;
            background: #add9c0;
            border: solid 1px #add9c0;
            border-width: 1px 0px 0px 1px;
        }

        td {
            width: 180px;
            border: solid 1px #add90c;
            border-width: 0px 1px 1px 0px;
            text-align: center
        }
        .with{width: 400px}
    </style>
</head>
<body>
<a href="/add">添加类目</a>
<table class="table">
    <thead>
    <tr>
        <td class="with">编号</td>
        <td>名称</td>
        <td>父级</td>
        <td>类目等级</td>
        <td>状态</td>
        <td>操作人</td>
        <td >更新时间</td>
        <td >创建时间</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${data}" var="category">
        <tr>
            <td  class="with">${category.id}</td>
            <td>${category.name}</td>
            <td  style="width: 370px">${category.parentId}</td>
            <td>${category.level}</td>
            <td>${category.status}</td>
            <td>admin</td>
            <td class="with"><fmt:formatDate value="${category.updateDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <td class="with"><fmt:formatDate value="${category.createDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
        </tr>
    </c:forEach>
    </tbody>
    <tfoot>
    <tr>
        <td>合计类目总数</td>
        <td>2</td>
        <td>二级类目</td>
        <td>5</td>
        <td>操作人</td>
        <td colspan="3">admin</td>
    </tr>
    </tfoot>
</table>
</body>
</html>
