package com.lucasantos.graphqlapp.repository;

import com.lucasantos.graphqlapp.model.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    
}
