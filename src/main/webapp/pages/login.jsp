<%--
  Created by IntelliJ IDEA.
  User: Tanya
  Date: 22.07.2024
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<jsp:include page="_bootstrap.jsp"/>
<jsp:include page="_header.jsp"/>


<form action="/login" method="post">
    <input type="text" name="username" placeholder="Name" value="${username}">
    <input type="text" name="password" placeholder="Password">
    <button>Submit</button>
</form>
<p>${message}</p>
</body>
</html>
