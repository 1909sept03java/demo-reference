package com.revature.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FLASHCARD")
public class Flashcard {
	
	public Flashcard() {
		super();
	}
	public Flashcard(String question, String answer, Topic topic) {
		super();
		this.question = question;
		this.answer = answer;
		this.topic = topic;
	}
	public Flashcard(int id, String question, String answer, Topic topic) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.topic = topic;
	}
	
	@Id // indicates that this is the primary key! ("persistent identity" of a Flashcard)
	// generate values for this PK
	@GeneratedValue(strategy=GenerationType.AUTO, generator="flashcardSequence")
	@SequenceGenerator(allocationSize=1, name="flashcardSequence", sequenceName="SQ_FLASHCARD_PK")
	@Column(name="FLASHCARD_ID")
	private int id;
	// don't strictly need these unless you want to customize your column definitions
	@Column(name="QUESTION")
	private String question;
	@Column(name="ANSWER")
	private String answer;
	// establish a foreign key from Flashcard to Topic
	// Topic has to be a correctly mapped entity for this to work
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	@JoinColumn(name="TOPIC_ID")
	private Topic topic;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + id;
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
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
		Flashcard other = (Flashcard) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (id != other.id)
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Flashcard [id=" + id + ", question=" + question + ", answer=" + answer + ", topic=" + topic + "]";
	}
}