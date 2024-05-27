package com.example.demo.relations;

import com.example.demo.model.POI;
import com.example.demo.model.PlaceEntity;
import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

@Data
@RelationshipEntity(type="lost_POI")
@Builder
public class lost_POI {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private PlaceEntity place;

    @EndNode
    private POI poi;
    private String relation;
    public String getRelation()
    {
        this.relation="lost_POI";
        return this.relation;
    }
}
