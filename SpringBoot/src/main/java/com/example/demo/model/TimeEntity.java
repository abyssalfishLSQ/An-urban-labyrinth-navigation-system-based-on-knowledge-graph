package com.example.demo.model;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


/**
 * 时间实体
 * @since 2023.08.13
 */
@Data
@NodeEntity(label ="Time")
public class TimeEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Property("timeId")
    private Integer timeId;

    @Property("TimeName")
    private String timeName;

}
