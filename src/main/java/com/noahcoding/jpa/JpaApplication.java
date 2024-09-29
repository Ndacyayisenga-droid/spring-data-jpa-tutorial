package com.noahcoding.jpa;

import com.noahcoding.jpa.models.Author;
import com.noahcoding.jpa.models.Video;
import com.noahcoding.jpa.repositories.AuthorRepository;
import com.noahcoding.jpa.repositories.VideoRepositoy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository, VideoRepositoy videoRepository) {
		return args -> {
			/*var author = Author.builder()
					.firstName("Tayebbwa")
					.lastName("Noah")
					.age(20)
					.email("tayebbwa@noah.com")
					.build();
			authorRepository.save(author);*/
			var video = Video.builder()
					.name("abc")
					.length(5)
					.build();
			videoRepository.save(video);
		};
	}

}
