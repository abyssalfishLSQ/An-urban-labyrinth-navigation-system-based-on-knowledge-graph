package com.example.demo.repository;

import com.example.demo.RelationDTO.PlacePOIDTO;
import com.example.demo.relations.lost_POI;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlacePOIRepository extends Neo4jRepository<lost_POI,Long> {
    @Query("MATCH (place:Place)-[r:lost_POI]->(poi:POI)\n" +
            "RETURN place,poi")
    List<PlacePOIDTO>findPPOI();
    @Query("MATCH (place:Place)-[r:lost_POI]->(poi:POI) WHERE toLower(place.PlaceName) CONTAINS :#{#PlaceName} \n" +
            "RETURN place, poi")
    List<PlacePOIDTO>findPPOIName(@Param("PlaceName")String PlaceName);
}
