package com.innowise.audiofile_service.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.hateoas.RepresentationModel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString
@Table(name="audiofiles")
@javax.persistence.Entity
public class Audiofile extends RepresentationModel<Audiofile> {
    @Id
    @Column(name = "filepath", nullable = false)
    String filepath;

}