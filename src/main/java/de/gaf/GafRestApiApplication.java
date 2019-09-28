package de.gaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GafRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GafRestApiApplication.class, args);
	}

}
