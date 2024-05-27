package com.example.demo.RelationDTO;

import com.example.demo.model.AreaEntity;
import com.example.demo.model.PlaceEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class PlaceAreaDTO {
    private PlaceEntity place;
    private AreaEntity area;

    public PlaceEntity getPlace() {
        return place;
    }

    public void setPlace(PlaceEntity place) {
        this.place = place;
    }

    public AreaEntity getArea() {
        return area;
    }

    public void setArea(AreaEntity area) {
        this.area = area;
    }
}
