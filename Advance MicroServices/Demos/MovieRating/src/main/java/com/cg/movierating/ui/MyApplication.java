package com.cg.movierating.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("com.cg.movierating")
public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MyApplication.class, args);
	}

}
