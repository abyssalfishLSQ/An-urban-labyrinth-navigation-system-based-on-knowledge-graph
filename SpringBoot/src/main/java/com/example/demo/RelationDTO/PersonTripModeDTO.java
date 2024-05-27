package com.example.demo.RelationDTO;

import com.example.demo.model.Person;
import com.example.demo.model.TripMode;
import org.springframework.data.neo4j.annotation.QueryResult;

@QueryResult
public class PersonTripModeDTO {
    private Person person;
    private TripMode tripMode;
    public Person getPerson(){
        return person;
    }
    public void setPerson(Person person){
        this.person=person;
    }
    public TripMode getTripMode(){
        return tripMode;
    }
    public void setTripMode(TripMode tripMode){
        this.tripMode=tripMode;
    }
}
