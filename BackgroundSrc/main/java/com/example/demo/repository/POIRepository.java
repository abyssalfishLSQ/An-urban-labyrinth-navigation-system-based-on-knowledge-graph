package com.example.demo.repository;

import com.example.demo.model.POI;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface POIRepository extends Neo4jRepository<POI,Long> {
    @Query("MATCH (poi:POI)\n" +
            "WHERE toLower(poi.POIName) CONTAINS :#{#POIName}\n" +
            "RETURN poi")
    List<POI> findByPOIName(@Param("POIName") String POIName);
    @Query("MATCH (poi:POI)\n" +
            "RETURN poi")
    List<POI> findAllPOI();



}
