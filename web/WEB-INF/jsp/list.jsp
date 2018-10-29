<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/26
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>人员列表</title>
<<<<<<< HEAD
=======
    <meta charset="utf-8">
>>>>>>> 7a442adbbd30ba23a1afa68c1b69ff932b08ef0f
    <style>
        .table4_10 table {
            width:100%;
            margin:15px 0;
            border:0;
        }
        .table4_10 th {
            background-color:#50D6FF;
            color:#FFFFFF
        }
        .table4_10,.table4_10 th,.table4_10 td {
            font-size:0.95em;
            text-align:center;
            padding:4px;
            border-collapse:collapse;
        }
        .table4_10 th,.table4_10 td {
            border: 1px solid #9be7fe;
            border-width:1px 0 1px 0
        }
        .table4_10 tr {
            border: 1px solid #9be7fe;
        }
        .table4_10 tr:nth-child(odd){
            background-color:#c4f1fe;
        }
        .table4_10 tr:nth-child(even){
            background-color:#fdfdfd;
        }
    </style>
    <style type="text/css">
        table.gridtable {
            font-family: verdana,arial,sans-serif;
            font-size:11px;
            color:#333333;
            border-width: 1px;
            border-color: #666666;
            border-collapse: collapse;
        }
        table.gridtable th {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background-color: #dedede;
        }
        table.gridtable td {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background-color: #ffffff;
        }
    </style>

</head>
<body>
    <div align="center">
        <table class="table4_10">
        <c:forEach items="${persons}" var="item" varStatus="records">
            <tr>
                <td>${records.count}</td>
                <td>${item.name}</td>
                <td >${item.age}</td>
                <td >${item.address}</td>
            </tr>
        </c:forEach>
        </table>
    </div>

</body>
</html>
