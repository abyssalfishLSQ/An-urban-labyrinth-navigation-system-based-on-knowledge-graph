package com.example.demo.model;


import lombok.Data;
import org.neo4j.ogm.annotation.*;


@Data
@NodeEntity(label ="Place")
public class PlaceEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Property("placeId")
    private Integer placeId;

    @Property("PlaceName")
    private String placeName;

}
