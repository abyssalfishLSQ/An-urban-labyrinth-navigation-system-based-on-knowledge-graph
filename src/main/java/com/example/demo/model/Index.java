package com.example.demo.model;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@Data
@NodeEntity(label ="Index")
public class Index {
    @Id
    @GeneratedValue
    private Long id;
    @Property("indexId")
    private Integer indexId;

    @Property("IndexName")
    private String indexName;
}
