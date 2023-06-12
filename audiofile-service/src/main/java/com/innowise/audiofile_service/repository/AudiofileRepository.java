package com.innowise.audiofile_service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.innowise.audiofile_service.model.Audiofile;

@Repository
public interface AudiofileRepository extends CrudRepository<Audiofile,String>{

}
