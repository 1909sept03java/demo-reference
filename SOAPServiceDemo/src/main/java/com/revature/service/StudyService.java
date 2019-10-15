package com.revature.service;

import java.util.List;

import javax.jws.WebService;

import com.revature.exception.StudyException;
import com.revature.model.Flashcard;

@WebService
public interface StudyService {
	
	List<Flashcard> getAllFlashcards();
	String addFlashcard(Flashcard flashcard) throws StudyException;

}
