package com.jeonguk.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.jeonguk")
@SpringBootApplication
public class SpringJpaQuerydslExmpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaQuerydslExmpleApplication.class, args);
	}

}