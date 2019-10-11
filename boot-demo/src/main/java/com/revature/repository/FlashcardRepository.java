package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Flashcard;
import com.revature.model.Topic;

@Repository
public interface FlashcardRepository extends JpaRepository<Flashcard, Integer> {

	// other choices for the repository - can extend CrudRepository (supertype of
	// JpaRepository) and PagingAndSortingRepository
	
	// method name pattern matching
	public List<Flashcard> getByTopic(Topic t);

}
