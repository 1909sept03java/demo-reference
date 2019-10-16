package com.revature;

import java.util.List;

public class StudyServiceClient {

	public static void main(String[] args) {

		StudyServiceImplService ssis = new StudyServiceImplService();
		StudyService studyServiceProxy = ssis.getStudyServiceImplPort();

		List<Flashcard> allFlashcards = studyServiceProxy.getAllFlashcards();

		for (Flashcard f : allFlashcards) {
			System.out.println(f.getQuestion());
		}

		Flashcard f1 = new Flashcard();
		f1.setId(78);
		f1.setQuestion("Who invented Java?");
		f1.setAnswer("Sun Microsystems");
		f1.setTopic(new Topic());
		f1.getTopic().setId(9);
		f1.getTopic().setName("not coding");
		
		try {
			System.out.println(studyServiceProxy.addFlashcard(f1));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
