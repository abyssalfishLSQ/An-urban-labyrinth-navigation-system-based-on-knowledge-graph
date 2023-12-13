package com.example.demo.RelationDTO;

import com.example.demo.model.POI;
import com.example.demo.model.PlaceEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class PlacePOIDTO {
    private PlaceEntity place;
    private POI poi;

    public PlaceEntity getPlace() {
        return place;
    }
    public void setPlace(PlaceEntity place) {
        this.place = place;
    }
    public POI getPoi() {
        return poi;
    }
    public void setPoi(POI poi) {
        this.poi = poi;
    }
}
