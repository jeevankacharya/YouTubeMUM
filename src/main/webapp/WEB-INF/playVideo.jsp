<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--
  Created by IntelliJ IDEA.
  User: hhh
  Date: 10/11/19
  Time: 3:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Video</title>
</head>
<body>
<h2>Videos</h2>
    <c:forEach var="video" items="${videos}">
            <li>
                <a href="/${video}">${video}</a>
            </li>

        <video width="320" height="240" autoplay="autoplay" controls>
            <source src="${uploadingDir}/${videos}" type="video/mp4">
        </video>
    </c:forEach>
</body>
</html>
