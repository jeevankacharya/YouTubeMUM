<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <button style="float:right;" class="tablinks" onclick="window.open('addNewPlaylist')">Create Playlist</button>

</div>
<br>
<br>
<h3>List of all Videos and Playlist videos</h3>
<table>
    <tr>
        <td>

            <table border="1px" cellpadding="0" cellspacing="0" id="styleTable" >

                <h3>List of all Videos</h3>
                        <tr>
                              <th>Video Id</th>
                              <th>User Id</th>
                              <th>Likes</th>
                              <th>Dislikes</th>
                        </tr>

                             <c:forEach var="video" items="${videoList}">
                                 <tr>
                                     <td>${video.videoId}</td>
                                     <td>${video.userId}</td>
                                     <td>${video.no_dislikes}</td>
                                     <td>${video.no_likes}</td>
                                </tr>
                             </c:forEach>

            </table>
        </td>
        <td>
            <!--loop through all the playlists available-->
            <h3>Playlist videos</h3>
            <c:forEach var="playlist" items="${playlistList}">

                    <table border="1px" cellpadding="0" cellspacing="0" >

                            <thead>
                                    <tr>
                                        <th>playlist Id = ${playlist.userId}</th>
                                        <th>Playlist Name  = ${playlist.playlistName}</th>
                                    </tr>
                            </thead>
                            <tbody>
                                    <c:forEach var="videos" items="${videoList}">
                                           <c:if test = "${videos.userId==playlist.userId}">
                                                    <tr>
                                                        <td>${videos.videoId}</td>
                                                        <td>${videos.userId}</td>
                                                    </tr>
                                           </c:if>
                                    </c:forEach>
                            </tbody>
                    </table>
            </c:forEach>

        </td>
    </tr>
</table>
</body>
</html>
