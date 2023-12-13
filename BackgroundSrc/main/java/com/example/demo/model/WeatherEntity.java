package com.example.demo.model;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


/**
 * 天气实体

 */
@Data
@NodeEntity(label ="Weather")
public class WeatherEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Property("weatherId")
    private Integer weatherId;

    @Property("WeatherName")
    private String weatherName;

}
