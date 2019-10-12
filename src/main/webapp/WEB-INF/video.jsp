<%--
  Created by IntelliJ IDEA.
  User: hhh
  Date: 10/11/19
  Time: 3:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WELCOME</title>
</head>
<body>
<h2>MUMTUBE ${path}</h2>
<video width="320" height="240" autoplay="autoplay" controls>
    <td>${path}</td>td>
    <source src= "$@{path}" type="video/mp4">
    Your browser does not support the video tag.
</video>
</body>
</html>
