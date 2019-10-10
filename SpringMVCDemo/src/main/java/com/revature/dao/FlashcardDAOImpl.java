package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.model.Flashcard;

@Repository(value="flashcardDAO")
public class FlashcardDAOImpl implements FlashcardDAO {
	
	private SessionFactory sessionFactory;
	
	@Autowired // constructor injection
	public FlashcardDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Flashcard> allFlashcards() {
		Session s = sessionFactory.openSession();
		List<Flashcard> cards = s.createQuery("from Flashcard").getResultList();
		s.close();
		return cards;
	}

	@Override
	public Flashcard getFlashcardById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createFlashcard(Flashcard flashcard) {
		// TODO Auto-generated method stub
		
	}
	
	

}
