package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.StudySet;

@Repository
@Transactional
public interface StudySetRepository extends JpaRepository<StudySet, Integer> {

	// declare a method using pattern matching to delete StudySets by author id 
	public List<StudySet> deleteByAuthorId(int authorId);
	
}
