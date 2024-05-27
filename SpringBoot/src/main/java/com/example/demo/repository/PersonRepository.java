package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends Neo4jRepository<Person,Long> {
    @Query("MATCH (person:Person)\n" +
            "WHERE toLower(person.PersonName) CONTAINS :#{#PersonName} return person")
    List<Person> findByPersonName(@Param("PersonName")String PersonName);
    @Query("MATCH (person:Person)\n" +
            "RETURN person")
    List<Person> findAllPerson();

}
