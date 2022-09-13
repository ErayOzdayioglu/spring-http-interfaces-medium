package com.example.demo;

import com.example.demo.client.ProductClient;
import com.example.demo.entity.Product;
import org.apache.logging.log4j.Logger;
import org.apache.logging.slf4j.SLF4JLogger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ProductClient productClient) {
		return args -> {
			Product product = productClient.getProduct(1);
			System.out.println(product);
		};
	}
}
