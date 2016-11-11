<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<html>
<head>
<title>登录界面</title>
<style type="text/css">
body {
background-color: #555555;
}

#titel_img {
width: 417px;
}

#log_image {
z-index: 0;
position: absolute;
left: 50%;
top: 50%;
height: 151px;
width: 400px;
margin-left: -200px;
margin-top: -100px;
}

#text_box {
position: absolute;
top: 65px;
left: 40px;
z-index: 1;
/* background-color: #FF0000;*/
}

#text_box div {
color: #FFFFFF;
}

#titel_text {
position: absolute;
}
</style>
</head>
<body>
<form action="${pageContext.request.contextPath }/user/login" method="post">
<div id="log_image">
<div id="titel_text">
<img id=titel_img src="header_logo.gif">
</div>
<img id="log" src="login.gif">
<div id="text_box">
<div>用户名: <input type="text" name="user.userName"></dvi>
<div>密 码: <input type="password" name="user.password"></div>
<div> 验证码: <input type="text"><img src="yan.bmp" style="position:relative;top: 5px">
<input type="button" value="登录"><font color="red">${errorMsg}</font></div>
</div>
</div>
</form>
</body>
</html>
