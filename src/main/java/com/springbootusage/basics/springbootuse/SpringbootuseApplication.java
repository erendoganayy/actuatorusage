package com.springbootusage.basics.springbootuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootuseApplication {

	public static void main(String[] args) {


		ApplicationContext applicationContext=
				SpringApplication.run(SpringbootuseApplication.class, args);
		for (String name:
			 applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
