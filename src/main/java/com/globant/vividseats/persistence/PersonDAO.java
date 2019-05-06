package com.globant.vividseats.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.globant.vividseats.entities.Person;

@Repository
public abstract interface PersonDAO extends CrudRepository<Person, String> {

}
