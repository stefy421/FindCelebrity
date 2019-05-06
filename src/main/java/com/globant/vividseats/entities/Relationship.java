package com.globant.vividseats.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Relationship {
	
	@Id	
	private Long id;
	@ManyToOne
	private Person person1;
	@ManyToOne
	private Person person2;
	private int acquaintance;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}	
	public Person getPerson1() {
		return person1;
	}
	public void setPerson1(Person person1) {
		this.person1 = person1;
	}
	public Person getPerson2() {
		return person2;
	}
	public void setPerson2(Person person2) {
		this.person2 = person2;
	}
	public int getAcquaintance() {
		return acquaintance;
	}
	public void setAcquaintance(int acquaintance) {
		this.acquaintance = acquaintance;
	}	
}
