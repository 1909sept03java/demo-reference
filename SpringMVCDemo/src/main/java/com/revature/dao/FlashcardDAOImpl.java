package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
		Session s = sessionFactory.openSession();
		Flashcard f = s.get(Flashcard.class, id);
		s.close();
		return f;
	}

	@Transactional
	@Override
	public void createFlashcard(Flashcard flashcard) {
		flashcard.setId(0);
		Session s = sessionFactory.getCurrentSession();
		s.save(flashcard);
	}
	
	

}
