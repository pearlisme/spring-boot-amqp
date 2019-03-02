package com.pearl.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootAmqpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAmqpApplication.class, args);
//		SpringApplication.run(SpringBootAmqpApplication.class, args).close();
	}


	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){


		return args -> {
			final String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanDefinitionNames);
			for (String beanDefinitionName : beanDefinitionNames) {
//				System.out.println(beanDefinitionName);
			}
		};
	}
}
