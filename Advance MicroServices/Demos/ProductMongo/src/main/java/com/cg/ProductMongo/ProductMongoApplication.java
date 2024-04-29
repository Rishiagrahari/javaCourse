package com.cg.ProductMongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cg.ProductMongo")
public class ProductMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductMongoApplication.class, args);
	}

}
