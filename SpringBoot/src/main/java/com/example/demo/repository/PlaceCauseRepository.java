package com.example.demo.repository;

import com.example.demo.RelationDTO.PlaceCauseDTO;
import com.example.demo.RelationDTO.PlaceReasonDTO;
import com.example.demo.relations.lost_reason;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaceCauseRepository extends Neo4jRepository<lost_reason,Long> {
    @Query("MATCH (place:Place)-[r:lost_reason]->(cause:Cause)\n" +
            "RETURN place,cause")
    List<PlaceCauseDTO>findPCause();

    @Query("MATCH (place:Place)-[r:lost_reason]->(cause:Cause) WHERE toLower(place.PlaceName) CONTAINS :#{#PlaceName} \n" +
            "RETURN place,cause")
    List<PlaceCauseDTO>findPCauseName(@Param("PlaceName")String PlaceName);
}
