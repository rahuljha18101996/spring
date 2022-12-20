package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* Maven:
* Maven is the build tool which will help you to get dependency.
* */

/*
* @SpringBootApplication
* @EnableAutoConfiguration : Automatically configure the Jar Dependencies added in Pom.xml
* @ComponentScan : Scan Your bean in the IoC Container
* @Configuration : For Java base configuration where we define bean so that IoC can load it.
 * */

/*
* Stereotype Annotation
* Used to create spring bean automatically in the application
* @Component
* Below three are derived from @Component
* @Service - Business Logic
* @RestController/@Controller
* @Repository
* */
@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
