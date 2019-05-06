package com.globant.vividseats.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.globant.vividseats.entities.Relationship;

@Repository
public abstract interface RelationshipDAO extends CrudRepository<Relationship, Long>{

}
