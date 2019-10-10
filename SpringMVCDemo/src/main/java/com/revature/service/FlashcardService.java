package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.model.Flashcard;
import com.revature.model.Topic;

@Service
public class FlashcardService {

	{
		Topic t1 = new Topic(1, "coding");
		Topic t2 = new Topic(4, "entomology");
		this.cardList = new ArrayList<Flashcard>();
		this.cardList.add(new Flashcard(2, "what is the answer to life, the universe, and everything?", "42", t1));
		this.cardList.add(new Flashcard(5, "what is Java?", "42", t1));
		this.cardList.add(new Flashcard(29, "how many kinds of spiders are there?", "42", t2));
		this.cardList.add(new Flashcard(34, "what does a Venus flytrap eat?", "42", t2));
	}

	private List<Flashcard> cardList;

	public List<Flashcard> allFlashcards() {
		return this.cardList;
	}

}
