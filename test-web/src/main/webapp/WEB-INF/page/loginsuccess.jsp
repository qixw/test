<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>用户登录 - Admin Login::</title>
    <link rel="shortcut icon" type="image/ico" href="/favicon.ico">
    <link rel="stylesheet" href="/r/login/min.css" type="text/css" media="screen">
    <link rel="stylesheet" href="/r/login/zh-cn.default.css" type="text/css" media="screen">
    <script type="text/javascript">
        if (top != this) {
            top.location = this.location;
        }
        $(function () {
            $("#username").focus();
        });
    </script>
    <style>
        html, body {
            background-color: #036;
        }

        #container {
            margin: 10% auto 0 auto;
        }

        #login-panel {
            margin: 0 auto;
            width: 540px;
            min-height: 280px;
            background-color: #fff;
            border: 1px solid #dfdfdf;
            -moz-border-radius: 3px;
            -webkit-border-radius: 3px;
            border-radius: 3px;
            -moz-box-shadow: 0px 0px 30px rgba(0, 0, 0, 0.75);
            -webkit-box-shadow: 0px 0px 30px rgba(0, 0, 0, 0.75);
            box-shadow: 0px 0px 30px rgba(0, 0, 0, 0.75);
        }

        #login-panel .panel-head {
            min-height: 70px;
            background-color: #edf3fe;
            border-bottom: 1px solid #dfdfdf;
            position: relative;
        }

        #login-panel .panel-head h3 {
            margin: 0 0 0 20px;
            padding: 0;
            line-height: 70px;
        }

        #login-panel .panel-head .nav {
            float: right;
            position: absolute;
            right: 0;
            top: 0;
            padding: 0;
        }

        #login-panel .panel-head .nav .btn {
            clear: both;
            display: block;
            margin: 10px 10px 0 0;
            position: absolute;
            top: 6px;
            right: 6px;
            border-color: #ccc;
        }

        #login-panel #mobile {
            height: 28px;
        }

        #login-panel #mobile i {
            margin: 0;
            padding: 0;
        }

        #login-panel #lang {
            right: 60px;
            padding: 8px;
            width: auto;
            word-spacing: nowrap;
            overflow: visible;
            min-width: 80px;
            text-align: center;
        }

        #login-panel .panel-content {
        }

        #login-panel .panel-content table {
            border: none;
            width: 300px;
            margin: 20px auto;
        }

        #login-panel .panel-content table td {
            padding: 6px;
        }

        #login-panel .panel-content table td.attr {
            font-weight: bold;
            text-align: right;
            vertical-align: middle;
        }

        #login-panel .panel-content input.text-2 {
            width: 212px;
        }

        #login-panel .panel-content input.text-9 {
            width: 100px;
        }

        #login-panel .panel-content .button-s {
            width: 80px;
        }

        #login-panel .panel-content .button-c {
            width: 88px;
            margin-right: 0;
        }

        #login-panel .panel-foot {
            text-align: center;
            padding: 15px;
            line-height: 2em;
            background-color: #e5e5e5;
            border-top: 1px solid #dfdfdf;
        }

        .droppanel {
            display: none;
            margin: 0;
            padding: 4px 0;
            position: absolute;
            left: 0;
            top: 55px;
            background-color: #fff;
            -moz-box-shadow: 0px 2px 6px rgba(0, 0, 0, 0.5);
            -webkit-box-shadow: 0px 2px 6px rgba(0, 0, 0, 0.5);
            box-shadow: 0px 2px 6px rgba(0, 0, 0, 0.5);
            z-index: 9999;
        }

        #langs {
            left: -166px;
        }

        #qrcode {
            left: -310px;
            padding: 0;
        }

        #qrcode h4 {
            background-color: #e5e5e5;
            line-height: 2em;
            padding: 5px 15px;
        }

        .droppanel li {
            list-style: none;
            min-width: 120px;
            font-size: 14px;
        }

        .droppanel li a {
            display: block;
            padding: 8px 15px;
            border-bottom: 1px dashed #eee;
        }

        .droppanel li a:hover {
            background-color: #e5e5e5;
            color: #333;
        }

        .droppanel li a.active {
            background-color: #FAFFBD;
        }

        #poweredby {
            float: none;
            color: #eee;
            text-align: center;
            margin-top: 30px;
        }

        #poweredby a {
            color: #fff;
        }
    </style>
    <link type="text/css" rel="stylesheet" href="${base }/r/login/safari.css">
</head>
</head>
<body background="/r/h+/img/background.jpg" style="height: 270px;width: 1920px;">
<div id="container">
    <div id="login-panel">
        <div class="panel-head">
            <h3>欢迎使用</h3>
        </div>
        <div class="panel-content" id="login-form">
            <form action="${base }/login.do" name="loginform" accept-charset="utf-8" id="login_form" method="post">
                <c:if test="${not empty returnUrl}">
                    <input type="hidden" name="returnUrl" value="${returnUrl}"/>
                </c:if>
                <c:if test="${not empty processUrl}">
                    <input type="hidden" name="processUrl" value="${processUrl}"/>
                </c:if>
                <table>
                    <tbody>
                    <tr>
                        <td class="attr">用户名</td>
                        <td>
                            <input class="text-2" type="text" id="username" name="username" required="required"
                                   maxlength="18" value="" placeholder="用户名"/>
                        </td>
                    </tr>
                    <tr>
                        <td class="attr">密码</td>
                        <td>
                            <input class="text-2" type="password" name="password" required="required" maxlength="18"
                                   value="" placeholder="6~18位密码"/>
                        </td>
                    </tr>
                    <tr>
                    <td class="attr">验证码</td>
                    <td>
                    <input class="text-9" type="text" name="captcha" style="float: left;" required="required" placeholder="验证码"/>
                    <img style="float: right;" src="${base}/captcha.svl" onclick="this.src='${base}/captcha.svl?d='+new Date()*1" />
                    <td>
                    </tr>
                    <tr>
                        <td colspan="3" style="text-align: center;">
                            <input type="submit" value="登录" class="button-s">
                            <input type="reset" value="重置" class="button-s">
                        </td>
                    </tr>
                    <%--<tr>
                        <td colspan="3" style="text-align: center;">
                            <c:if test="${not empty error}">
                                <c:if test="${error=='org.apache.shiro.authc.IncorrectCredentialsException'}">
                                    <span style="color:red;">* 密码错误</span>
                                </c:if>
                                <c:if test="${error=='org.apache.shiro.authc.UnknownAccountException'}">
                                    <span style="color:red;">* 用户不存在</span>
                                </c:if>
                                <c:if test="${error=='com.jlc.web.exception.CaptchaErrorException'}">
                                    <span style="color:red;">* 验证码错误 </span>
                                </c:if>
                                <c:if test="${error=='com.jlc.web.exception.DisabledException'}">
                                    <span style="color:red;">* 用户被禁用 </span>
                                </c:if>
                            </c:if>
                        </td>
                    </tr>--%>
                    </tbody>
                </table>
            </form>
        </div>
    </div>
</div>
<script laguage="Javascript">
    $(document).ready(function () {
        $('#account').focus();
    })
</script>
</body>
</body>
</html>