package com.example.demo.relations;

import com.example.demo.model.PlaceEntity;
import com.example.demo.model.WeatherEntity;
import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

@Data
@RelationshipEntity(type="lost_weather")
@Builder
public class lost_weather {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private PlaceEntity place;
    @EndNode
    private WeatherEntity weather;

    private String relation;
    public String getRelation()
    {
        this.relation="lost_weather";
        return this.relation;
    }
}
