package com.example.demo.model;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@Data
@NodeEntity(label ="TripMode")
public class TripMode {
    @Id
    @GeneratedValue
    private Long id;
    @Property("tripmodeId")
    private Integer tripmodeId;
    @Property("TripModeName")
    private String tripmodeName;
}
