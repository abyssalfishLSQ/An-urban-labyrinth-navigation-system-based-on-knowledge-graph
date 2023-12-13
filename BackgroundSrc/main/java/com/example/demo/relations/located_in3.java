package com.example.demo.relations;

import com.example.demo.model.CityEntity;
import com.example.demo.model.ProvinceEntity;
import lombok.Builder;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

@Data
@RelationshipEntity(type="located_in")
@Builder
public class located_in3 {
    @Id
    @GeneratedValue
    private Long id;

    private String relation;
    @StartNode
    private CityEntity city;
    @EndNode
    private ProvinceEntity province;
    public String getRelation()
    {
        this.relation="located_in";
        return this.relation;
    }
}
