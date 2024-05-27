package com.example.demo.repository;

import com.example.demo.RelationDTO.PlaceWeatherDTO;
import com.example.demo.relations.lost_weather;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaceWeatherRepository extends Neo4jRepository<lost_weather,Long> {
    // 查询Place和Weather之间的关系
    @Query("MATCH (place:Place)-[r:lost_weather]->(weather:Weather)\n" +
            "RETURN place, weather")
    List<PlaceWeatherDTO> findPWeather();

    @Query("MATCH (place:Place)-[r:lost_weather]->(weather:Weather) WHERE toLower(place.PlaceName) CONTAINS :#{#PlaceName} \n" +
            "RETURN place, weather")
    List<PlaceWeatherDTO>findPWeatherName(@Param("PlaceName")String PlaceName);
    //在无条件下，展示所有关系或组合关系，比如located_in,by,lost_time,lost_weather的展示
    //已知place，查找于该地点相连的所有关系，或者与place的关系单个和多的的组合
    //已知和place相连的某个节点，比如time、weather、cause，查找该结点（一个）相连的所有place
    //已知place和weather，查找和特定place相关的
}
