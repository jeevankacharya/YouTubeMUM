<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Create New Playlist</title>
</head>
<body>
<h1>${headerMessage}</h1>
    <form:form method="post" action="addNewPlaylist" modelAttribute = "playlist">
        <table>
            <tr>
                <td><form:label path="playlistName">Playlist Name</form:label></td>
                <td><form:input path="playlistName"/></td>
            </tr>
            <tr>
                <td><form:label path="userId">User Id</form:label></td>
                <td><form:input path="userId"/></td>
            </tr>
            <tr>
                <td><form:label path="videoId">Video Id</form:label></td>
                <td><form:input path="videoId"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
