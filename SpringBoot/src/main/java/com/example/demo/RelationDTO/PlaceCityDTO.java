package com.example.demo.RelationDTO;

import com.example.demo.model.CityEntity;
import com.example.demo.model.PlaceEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class PlaceCityDTO {
    private PlaceEntity place;
    private CityEntity city;
    public PlaceEntity getPlace() {
        return place;
    }
    public void setPlace(PlaceEntity place) {
        this.place = place;
    }
    public CityEntity getCity(){
        return city;
    }
    public void setCity(CityEntity city){
        this.city=city;
    }
}
