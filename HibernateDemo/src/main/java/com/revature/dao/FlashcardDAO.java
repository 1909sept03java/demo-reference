package com.revature.dao;

import java.util.List;

import com.revature.beans.Flashcard;

public interface FlashcardDAO {
	
	public Flashcard getById(int id);
	public List<Flashcard> getByQuestion(String question);
	public List<Flashcard> getAll();
	public boolean addFlashcard(Flashcard flashcard);
	public boolean updateFlashcard(Flashcard flashcard);
	public boolean deleteFlashcard(Flashcard flashcard);
	
}
