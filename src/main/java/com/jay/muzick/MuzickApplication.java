package com.jay.muzick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MuzickApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuzickApplication.class, args);
	}

	@GetMapping("")
	public static String hello(){
		return "Hello World";
	}
	@GetMapping("/helloworld")
	public static String world(){
		return "Hello World";
	}
}
