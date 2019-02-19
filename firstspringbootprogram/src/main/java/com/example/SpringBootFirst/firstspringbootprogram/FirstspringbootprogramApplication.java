package com.example.SpringBootFirst.firstspringbootprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.SpringBootFirst.firstspringbootprogram.controllers")
public class FirstspringbootprogramApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstspringbootprogramApplication.class, args);
	}

}
