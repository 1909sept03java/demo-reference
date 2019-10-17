package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.StudySet;
import com.revature.service.StudySetService;

@RestController
@RequestMapping(value = "/study-set")
public class StudySetController {

	private StudySetService studySetService;

	@Autowired
	public void setStudySetService(StudySetService studySetService) {
		this.studySetService = studySetService;
	}
	
	@GetMapping(value="/all")
	public ResponseEntity<List<StudySet>> getAllStudySets() {
		return new ResponseEntity<>(this.studySetService.getAllStudySets(), HttpStatus.OK);
	}

}
