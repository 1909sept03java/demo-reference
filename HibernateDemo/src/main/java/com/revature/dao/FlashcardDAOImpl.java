package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.beans.Flashcard;
import com.revature.util.ConnectionUtil;

public class FlashcardDAOImpl implements FlashcardDAO {

	private SessionFactory sf = ConnectionUtil.getSessionFactory();

	@Override
	public Flashcard getById(int id) {
		Flashcard f = null;
		try (Session s = sf.openSession()) {
			f = s.get(Flashcard.class, id);
			System.out.println(s.getStatistics());
		}
		return f;
	}

	@Override
	public List<Flashcard> getAll() {
		List<Flashcard> flashcardList = new ArrayList<>();
		// use a Query
		try (Session s = sf.openSession()) {
			flashcardList = s.createQuery("from Flashcard").getResultList();
			System.out.println(s.getStatistics());
		}
		return flashcardList;
	}

	@Override
	public boolean addFlashcard(Flashcard flashcard) {
		boolean added = false;
		// try-with-resources on an AutoCloseable resource - closes at end of control
		// statement
		try (Session s = sf.openSession()) {
			// autocommit is OFF in Hibernate
			Transaction tx = s.beginTransaction();
			s.saveOrUpdate(flashcard);
			tx.commit();
			added = true;
			System.out.println(s.getStatistics());
		}
		return added;
	}

	@Override
	public boolean updateFlashcard(Flashcard flashcard) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFlashcard(Flashcard flashcard) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Flashcard> getByQuestion(String question) {
		// TODO Auto-generated method stub
		return null;
	}

}
