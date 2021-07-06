package dev.paulosouza.edf1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.config.EnableIntegration;

@EnableIntegration
@SpringBootApplication
public class Edf1Application {

	public static void main(String[] args) {
		SpringApplication.run(Edf1Application.class, args);
	}

}
