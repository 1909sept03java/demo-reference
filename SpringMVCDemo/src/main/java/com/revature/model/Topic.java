package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TOPIC")
public class Topic {
	
	public Topic() {
		super();
	}
	public Topic(String name) {
		super();
		this.name = name;
	}
	public Topic(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Id // indicates that this is the primary key! ("persistent identity" of a Topic)
	// generate values for this PK
	@GeneratedValue(strategy=GenerationType.AUTO, generator="topicSequence")
	@SequenceGenerator(allocationSize=1, name="topicSequence", sequenceName="SQ_TOPIC_PK")
	@Column(name="TOPIC_ID")
	private int id;
	@Column(name="NAME")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Topic [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Topic other = (Topic) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
