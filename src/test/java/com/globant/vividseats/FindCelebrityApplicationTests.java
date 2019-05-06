package com.globant.vividseats;

import static org.mockito.Mockito.when;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.globant.vividseats.entities.Person;
import com.globant.vividseats.entities.Relationship;
import com.globant.vividseats.persistence.PersonDAO;
import com.globant.vividseats.persistence.RelationshipDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FindCelebrityApplicationTests {

	@InjectMocks
	FindCelebrity findCelebrity;
	@Autowired
	PersonDAO personRepository;
	@Autowired
	RelationshipDAO relationshipRepository;
	@Mock
	PersonDAO personDAO;
	@Mock
	RelationshipDAO relationshipDAO;
	@Mock
	Iterable<Person> personList;
	@Mock
	Iterable<Relationship> relationshipList;
		
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		when(personDAO.findAll()).thenReturn(personRepository.findAll());
		when(relationshipDAO.findAll()).thenReturn(relationshipRepository.findAll());
	}
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void foundCelebrity() {
		String celebrity = findCelebrity.findCelebrity();
		Assertions.assertThat(celebrity).isNotSameAs("There's not any celebrity");
	}
	
}
