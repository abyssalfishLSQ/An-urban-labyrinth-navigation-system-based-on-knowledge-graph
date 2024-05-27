package com.example.demo.model;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@Data
@NodeEntity(label ="POI")
public class POI {
    @Id
    @GeneratedValue
    private Long id;
    @Property("poiId")
    private Integer poiId;

    @Property("POIName")
    private String poiName;
}
