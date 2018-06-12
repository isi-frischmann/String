package com.isabell.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class StringApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StringApplication.class, args);
	}
	
	@GetMapping("/")
	public String index() {
		return "Hello. How are you doing?";
	}
	
	@GetMapping("/random")
	public String randomPage() {
		return "Spring Boot is great. I don't know if I'm serious what I'm saying here :D";
	}
}
