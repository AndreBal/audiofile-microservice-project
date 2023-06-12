package com.innowise.audiofile_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.innowise.audiofile_service.*")
@ComponentScan(basePackages = { "com.innowise.audiofile_service.*" })
@EntityScan("com.innowise.audiofile_service.*")
public class AudioFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(AudioFileApplication.class, args);
	}

}
