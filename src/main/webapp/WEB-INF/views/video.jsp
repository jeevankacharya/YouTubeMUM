
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html xmlns:th="http://www.thymeleaf.org">
<head>
    <link href="css/style.css"   rel="stylesheet">
    <div th:replace="/header :: header-css"/>
</head>

<body>
<video width="320" height="240" controls>
    <source src= "${MP4_FILE}" type="video/mp4">
    Your browser does not support the video tag.
</video>
</body>
</html>