<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-05-10
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加后台类目</title>
</head>
<body>
       <form action="/addBackCategory" method="POST">
           <table>
               <tr>
                   <td>名称</td><td><input type="text" name="name"></td>
               </tr>
               <tr>
                   <td>code</td><td><input type="text" name="code"></td>
               </tr>
               <tr>
                   <td>父组类目</td><td><input type="text" name="parentId"></td>
               </tr>
               <tr>
                   <td>类目级别</td><td><input type="text" name="level"></td>
               </tr>
               <tr>
                   <td colspan="2"><input type="submit" value="提交"></td>
               </tr>

           </table>

       </form>
</body>
</html>
