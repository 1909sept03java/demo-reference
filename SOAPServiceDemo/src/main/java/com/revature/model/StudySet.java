package com.revature.model;

import java.util.ArrayList;
import java.util.List;

public class StudySet {
	
	public StudySet(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public StudySet(String description) {
		super();
		this.description = description;
	}
	public StudySet() {
		super();
	}
	private int id;
	private String description;
	private List<Flashcard> flashcards = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Flashcard> getFlashcards() {
		return flashcards;
	}
	public void setFlashcards(List<Flashcard> flashcards) {
		this.flashcards = flashcards;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((flashcards == null) ? 0 : flashcards.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudySet other = (StudySet) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (flashcards == null) {
			if (other.flashcards != null)
				return false;
		} else if (!flashcards.equals(other.flashcards))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "StudySet [id=" + id + ", description=" + description + ", flashcards=" + flashcards + "]";
	}

}
