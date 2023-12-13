package com.example.demo.RelationDTO;

import com.example.demo.model.PlaceEntity;
import com.example.demo.model.ProvinceEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class PlaceProvinceDTO {
    private PlaceEntity place;
    private ProvinceEntity province;
    public PlaceEntity getPlace() {
        return place;
    }
    public void setPlace(PlaceEntity place) {
        this.place = place;
    }
    public ProvinceEntity getProvince() {
        return province;
    }
    public void setProvince(ProvinceEntity province) {
        this.province = province;
    }
}
