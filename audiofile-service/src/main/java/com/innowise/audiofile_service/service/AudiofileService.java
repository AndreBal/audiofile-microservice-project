package com.innowise.audiofile_service.service;

import java.util.List;
import java.util.UUID;

import com.innowise.audiofile_service.model.Audiofile;
import com.innowise.audiofile_service.repository.AudiofileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class AudiofileService {

    @Autowired
    AudiofileRepository audiofileRepository;

    public Iterable<Audiofile> getAllAudiofiles(){
        return audiofileRepository.findAll();
    }
}
