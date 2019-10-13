
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>MuMTube</title>
</head>
<body>
<h1 align="center">Public Dashboard</h1>
<c:forEach var="video" items="${videos}">
    <li>
        <a href="/${video}">${video}</a>
    </li>

</c:forEach>
</body>
</html>