package org.mumyoutube.controller;


import org.hibernate.engine.internal.Collections;
import org.mumyoutube.model.Video;
import org.mumyoutube.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.ResourceRegion;
import org.springframework.http.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;
import javax.websocket.server.PathParam;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mumyoutube.controller.VideoUploadController.uploadingDir;


@Controller
@RequestMapping

public class VideoplayListController {

    VideoService videoService;

    @Autowired
    public VideoplayListController(VideoService videoService) {
        super();
        this.videoService = videoService;
    }

    @GetMapping(value = "/playVideo", produces = "video/mp4")
    @ResponseBody
    public ModelAndView videoSource( ) throws IOException {
        ModelAndView mv = new ModelAndView();

        //List<Video> video = videoService.getAllVideo();
       // Path videosPath = Paths.get(uploadingDir);

        List v = Files.list(Paths.get(uploadingDir)).collect(Collectors.toList());
        List vPath = new ArrayList();
        for (Object s:v ) {
            vPath.add(Paths.get(s.toString()).getFileName());
        }
        mv.addObject("videos",vPath);

        return  mv;
    }

    @GetMapping( value = "/{videoName}", produces = "video/mp4")
    @NotNull
    public String video(@PathVariable String videoName) {
        Path fullPath = Path.of  (uploadingDir +"/"+ videoName);
        ModelAndView model = new ModelAndView();
        model.addObject("path", fullPath);

        return "video";
    }
}
