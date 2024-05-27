package com.example.demo.model;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@Data
@NodeEntity(label ="Province")
public class ProvinceEntity {
    @Id
    @GeneratedValue
    private Long id;

    //对应文本
    @Property("provinceId")
    private Integer provinceId;

    @Property("ProvinceName")
    private String provinceName;

}
