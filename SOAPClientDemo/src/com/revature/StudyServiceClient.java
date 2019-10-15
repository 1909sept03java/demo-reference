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

	}

}
