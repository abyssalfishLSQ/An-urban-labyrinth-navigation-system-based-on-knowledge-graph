package com.example.demo.relations;

import com.example.demo.model.Person;
import com.example.demo.model.PlaceEntity;
import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

@Data
@RelationshipEntity(type="lost_person")
@Builder
public class lost_person {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private PlaceEntity place;
    @EndNode
    private Person person;

    private String relation;
    public String getRelation()
    {
        this.relation="lost_person";
        return this.relation;
    }
}
