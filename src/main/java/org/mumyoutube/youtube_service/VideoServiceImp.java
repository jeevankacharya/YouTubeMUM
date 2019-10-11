package org.mumyoutube.youtube_service;
import org.mumyoutube.model.Video;
import org.mumyoutube.youtube_dao.IVideoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class VideoServiceImp implements IVideoService {

    @Autowired
    private IVideoDAO videoDAO;

    @Override
    public void addVideo(Video video) {
        videoDAO.addVideo(video);
    }

    @Override
    public List<Video> getAllVideos() {
        return videoDAO.getAllVideos();
    }

    @Override
    public ResponseEntity<Object> uploadVideo(MultipartFile file) throws IOException {
        return videoDAO.uploadVideo(file);
    }
}
