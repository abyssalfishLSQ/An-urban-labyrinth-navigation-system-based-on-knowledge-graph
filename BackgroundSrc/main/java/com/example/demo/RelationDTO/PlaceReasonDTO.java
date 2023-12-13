package com.example.demo.RelationDTO;

import com.example.demo.model.CauseEntity;
import com.example.demo.model.PlaceEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class PlaceReasonDTO {
    private PlaceEntity place;
    public CauseEntity cause;
    public PlaceEntity getPlace() {
        return place;
    }
    public void setPlace(PlaceEntity place) {
        this.place = place;
    }
    public CauseEntity getCause() {
        return cause;
    }
    public void setCause(CauseEntity cause) {
        this.cause = cause;
    }
}
