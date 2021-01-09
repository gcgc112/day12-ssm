<%--
  Created by IntelliJ IDEA.
  User: ZWJ
  Date: 2020/11/18
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form action="update.do" method="post">
    <input type="hidden" name="gid" value="${goods.gid}">
    <p>gname<input name="gname" value="${goods.gname}"></p>
    <p>gprice<input name="gprice" value="${goods.gprice}"></p>
    <p>gdesc<input name="gdesc" value="${goods.gdesc}"></p>
    <input type="submit" value="提交修改">
</form>
</body>
</html>
