package com.example.backend.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;

/**
 * @author caodinh
 */
@RestController
public class ImgController {
    @GetMapping("/image")
    public ResponseEntity<byte[]> getImage() throws IOException {
        ClassPathResource resource = new ClassPathResource("static/images/ao/ao_unisex.jpeg");
        byte[] imageBytes = Files.readAllBytes(resource.getFile().toPath());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
    }
}
