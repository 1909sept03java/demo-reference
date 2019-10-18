package com.revature;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlashcardUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashcardUserServiceApplication.class, args);
	}
	
	@Bean
	public Queue flashcardAppQueue() {
		return new Queue("flashcardAppQueue", false);
	}
	
	@Bean
	public Queue deleteUserQueue() {
		return new Queue("deleteUserQueue", false);
	}

}
