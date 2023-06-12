package com.innowise.audiofile_service.controller;

import com.innowise.audiofile_service.model.Audiofile;
import com.innowise.audiofile_service.service.AudiofileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="v1/audioFile")
public class AudioFileController {

    @Autowired
    private AudiofileService audiofileService;

    @GetMapping
    public ResponseEntity<Iterable<Audiofile>> getAllAudiofiles(){
        Iterable<Audiofile> audiofiles = audiofileService.getAllAudiofiles();
        if(audiofiles == null){
            return ResponseEntity.status(500).body(audiofiles);
        }
        return ResponseEntity.ok(audiofiles);
    }
}
