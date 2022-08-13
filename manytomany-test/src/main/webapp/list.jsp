<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2022/8/13
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>爱好</th>
        <th>住址</th>
        <th>生日</th>
        <th>罪名</th>
        <th></th>
    </tr>
    <c:forEach items="${list}" var="s">
    <tr>
        <td>${s.id}</td>
        <td>
            <a href="info.jsp?id=${s.id}" style="text-decoration:saddlebrown">${s.name}</a>
        </td>
        <td>${s.sex}</td>
        <td>${s.age}</td>
        <td>${s.hobby}</td>
        <td>${s.address}</td>
        <td>${s.birthday}</td>
        <td>
            <c:forEach items="${s.stuAndMis}" var="sd">
                ${sd.mistakes.name}
            </c:forEach>
        </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
