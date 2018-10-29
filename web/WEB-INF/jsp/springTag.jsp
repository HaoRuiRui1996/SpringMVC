<%--
  Created by IntelliJ IDEA.
  User: 14502
  Date: 2018/10/27
  Time: 0:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<% String path = request.getContextPath(); %>
<html>
<head>
    <title>Spring tag</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="<%=path%>/common/css/style.css">
    <style>
        label.error {
            color: #000000;
        }
    </style>
</head>
<body>
<div class="modal">
    <div class="form">
        <sf:form method="post" commandName="person" action="dealReg">
            <label name="name">昵　称</label>
            <sf:input id="name" required="required" path="name"/>
            <sf:errors path="name"></sf:errors><br />
            <label name="email">电子邮件</label>
            <sf:input id="email" name="email" type="email" required="required" path="email"/>
            <sf:label path="password" name="pass" >密　码</sf:label>
            <sf:password id="pass" name="password" required="required" path="password"/>
            <sf:errors path="password" cssStyle="color: red"></sf:errors>
            <button type="submit" >注　册</button>
        </sf:form>
    </div>

</div>
<div>
    <s:url value="/dealRegister" var="register">
        <s:param name="name" value="郝瑞瑞1996"></s:param>
        <s:param name="email" value="1450289924@qq.com"></s:param>
        <s:param name="password" value="123456"></s:param>
    </s:url>
    <a href="${register}">另一个注册页面</a>
</div>
</body>
</html>
