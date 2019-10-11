package org.mumyoutube.youtube_controllers;

import org.mumyoutube.model.Video;
import org.mumyoutube.youtube_service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoController {
    @Autowired
   private IVideoService videoService;

  /*  @Value("youtube.video.source.path")
    private String basePath;
*/
    @RequestMapping(value="/addVideo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addVideo(@RequestBody Video video){
        videoService.addVideo(video);
    }

    @GetMapping("/videos")
    public List<Video> getAllVideos(){
        return videoService.getAllVideos();
    }


    @RequestMapping(value = "/videoUpload", method=RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Object> upLoadVideo(@RequestParam("file") MultipartFile file) throws IOException {
        return videoService.uploadVideo(file);
    }
}
