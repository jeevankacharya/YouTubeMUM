<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>

<html xmlns:th="http://www.thymeleaf.org">
<head>
    <link href="css/style.css"   rel="stylesheet">
    <div th:replace="/header :: header-css"/>
</head>
<body>
<script src="js/format.js"></script>
<div class="tab">
    <button style="float:left;" class="tablinks" onclick="location.reload();location.href='playVideo'">MumTube</button>
    <button style="float:right;" class="tablinks" onclick="window.open('login')">SignOut</button>
    <button style="float:right;" class="tablinks" onclick="window.open('upload')">Upload Video</button>
    <button style="float:right;" class="tablinks" onclick="window.open('allVideos')">My Playlists</button>

</div>

<h1>Video Upload Status</h1>

Status is: ${message}

</body>
</html>