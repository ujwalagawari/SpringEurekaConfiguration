package com.cg.configurationeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ConfigurationEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationEurekaApplication.class, args);
	}

}

