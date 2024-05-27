package com.example.demo.model;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


/**
 * 原因实体
 */
@Data
@NodeEntity(label ="Cause")
public class CauseEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Property("causeId")
    private Integer causeId;

    @Property("CauseName")
    private String causeName;//具体原因
}
