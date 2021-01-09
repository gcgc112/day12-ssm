<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ZWJ
  Date: 2020/11/17
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
商品列表.....
<table border="1" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th>编号</th>
        <th>商品名称</th>
        <th>价格</th>
        <th>详细</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <%--展示信息--%>
    <c:forEach items="${list}" var="goods">
        <tr>
            <td>${goods.gid}</td>
            <td>${goods.gname}</td>
            <td>${goods.gprice}</td>
            <td>${goods.gdesc}</td>
            <td><a href="showupdate.do?gid=${goods.gid}">修改</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
