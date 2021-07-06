package dev.paulosouza.edfproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding({ DespesaSource.class })
@SpringBootApplication
public class EdfProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdfProducerApplication.class, args);
	}

}
