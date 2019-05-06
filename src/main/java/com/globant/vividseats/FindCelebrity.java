package com.globant.vividseats;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.globant.vividseats.entities.Person;
import com.globant.vividseats.entities.Relationship;
import com.globant.vividseats.persistence.PersonDAO;
import com.globant.vividseats.persistence.RelationshipDAO;

public class FindCelebrity {

	@Autowired
	private PersonDAO personDAO;
	@Autowired
	private RelationshipDAO relationshipDAO;
	private List<Person> personList;
	private List<Relationship> relationshipList;

	private void settingUp() {
		personList = new ArrayList<Person>();
		personDAO.findAll().forEach(personList::add);
		relationshipList = new ArrayList<Relationship>();
		relationshipDAO.findAll().forEach(relationshipList::add);
	}

	public String findCelebrity() {
		settingUp();
		Person person = personList.get(0);
		String celebrity = "There's not any celebrity";

		for (Person candidate : personList) {
			if (isAcquaintance(person, candidate)) {
				person = candidate;
				celebrity = person.getName();
			}
		}
		
		for (Person candidate : personList) {
			if(person.getId()!=candidate.getId() && (isAcquaintance(person,candidate) || !isAcquaintance(candidate, person))) {
				return "There's not any celebrity";
			}
		}
		
		return celebrity;
	}

	private boolean isAcquaintance(Person person, Person candidate) {
		Relationship relationship = relationshipList.stream()
				.filter(relation -> relation.getPerson1().getId() == person.getId()
						&& relation.getPerson2().getId() == candidate.getId())
				.findAny().orElse(new Relationship());
		return (relationship.getAcquaintance() == 0 ? false : true);
	}
}
