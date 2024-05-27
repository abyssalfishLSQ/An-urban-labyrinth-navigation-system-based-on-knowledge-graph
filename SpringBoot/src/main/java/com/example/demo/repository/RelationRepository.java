package com.example.demo.repository;

import com.example.demo.RelationDTO.*;
import com.example.demo.relations.located_in;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RelationRepository extends Neo4jRepository<located_in,Long> {
    //无参
    @Query("MATCH (place)-[r:located_in]->(area) RETURN place, area")
    List<PlaceAreaDTO> findPArea();
    @Query("MATCH (place)-[r:located_in]->(city) RETURN place, city")
    List<PlaceCityDTO> findPCity();
    @Query("MATCH (place)-[r:located_in]->(province) RETURN place, province")
    List<PlaceProvinceDTO> findPProvince();
    @Query("MATCH (area)-[r:located_in]->(city) RETURN area, city")
    List<AreaCityDTO> findACity();
    @Query("MATCH (city)-[r:located_in]->(province) RETURN city, province")
    List<CityProvinceDTO> findCProvince();
    @Query("MATCH (area)-[r:located_in]->(province) RETURN area, province")
    List<AreaProvinceDTO> findAProvince();

    //有参
    @Query("MATCH (place:Place)-[r:located_in]->(area:Area) WHERE toLower(place.PlaceName) CONTAINS :#{#PlaceName} \n" +
            "RETURN place, area")
    List<PlaceAreaDTO>findPAreaName(@Param("PlaceName")String PlaceName);
    @Query("MATCH (place:Place)-[r:located_in]->(city:City) WHERE toLower(place.PlaceName) CONTAINS :#{#PlaceName} \n" +
            "RETURN place, city")
    List<PlaceCityDTO>findPCityName(@Param("PlaceName")String PlaceName);
    @Query("MATCH (place:Place)-[r:located_in]->(province:Province) WHERE toLower(place.PlaceName) CONTAINS :#{#PlaceName} \n" +
            "RETURN place,province")
    List<PlaceProvinceDTO>findPProvinceName(@Param("PlaceName")String PlaceName);

}
