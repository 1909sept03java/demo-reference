package com.revature;

import com.revature.beans.Flashcard;
import com.revature.beans.Topic;
import com.revature.dao.FlashcardDAO;
import com.revature.dao.FlashcardDAOImpl;

public class Driver {

	public static void main(String[] args) {
		// System.out.println(ConnectionUtil.getSessionFactory());
		// SessionFactory sf = ConnectionUtil.getSessionFactory();
		// Session s = sf.openSession();
		// System.out.println(s.getStatistics());
		// s.close();
		FlashcardDAO fd = new FlashcardDAOImpl();
	//	fd.addFlashcard(new Flashcard("what else is Java?", "a programming language", new Topic(1, "coding")));
		for (Flashcard f : fd.getAll()) {
			System.out.println(f);
		}
		// System.out.println(fd.getById(2));
		// all of these Flashcards are now detached - they are no longer associated with
		// an open session
	}

}
