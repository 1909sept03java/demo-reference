package com.revature.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.model.Flashcard;
import com.revature.model.Topic;

@Controller
@RequestMapping(value="/flashcard")
public class FlashcardController {
	
	private List<Flashcard> cardList = new ArrayList<Flashcard>();
	
	@ResponseBody // tells Spring to skip ViewResolver
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<Flashcard>> getAll() {
		this.cardList.add(new Flashcard("what is the answer to life, the universe, and everything?","42", new Topic("coding")));
		return new ResponseEntity<>(this.cardList, HttpStatus.OK);
	}

}
