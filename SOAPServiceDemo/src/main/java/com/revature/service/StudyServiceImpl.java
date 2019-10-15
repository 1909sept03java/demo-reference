package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.revature.exception.StudyException;
import com.revature.model.Flashcard;
import com.revature.model.Topic;

@WebService(endpointInterface="com.revature.service.StudyService")
public class StudyServiceImpl implements StudyService {
	
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

	@Override
	public List<Flashcard> getAllFlashcards() {
		return this.cardList;
	}

	@Override
	public String addFlashcard(Flashcard flashcard) throws StudyException {
		if (flashcard.getTopic().getName().equals("not coding")) {
			throw new StudyException("Cannot add flashcard, must be about about coding");
		}
		this.cardList.add(flashcard);
		return "successfully added flashcard";
	}

}
