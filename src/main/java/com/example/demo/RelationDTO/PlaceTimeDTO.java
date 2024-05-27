package com.example.demo.RelationDTO;

import com.example.demo.model.PlaceEntity;
import com.example.demo.model.TimeEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class PlaceTimeDTO {
    private PlaceEntity place;
    private TimeEntity time;
    public PlaceEntity getPlace() {
        return place;
    }
    public void setPlace(PlaceEntity place) {
        this.place = place;
    }
    public TimeEntity getTime() {
        return time;
    }
    public void setTime(TimeEntity time) {
        this.time = time;
    }
}
