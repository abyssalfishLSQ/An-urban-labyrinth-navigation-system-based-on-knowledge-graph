package com.example.demo.RelationDTO;

import com.example.demo.model.Person;
import com.example.demo.model.PlaceEntity;
import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class PlacePersonDTO {
    private PlaceEntity place;
    private Person person;
    public PlaceEntity getPlace() {
        return place;
    }

    public void setPlace(PlaceEntity place) {
        this.place = place;
    }
    public Person getPerson(){
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
}
