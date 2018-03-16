package com.itin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.itin.entity")
@ComponentScan(basePackages = {"com.itin"})
public class ItinManagerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItinManagerApiApplication.class, args);
	}
}
