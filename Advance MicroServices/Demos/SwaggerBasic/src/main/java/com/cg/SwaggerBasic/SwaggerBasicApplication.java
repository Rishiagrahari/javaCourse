package com.cg.SwaggerBasic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.support.RequestHandledEvent;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerBasicApplication.class, args);
	}
   @Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.cg.SwaggerBasic"))
				.build()
				.apiInfo(myApiInfo());
		
	}
private ApiInfo myApiInfo() {
	// TODO Auto-generated method stub
	ApiInfo apiInfo=new ApiInfo(
			"SPRING WITH SWAGGER API", 
		     "API CREATION", 
		     "1.0", 
		     "Free to Use", 
		     new Contact("Rahul Vikash","/api" ,"rahul.vikash@capgemini.com"),
		     "API licence",
		     "/api",
		     Collections.emptyList());
	return apiInfo;
}
}
