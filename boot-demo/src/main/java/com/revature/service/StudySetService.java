package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.StudySet;
import com.revature.repository.StudySetRepository;

@Service
public class StudySetService {
	
	private StudySetRepository studySetRepository;
	
	@Autowired
	public void setStudySetRepository(StudySetRepository studySetRepository) {
		this.studySetRepository = studySetRepository;
	}
	
	public List<StudySet> getAllStudySets() {
		return(this.studySetRepository.findAll());
	}

}
