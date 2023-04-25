package io.github.wisch096.controlevendasapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ControleVendasApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleVendasApiApplication.class, args);
	}

}
