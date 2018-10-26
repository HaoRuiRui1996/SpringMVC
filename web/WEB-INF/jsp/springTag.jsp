<%--
  Created by IntelliJ IDEA.
  User: 14502
  Date: 2018/10/27
  Time: 0:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<% String path = request.getContextPath(); %>
<html>
<head>
    <title>Spring tag</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="<%=path%>/common/css/style.css">
</head>
<body>
<div class="modal">
    <div class="form">
        <sf:form method="post" commandName="person" action="dealReg">
            <label name="name">昵　称</label>
            <sf:input id="name" required="required" path="name"/>
            <label name="email">电子邮件</label>
            <sf:input id="email" name="email" required="required" path="email"/>
            <label name="pass">密　码</label>
            <sf:password id="pass" name="password" required="required" path="password"/>
            <sf:errors path="password" ></sf:errors>
            <button type="submit">注　册</button>
        </sf:form>
    </div>
</div>
</body>
</html>
