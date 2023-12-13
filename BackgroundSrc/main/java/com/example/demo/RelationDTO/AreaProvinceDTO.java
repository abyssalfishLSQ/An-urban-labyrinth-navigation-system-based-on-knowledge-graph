package com.example.demo.RelationDTO;

import com.example.demo.model.AreaEntity;
import com.example.demo.model.ProvinceEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class AreaProvinceDTO {
    private AreaEntity area;
    private ProvinceEntity province;
    public ProvinceEntity getProvince() {
        return province;
    }

    public void setProvince(ProvinceEntity province) {
        this.province = province;
    }

    public AreaEntity getArea() {
        return area;
    }

    public void setArea(AreaEntity area) {
        this.area = area;
    }
}
