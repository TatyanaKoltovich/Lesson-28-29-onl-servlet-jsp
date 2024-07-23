<%--
  Created by IntelliJ IDEA.
  User: Tanya
  Date: 23.07.2024
  Time: 1:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>

<jsp:include page="_bootstrap.jsp"/>
<jsp:include page="_header.jsp"/>

<form action="/calculator" method="post">
    <input type="text" name="num1" placeholder="Number1" value="${num1}">
    <input type="text" name="num2" placeholder="Number2" value="${num2}">
    <input type="text" name="type" placeholder="Type" value="${type}">
    <button>Submit</button>
    <input type="text" name="result" placeholder="Result" value="${result}">

</body>
</html>
