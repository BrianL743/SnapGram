package dev.snapgram.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import dev.snapgram.services.AWSS3Service;
 
@RestController
@RequestMapping(value= "/s3")
public class AWSS3Ctrl {
 
    @Autowired
    private AWSS3Service service;
 
    @PostMapping(value= "/upload")
    public ResponseEntity<String> uploadFile(@RequestPart(value= "file") final MultipartFile multipartFile) {
        service.uploadFile(multipartFile);
      
        final String response = "https://snapgram-s3-bucket.s3.us-east-2.amazonaws.com/" + multipartFile.getOriginalFilename() ;
        

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}