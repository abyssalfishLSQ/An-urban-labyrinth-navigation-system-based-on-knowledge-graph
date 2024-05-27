package com.example.demo.repository;

import com.example.demo.model.AreaEntity;
import com.example.demo.model.PlaceEntity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AreaRepository extends Neo4jRepository<AreaEntity,Long> {
    @Query("MATCH (area:Area)\n" +
            "WHERE toLower(area.AreaName) CONTAINS :#{#AreaName}\n" +
            "RETURN area")
    List<AreaEntity> findByAreaName(@Param("AreaName") String AreaName);

    @Query("MATCH (area:Area)\n" +
            "RETURN area ")
    List<AreaEntity> findAllArea();
}
