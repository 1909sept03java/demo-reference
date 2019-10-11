package com.revature.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.revature.model.Flashcard;

@Component
public class FlashcardClient {

	private RestTemplate restTemplate;
	private String resourceUrl = "http://localhost:8083/flashcard";

	// RestTemplateBuilder is already a bean. Thanks, Spring Boot!
	@Autowired
	public void setRestTemplate(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	// consume RESTful web service being exposed by boot-demo
	// this method retrieves all flashcards
	public List<Flashcard> getFlashcards() {
		ResponseEntity<List<Flashcard>> response = this.restTemplate.exchange(this.resourceUrl + "/all", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Flashcard>>() {
				});
		return response.getBody();
	}

}
