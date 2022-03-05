<%--
  Created by IntelliJ IDEA.
  User: Liu_King
  Date: 2022-3-3
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>用户登录</title>
</head>
<body>
<div style="text-align: center">
    <form action="${pageContext.request.contextPath}/login" method="post" id="loginForm">
        用户名：<input type="text" name="userName"> <br>
        密码:<input type="password" name="userPwd"> <br>
        <span id="msg" style="font-size: 12px;color:#ff0000"></span> <br>
        <button type="button" id="loginBtn">登录</button>
        <button type="reset">重置</button>
    </form>
</div>
</body>
<!-- 引入js -->
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>
<script type="text/javascript">
    $("#loginBtn").click(function() {
        //获取用户名和密码
        var uname = $("userName").val();
        var upwd = $("userPwd").val();

        //判断用户名是否为空
        if (isEmpty(uname)) {
            $("#msg").html("用户名不能为空！\n请再次输入！");
            return;
        }

        //判断密码是否为空
        if (isEmpty(upwd)) {
            $("#msg").html("密码不能为空！");
            return;
        }

        //如果都不为空，手动提交表单
        $("#loginForm").submit();
    });

    function isEmpty(str) {
        return str == null || str.trim() === "";
    }
</script>
</html>
