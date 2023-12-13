package com.example.demo.model;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@Data
@NodeEntity(label ="Area")//区 表中的名字
public class AreaEntity {

    @Id
    @GeneratedValue
    private Long id;//在区表中的节点id

    //对应文本
    @Property("areaId")
    private Integer areaId;
    @Property("AreaName")
    private String areaName;

}
