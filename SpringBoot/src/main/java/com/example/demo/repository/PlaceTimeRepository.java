package com.example.demo.repository;

import com.example.demo.RelationDTO.PlaceTimeDTO;
import com.example.demo.relations.lost_time;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaceTimeRepository extends Neo4jRepository<lost_time,Long> {

    @Query("MATCH (place:Place)-[r:lost_time]->(time:Time)\n" +
            "RETURN place,time")
    List<PlaceTimeDTO> findPTime();
    @Query("MATCH (place:Place)-[r:lost_time]->(time:Time) WHERE toLower(place.PlaceName) CONTAINS :#{#PlaceName} \n" +
            "RETURN place,time")
    List<PlaceTimeDTO>findPTimeName(@Param("PlaceName")String PlaceName);
}
