package com.example.demo.repository;

import com.example.demo.model.CityEntity;
import com.example.demo.model.PlaceEntity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CityRepository extends Neo4jRepository<CityEntity,Long> {
    @Query("MATCH (city:City)\n" +
            "WHERE toLower(city.CityName) CONTAINS :#{#CityName}\n" +
            "RETURN city\n")
    List<CityEntity> findByCityName(@Param("CityName")String CityName);

    /**
     * 查询所有city节点
     * @return
     */
    @Query("MATCH (city:City)\n" +
            "RETURN city")
    List<CityEntity> findAllCity();
    @Query("match(p:Place)-[:located_in]-(city:City)WHERE toLower(city.CityName) CONTAINS :#{#CityName} RETURN p")
    List<PlaceEntity> findPlaceByCityName(@Param("CityName")String CityName);
}
