<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html xmlns:th="http://www.thymeleaf.org">
<head>
    <link href="css/style.css"   rel="stylesheet">
    <div th:replace="/header :: header-css"/>
</head>
<body>
<script src="js/format.js"></script>
<div class="tab">
    <button style="float:left;" class="tablinks" onclick="location.reload();location.href='playVideo'">MumTube</button>
    <button style="float:right;" class="tablinks" onclick="location.reload();location.href='login'">SignOut</button>
    <button style="float:right;" class="tablinks" onclick="window.open('upload')">Upload Video</button>
    <button style="float:right;" class="tablinks" onclick="window.open('allVideos')">My Playlists</button>

</div>

<div align="center">
<h1>${headerMessage}</h1>

<h1>Video Upload</h1>
<%--@elvariable id="upload" type=""--%>
<form:form method="post" action="upload" enctype="multipart/form-data" modelAttribute = "upload">
    <input type="file" name="file" /><br />
    <table>
        <tr>
            <td><form:label path="userId">User Id</form:label></td>
            <td><form:input path="userId" cssClass="inputStyle"/></td>
        </tr>
        <tr>
            <td><form:label path="videoDescription">Video Description</form:label></td>
            <td><form:input path="videoDescription" cssClass="inputStyle"/></td>
        </tr>
    </table>
    <br /> <input type="submit" value="Upload" />
</form:form>
</div>

</body>
</html>




