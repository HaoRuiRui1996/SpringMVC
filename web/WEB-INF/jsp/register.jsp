<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath(); %>
<html>
<head>
    <title>注册</title>
    <meta charset="utf-8">
    <script src="<%=path%>/common/js/jquery.min.js"></script>
    <script src="<%=path%>/common/js/jquery.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=path%>/common/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="<%=path%>/common/css/htmleaf-demo.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/common/css/style.css">
</head>
<body>
<div class="htmleaf-container">
    <header class="htmleaf-header">
<<<<<<< HEAD
        <h1>模态窗口样式的用户注册UI界面设计 <span>A Sign Up Modal Design</span></h1>
=======
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f
        <div class="htmleaf-links">
            <a class="htmleaf-icon icon-htmleaf-home-outline" href="" title="jQuery之家" target="_blank"><span>主页</span></a>
            <a class="htmleaf-icon icon-htmleaf-arrow-forward-outline" href="" title="返回下载页" target="_blank"><span> 返回下载页</span></a>
        </div>
    </header>
    <div class="open">Open Modal</div>
    <div class="modal">
        <div class="form" >
<<<<<<< HEAD
            <form action="dealRegister" method="post">
                <label for="name" required="required">昵　称</label>
                <input id="name" type="text" name="name"/>
                <label for="email" required="required">电子邮件</label>
                <input id="email" type="email" name="email"/>
                <label for="pass">密　码</label>
                <input id="pass" type="password" name="password" required="required"/>
=======
            <form action="dealRegister" method="post" enctype="multipart/form-data">
                <label for="name" >昵　称</label>
                <input id="name" type="text" name="name" required="required"/>
                <label for="email"  >电子邮件</label>
                <input id="email" type="email" name="email" required="required"/>
                <label for="pass">密　码</label>
                <input id="pass" type="password" name="password" required="required"/>
                <label >图 片</label>
                <input type="file" name="profilePicture" accept="image/jpeg,image/png,image/gif">
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f
                <button type="submit">注　册</button>
            </form>
        </div>
        <div class="invite">
            <h3>Register now for our award-winning service and get a 14 day free trial.</h3>
            <div class="nope">No thanks, I dont like saving money</div>
            <div title="close" class="close"></div>
        </div>
    </div>
</div>

<script type="text/javascript">
    $(".close, .nope").on('click', function () {
        $('.modal').addClass('hidden');
        $('.open').addClass('active');
    })

    $(".open").on('click', function () {
        $(this).removeClass('active');
        $('.modal').removeClass('hidden');
    })
</script>
</body>
</html>
