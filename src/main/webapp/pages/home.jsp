<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Tanya
  Date: 21.07.2024
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home Page</title>

</head>
<body>

<jsp:include page="_bootstrap.jsp"/>
<jsp:include page="_header.jsp"/>


<%--<h1>Hello ${myName}!</h1>--%>
<%--<c:if test="${flag}">--%>
<%--    <h1>Is Enabled</h1>--%>
<%--    <button>Admin Panel</button>--%>
<%--</c:if>--%>

<%--<ul>--%>
<%--    <c:forEach items="${list}" var="item">--%>
<%--        <li>${item}</li>--%>
<%--    </c:forEach>--%>
<%--</ul>--%>

<%--</ul>--%>
<%--<if condition="${flag}">--%>
<%--    <h1>Is Enabled</h1>--%>
<%--</if>--%>
<%--<for items="${flag}" item="card">--%>
<%--    <li>${card.title}</li>--%>
<%--</for>--%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
