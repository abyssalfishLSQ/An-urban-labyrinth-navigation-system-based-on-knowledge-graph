package com.example.demo.RelationDTO;

import com.example.demo.model.CityEntity;
import com.example.demo.model.ProvinceEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class CityProvinceDTO {
    private CityEntity city;
    private ProvinceEntity province;
    public CityEntity getCity() {
        return city;
    }
    public void setCity(CityEntity city) {
        this.city = city;
    }
    public ProvinceEntity getProvince(){
        return province;
    }
    public void setProvince(ProvinceEntity province){
        this.province=province;
    }
}
