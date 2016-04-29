<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016-03-26
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<html>
<head>
    <title>支付</title>
</head>
<body>
    ${userName},${msg}
<table width="100px" border="1px">
    <c:forEach var="user" items="${userList}">
        <tr>
            <td>${user.userName}</td><td>${user.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
<%--<script>
     $(document).ready(function(){
         var saveDataAry=[];
         var data1={"userName":"test","address":"bj"};
         var data2={"userName":"test","address":"sh"};
         saveDataAry.push(data1);
         saveDataAry.push(data2);
         $.ajax({
             type:"post",
             url:"pay/insert",
             dataType:"json",
             contentType:"application/json",
             data:JSON.stringify(saveDataAry),
             success:function (data) {

             }
         });
     });

</script>--%>
</html>
