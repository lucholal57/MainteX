package com.project.MainteX;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class MainteXApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainteXApplication.class, args);
	}

}
