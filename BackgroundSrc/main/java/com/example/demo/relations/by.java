package com.example.demo.relations;


import com.example.demo.model.Person;
import com.example.demo.model.TripMode;
import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

@Data
@RelationshipEntity(type="by")
@Builder
public class by {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private Person person;

    @EndNode
    private TripMode tripMode;

    private String relation;
    public String getRelation()
    {
        this.relation="by";
        return this.relation;
    }
}
