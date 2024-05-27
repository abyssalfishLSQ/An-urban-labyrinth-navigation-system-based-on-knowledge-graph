package com.example.demo.RelationDTO;

import com.example.demo.model.CauseEntity;
import com.example.demo.model.PlaceEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class PlaceCauseDTO {

    private PlaceEntity place;
    private CauseEntity cause;

    public CauseEntity getCause() {
        return cause;
    }

    public PlaceEntity getPlace() {
        return place;
    }

    public void setCause(CauseEntity cause) {
        this.cause = cause;
    }

    public void setPlace(PlaceEntity place) {
        this.place = place;
    }
}
