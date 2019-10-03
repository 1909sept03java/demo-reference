package com.revature;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.revature.beans.Flashcard;
import com.revature.beans.StudySet;
import com.revature.beans.Topic;
import com.revature.util.ConnectionUtil;

public class Driver {

	public static void main(String[] args) {
		// System.out.println(ConnectionUtil.getSessionFactory());
		SessionFactory sf = ConnectionUtil.getSessionFactory();
		// Session s = sf.openSession();
		// System.out.println(s.getStatistics());
		// s.close();
		// FlashcardDAO fd = new FlashcardDAOImpl();
		// fd.addFlashcard(new Flashcard("what else is Java?", "a programming language",
		// new Topic(1, "coding")));
		/*
		 * for (Flashcard f : fd.getAll()) { System.out.println(f); }
		 */
		// System.out.println(fd.getById(2));
		// all of these Flashcards are now detached - they are no longer associated with
		// an open session

		// setup();
		// funWithGetAndLoad(sf);
		//funWithSaveAndPersist(sf);
		funWithUpdateAndMerge(sf);
	}
	
	public static void funWithUpdateAndMerge(SessionFactory sf) {
		Session s1 = sf.openSession();
		Transaction tx1 = s1.beginTransaction();
		
		// transient Flashcard with a real PK
		// "detached", sort of
		Flashcard f1 = new Flashcard(23, "what else is Java?", "A place", new Topic(1, "coding"));
		s1.update(f1);
		
		// try to update Flashcard f1 again (it's now persistent)
		Flashcard f2 = new Flashcard(23, "what else is Java?", "an acronym for Just A Valid Answer", new Topic(1, "coding"));
		// s1.update(f2); //NonUniqueObjectException
		
		// try to update a fake Flashcard
		Flashcard f3 = new Flashcard(323, "", "", null);
		// s1.update(f3); //StaleObjectStateException
		
		// merge: will check whether a persistent version exists, then copy over values onto persistent obj
		s1.merge(f2);
		
		tx1.commit();
		s1.close();
	}
	
	public static void funWithSaveAndPersist(SessionFactory sf) {
		
		Session s1 = sf.openSession();
		Transaction tx1 = s1.beginTransaction();
		
		// immediately get generated id with save()
		int newId = (int) s1.save(new Topic("botany"));
		System.out.println(newId);
		
		// just persist the object
		Topic t = new Topic("zoology"); // t is transient
		s1.persist(t);
		
		// t is now persistent
		// automatic dirty checking will cause changes to t to be updated in the db
		t.setName("linguistics");
		
		System.out.println(t);
		
		tx1.commit();
		s1.close();
		
		// t is now detached
		
		// open another session
		Session s2 = sf.openSession();
		Transaction tx2 = s2.beginTransaction();
		
		// try to re-save t
		s2.save(t);
		// will create a new record with different persistent identity
		
		// try to persist t
		// ignores id value already in t, persists new object
		s2.persist(t);
		
		tx2.commit();
		s2.close();
		
		System.out.println(t);
		
	}

	public static void funWithGetAndLoad(SessionFactory sf) {

		Session s = sf.openSession();

		// get a Flashcard we know that we have
		Flashcard f = s.get(Flashcard.class, 23);
		System.out.println(f);

		// get a Flashcard we know that we don't have (return null)
		Flashcard f2 = s.get(Flashcard.class, 323);
		System.out.println(f2);

		// load a Flashcard we know that we have
		Flashcard f3 = s.load(Flashcard.class, 21);
		// System.out.println(f3); // forcing lazily fetched object to be retrieved by accessing it

		// get a Flashcard we know that we don't have (ObjectNotFoundException)
		// Flashcard f4 = s.load(Flashcard.class, 323);
		// System.out.println(f4);
		s.close();
		
		// can I access f3?
		// not if we haven't yet accessed it and we're outside of a session
		// LazyInitializationException ("can't initialize proxy")
		System.out.println(f3);
		
		//fine to access f, f2 - eagerly fetched
	}

	public static void setup() {
		// populate StudySet
		int studySetId1 = 0;
		int studySetId2 = 0;
		SessionFactory sf = ConnectionUtil.getSessionFactory();
		try (Session s = sf.openSession()) {
			Transaction tx = s.beginTransaction();
			studySetId1 = (int) s.save(new StudySet("StudySet1"));
			studySetId2 = (int) s.save(new StudySet("StudySet2"));
			s.get(StudySet.class, studySetId1).getFlashcards().add(new Flashcard(23, "", "", null));
			tx.commit();
		}
	}

}
