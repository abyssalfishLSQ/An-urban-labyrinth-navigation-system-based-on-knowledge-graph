package com.example.demo.relations;

import com.example.demo.model.PlaceEntity;
import com.example.demo.model.TimeEntity;
import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

@Data
@RelationshipEntity(type="lost_time")
@Builder
public class lost_time {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private PlaceEntity place;
    @EndNode
    private TimeEntity time;

    private String relation;
    public String getRelation()
    {
        this.relation="located_in";
        return this.relation;
    }
}
