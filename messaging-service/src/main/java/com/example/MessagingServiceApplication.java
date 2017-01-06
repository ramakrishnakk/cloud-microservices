package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class MessagingServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MessagingServiceApplication.class, args);
	}
}

@RefreshScope
@RestController
class MessagingController{
	
	
	@Value("${message}")
	String message;
	
	@RequestMapping("/message") 
	String getMessage(){
		return this.message;
	}
	
	
}

	
