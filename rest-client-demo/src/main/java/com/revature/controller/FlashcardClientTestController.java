package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.client.FlashcardClient;
import com.revature.model.Flashcard;

@RestController
public class FlashcardClientTestController {
	
	private FlashcardClient flashcardClient;
	
	@Autowired
	public void setFlashcardClient(FlashcardClient flashcardClient) {
		this.flashcardClient = flashcardClient;
	}
	
	@GetMapping(value="/testGetAllFlashcards")
	public ResponseEntity<List<Flashcard>> testGetAllFlashcards() {
		return new ResponseEntity<>(this.flashcardClient.getFlashcards(), HttpStatus.OK);
	}

}
