package com.revature.service;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.StudySet;
import com.revature.model.User;
import com.revature.repository.StudySetRepository;

@Service
public class StudySetService {

	private StudySetRepository studySetRepository;

	@Autowired
	public void setStudySetRepository(StudySetRepository studySetRepository) {
		this.studySetRepository = studySetRepository;
	}

	@RabbitListener(queues = "deleteUserQueue")
	public void deleteStudySetsByUser(User toDelete) {
		List<StudySet> deleted = this.studySetRepository.deleteByAuthorId(toDelete.getId());
		for (StudySet ss : deleted) {
			System.out.println(ss);
		}
	}

	public List<StudySet> getAllStudySets() {
		return (this.studySetRepository.findAll());
	}

}
