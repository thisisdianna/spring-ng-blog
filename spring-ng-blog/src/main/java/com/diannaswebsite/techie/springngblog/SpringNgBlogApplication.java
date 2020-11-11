package com.diannaswebsite.techie.springngblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

//@SpringBootApplication
public class SpringNgBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNgBlogApplication.class, args);
		System.out.println("hello");

	}
	

}
