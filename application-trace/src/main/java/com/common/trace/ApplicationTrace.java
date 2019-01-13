package com.common.trace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class ApplicationTrace {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationTrace.class, args);
	}

}

