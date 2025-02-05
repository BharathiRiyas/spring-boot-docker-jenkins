package com.mypack.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootDockerJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerJenkinsApplication.class, args);
	}
	@RestController
	@RequestMapping("/api")
	class HelloWorldController {
	    @GetMapping("/hello")
	    public String hello() {
	        return "Hello, Docker and Jenkins!";
	    }
	}

}
