package com.cg.configurationwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigurationWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationWebsiteApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate gettemplate() {
		return new RestTemplate();
	}

}

