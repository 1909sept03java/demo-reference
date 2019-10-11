package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Flashcard;
import com.revature.model.Topic;
import com.revature.repository.FlashcardRepository;

@Service
public class FlashcardService {

	private FlashcardRepository flashcardRepository;

	@Autowired
	public FlashcardService(FlashcardRepository flashcardRepository) {
		this.flashcardRepository = flashcardRepository;
	}

	public List<Flashcard> allFlashcards() {
		return this.flashcardRepository.findAll();
	}

	public Flashcard getFlashcardById(int id) {
		return this.flashcardRepository.findById(id).orElse(null);
	}

	public void addFlashcard(Flashcard f) {
		this.flashcardRepository.save(f);
	}

	public List<Flashcard> flashcardsByTopic(Topic t) {
		return this.flashcardRepository.getByTopic(t);
	}
}
