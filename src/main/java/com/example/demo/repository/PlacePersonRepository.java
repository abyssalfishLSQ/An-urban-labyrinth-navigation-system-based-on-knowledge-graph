package com.example.demo.repository;

import com.example.demo.RelationDTO.PlacePersonDTO;
import com.example.demo.relations.lost_person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlacePersonRepository extends Neo4jRepository<lost_person,Long> {

    @Query("MATCH (place:Place)-[r:lost_person]->(person:Person)\n" +
            "RETURN place, person")
    List<PlacePersonDTO>findPPerson();

    @Query("MATCH (place:Place)-[r:lost_person]->(person:Person) WHERE toLower(place.PlaceName) CONTAINS :#{#PlaceName} \n" +
            "RETURN place, person")
    List<PlacePersonDTO>findPPersonName(@Param("PlaceName")String PlaceName);

}
