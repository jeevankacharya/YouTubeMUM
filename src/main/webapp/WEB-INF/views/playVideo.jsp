
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/style.css"/>
</head>
<body>

<script src="js/format.js"></script>

<!-- Tab links -->
<div class="tab">
    <button style="float:left;" class="tablinks" onclick="location.reload();location.href='playVideo'">MumTube</button>
    <button style="float:right;" class="tablinks" onclick="location.reload();location.href='login'">SignOut</button>
    <button style="float:right;" class="tablinks" onclick="window.open('upload')">Upload Video</button>
    <button style="float:right;" class="tablinks" onclick="window.open('allVideos')">My Playlists</button>
    <button style="float:right;" class="tablinks" onclick="window.open('addNewPlaylist')">Create Playlist</button>

</div>

<div class="row" style="margin-top: 20px">
    <div class="column">
        <c:forEach var="video" items="${videos}">
            <div class="videoDiv" style="float: left; padding-right: 10px">
            <a href="/${video}"><video width="400" controls>
                <source src="/${video}">
            </video>
            </a>
                <p>${video}</p>
            </div>
                <%--<a href="/${video}">${video}><img src="/images/playvideo.png" style="width: 10%"></a>--%>
        </c:forEach>
    </div>
</div>
        </td>
    </tr>
</table>


</body>
</html>