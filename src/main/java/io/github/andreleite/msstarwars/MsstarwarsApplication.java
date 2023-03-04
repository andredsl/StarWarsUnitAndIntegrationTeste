package io.github.andreleite.msstarwars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "io.github.andreleite.msstarwars.repository")
public class MsstarwarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsstarwarsApplication.class, args);


	}

}
