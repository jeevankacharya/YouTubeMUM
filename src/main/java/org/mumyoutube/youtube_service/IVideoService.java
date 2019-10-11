package org.mumyoutube.youtube_service;

import org.mumyoutube.model.Video;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface IVideoService {
    void addVideo(Video video);
    List<Video> getAllVideos();
    ResponseEntity<Object> uploadVideo(MultipartFile file) throws IOException;
}
