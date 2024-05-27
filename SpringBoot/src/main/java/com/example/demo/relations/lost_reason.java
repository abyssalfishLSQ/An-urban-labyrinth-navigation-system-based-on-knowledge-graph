package com.example.demo.relations;

import com.example.demo.model.CauseEntity;
import com.example.demo.model.PlaceEntity;
import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

@Data
@RelationshipEntity(type="lost_reason")
@Builder
public class lost_reason {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private PlaceEntity place;
    @EndNode
    private CauseEntity cause;

    private String relation;
    public String getRelation()
    {
        this.relation="lost_reason";
        return this.relation;
    }
}
