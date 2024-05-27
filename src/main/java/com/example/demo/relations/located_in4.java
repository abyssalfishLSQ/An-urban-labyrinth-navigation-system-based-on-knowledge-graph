package com.example.demo.relations;

import com.example.demo.model.AreaEntity;
import com.example.demo.model.CityEntity;
import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

@Data
@RelationshipEntity(type="located_in")
@Builder
public class located_in4 {
    @Id
    @GeneratedValue
    private Long id;

    private String relation;
    @StartNode
    private AreaEntity area;
    @EndNode
    private CityEntity city;
    public String getRelation()
    {
        this.relation="located_in";
        return this.relation;
    }
}
