package com.example.demo.repository;

import com.example.demo.model.PlaceEntity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceRepository extends Neo4jRepository<PlaceEntity, Long> {

    @Query("MATCH (place:Place)\n" +
            "WHERE toLower(place.PlaceName) CONTAINS :#{#PlaceName}\n" +
            "RETURN place")
    List<PlaceEntity> findByPlaceName(@Param("PlaceName") String PlaceName);

    @Query("MATCH (place:Place)\n" +
            "RETURN place")
    List<PlaceEntity> findAllPlace();



}
