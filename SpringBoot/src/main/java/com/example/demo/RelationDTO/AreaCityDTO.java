package com.example.demo.RelationDTO;

import com.example.demo.model.AreaEntity;
import com.example.demo.model.CityEntity;
import com.example.demo.model.PlaceEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class AreaCityDTO {
    private AreaEntity area;
    private CityEntity city;
    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }

    public AreaEntity getArea() {
        return area;
    }

    public void setArea(AreaEntity area) {
        this.area = area;
    }
}
