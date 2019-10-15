package org.mumyoutube;

import org.mumyoutube.controller.VideoUploadController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.File;

@SpringBootApplication
@EnableSwagger2

public class MainApplication {

    public static void main(String[] args) {
        new File(VideoUploadController.uploadingDir).mkdirs();
        SpringApplication.run(MainApplication.class, args);
   }
}
