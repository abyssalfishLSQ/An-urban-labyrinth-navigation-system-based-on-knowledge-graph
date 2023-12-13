package com.example.demo.repository;

import com.example.demo.model.TripMode;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TripModeRepository extends Neo4jRepository<TripMode,Long> {
    @Query("MATCH (tripmode:TripMode)\n" +
            "WHERE toLower(tripmode.TripModeName) CONTAINS :#{#TripModeName}\n" +
            "RETURN tripmode")
    List<TripMode> findByTripModeName(@Param("TripModeName") String TripModeName);
    @Query("MATCH (tripmode:TripMode)\n" +
            "RETURN tripmode")
    List<TripMode> findAllTripMode();


}
