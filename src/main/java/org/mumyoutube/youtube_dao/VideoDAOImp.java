package org.mumyoutube.youtube_dao;

import org.hibernate.Session;
import org.mumyoutube.model.Video;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Transactional
@Repository
public class VideoDAOImp implements IVideoDAO {
    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    @Value("youtube.video.source.path")
    private String basePath;

    @Override
    public void addVideo(Video video) {
        Session current = entityManager.unwrap(Session.class);
        current.save(video);
    }

    public ResponseEntity<Object> uploadVideo(MultipartFile file) throws IOException {
        return getObjectResponseEntity(file, basePath);
    }

    public static ResponseEntity<Object> getObjectResponseEntity(MultipartFile file, String basePath) throws IOException {
        File file1 = new File(basePath + file.getOriginalFilename());
        file1.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        fileOutputStream.write(file.getBytes());
        fileOutputStream.close();
        return new ResponseEntity<>("video uploaded successfully", HttpStatus.OK);
    }

    @Override
    public List<Video> getAllVideos() {
        String q = "Select * from video";
        Query<Video> query = (Query<Video>) entityManager.createNativeQuery(q);
        List<Video> list = query.list();
        return list;
    }
}
