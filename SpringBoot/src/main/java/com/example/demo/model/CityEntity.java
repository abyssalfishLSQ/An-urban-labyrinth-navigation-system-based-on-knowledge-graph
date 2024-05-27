package com.example.demo.model;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@Data
@NodeEntity(label ="City")
public class CityEntity  {
    @Id
    @GeneratedValue
    private Long id;
    @Property("cityId")
    private Integer cityId;
    @Property("CityName")
    private String cityName;

}