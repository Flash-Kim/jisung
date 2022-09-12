package com.example.jisung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JisungApplication {

	public static void main(String[] args) {
		SpringApplication.run(JisungApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

}
