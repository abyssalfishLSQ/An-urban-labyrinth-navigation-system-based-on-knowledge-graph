package com.example.demo.repository;

import com.example.demo.RelationDTO.PersonTripModeDTO;
import com.example.demo.relations.by;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface PersonTripModeRepository extends Neo4jRepository<by,Long> {

@Query("MATCH (person:Person)-[r:by]->(tripMode:TripMode)\n" +
        "RETURN person,tripMode")
    List<PersonTripModeDTO>findPTripMode();
}
