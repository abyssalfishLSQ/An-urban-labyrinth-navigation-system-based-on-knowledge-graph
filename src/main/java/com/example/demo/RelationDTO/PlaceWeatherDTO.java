package com.example.demo.RelationDTO;

import com.example.demo.model.PlaceEntity;
import com.example.demo.model.WeatherEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class PlaceWeatherDTO {
    private PlaceEntity place;
    private WeatherEntity weather;
    public PlaceEntity getPlace() {
        return place;
    }
    public void setPlace(PlaceEntity place) {
        this.place = place;
    }
    public WeatherEntity getWeather() {
        return weather;
    }
    public void setWeather(WeatherEntity weather) {
        this.weather = weather;
    }
}
