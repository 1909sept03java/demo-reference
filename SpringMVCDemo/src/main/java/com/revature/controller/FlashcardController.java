package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.model.Flashcard;
import com.revature.service.FlashcardService;

@Controller
@RequestMapping(value="/flashcard")
public class FlashcardController {
	
	private FlashcardService flashcardService;
	
	@Autowired // setter injection
	public void setFlashcardService(FlashcardService flashcardService) {
		this.flashcardService = flashcardService;
	}
	
	@ResponseBody // tells Spring to skip ViewResolver
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<Flashcard>> getAll() {
		return new ResponseEntity<>(this.flashcardService.allFlashcards(), HttpStatus.OK);
	}

}
