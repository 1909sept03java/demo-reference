package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.StudySet;

@Repository
public interface StudySetRepository extends JpaRepository<StudySet, Integer> {

	// declare a method using pattern matching to delete StudySets by author id 
	
}
