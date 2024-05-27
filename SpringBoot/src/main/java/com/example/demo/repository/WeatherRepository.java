package com.example.demo.repository;

import com.example.demo.model.WeatherEntity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WeatherRepository extends Neo4jRepository<WeatherEntity,Long> {
    /**
     * 根据地点ID查找地点
     * @param  weatherId
     * @return 地点
     */
    @Query("MATCH (n) WHERE n.weatherId = :#{#weatherId} return n")
    WeatherEntity findByWeatherEntityId(Integer weatherId);

    /**
     * 根据天气名称查找天气
     * @param WeatherName
     * @return 天气
     */
    @Query("MATCH (weather:Weather)\n" +
            "WHERE toLower(weather.WeatherName) CONTAINS :#{#WeatherName}\n" +
            "RETURN weather")
    List<WeatherEntity> findByWeatherName(@Param("WeatherName") String WeatherName);
    @Query("MATCH (weather:Weather)\n" +
            "RETURN weather")
    List<WeatherEntity> findAllWeather();
}
