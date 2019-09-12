package com.assign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;


@SpringBootApplication(scanBasePackages = {"com.assign"})
public class AssignmentApplication {
	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}
}
