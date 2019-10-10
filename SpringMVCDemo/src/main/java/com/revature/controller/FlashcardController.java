package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.model.Flashcard;
import com.revature.service.FlashcardService;

@Controller
@RequestMapping(value = "/flashcard")
public class FlashcardController {

	private FlashcardService flashcardService;

	@Autowired // setter injection
	public void setFlashcardService(FlashcardService flashcardService) {
		this.flashcardService = flashcardService;
	}

	@ResponseBody // tells Spring to skip ViewResolver
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Flashcard>> getAll() {
		return new ResponseEntity<>(this.flashcardService.allFlashcards(), HttpStatus.OK);
	}

	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET) // parameterize the path
	public ResponseEntity<Flashcard> getFlashcardById(@PathVariable int id) {
		Flashcard f = this.flashcardService.getFlashcardById(id);
		if (f == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(f, HttpStatus.OK);
		}
	}
	
	// what if we want to use a query string instead?
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Flashcard> getFlashcardByIdWithQueryString(@RequestParam int id) {
		Flashcard f = this.flashcardService.getFlashcardById(id);
		if (f == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(f, HttpStatus.OK);
		}
	}
	
	// @RequestBody indicates that request body should be formatted so that it is 
	// convertible to a Java object of specified type (uses Jackson if following default
	// pattern and expecting JSON data from request)
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<String> addFlashcard(@RequestBody Flashcard flashcard) {
		ResponseEntity<String> resp = null;
			try {
				this.flashcardService.addFlashcard(flashcard);
				resp = new ResponseEntity<>("FLASHCARD CREATED SUCCESSFULLY", HttpStatus.OK);
			} catch(Exception e) {
				e.printStackTrace();
				resp = new ResponseEntity<>("FAILED TO CREATE FLASHCARD", HttpStatus.BAD_REQUEST);
			}
		return resp;
	}
	

}
