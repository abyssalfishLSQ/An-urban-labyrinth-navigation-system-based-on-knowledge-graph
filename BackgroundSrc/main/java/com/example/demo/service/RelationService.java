package com.example.demo.service;

import com.example.demo.RelationDTO.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RelationService {

    @Autowired
    private RelationRepository relationRepository;
    @Autowired
    private PlaceWeatherRepository placeWeatherRepository;
    @Autowired
    private PlaceTimeRepository placeTimeRepository;
    @Autowired
    private PlacePOIRepository placePOIRepository;
    @Autowired
    private PlaceCauseRepository placeCauseRepository;
    @Autowired
    private PlacePersonRepository placePersonRepository;
    @Autowired
    private PersonTripModeRepository personTripModeRepository;

    public List<PlaceAreaDTO>findPArea(String placeName){
        List<PlaceAreaDTO>result =new ArrayList<>();
        if (!placeName.isEmpty()){
            result=relationRepository.findPAreaName(placeName);
        }
        else {
            result=relationRepository.findPArea();
        }
        return result;
    }

    public List<PlaceCityDTO>findPCity(String placeName){
        List<PlaceCityDTO>result =new ArrayList<>();
        if (!placeName.isEmpty()){
            result=relationRepository.findPCityName(placeName);
        }
        else {
            result=relationRepository.findPCity();
        }
        return result;
    }

    public List<PlaceProvinceDTO>findPProvince(String placeName){
        List<PlaceProvinceDTO>result =new ArrayList<>();
        if (!placeName.isEmpty()){
            result=relationRepository.findPProvinceName(placeName);
        }
        else {
            result=relationRepository.findPProvince();
        }
        return result;
    }

    public List<AreaCityDTO>findACity(){ return relationRepository.findACity(); }
    public List<CityProvinceDTO>findCProvince(){
        return relationRepository.findCProvince();
    }
    public List<AreaProvinceDTO>findAProvince(){
        return relationRepository.findAProvince();
    }

    public List<PlaceWeatherDTO>findPWeather(String placeName){
        List<PlaceWeatherDTO>result =new ArrayList<>();
        if (!placeName.isEmpty()){
            result=placeWeatherRepository.findPWeatherName(placeName);
        }
        else {
            result=placeWeatherRepository.findPWeather();
        }
        return result;
    }

    public List<PlaceTimeDTO>findPTime(String placeName){
        List<PlaceTimeDTO>result =new ArrayList<>();
        if (!placeName.isEmpty()){
            result=placeTimeRepository.findPTimeName(placeName);
        }
        else {
            result=placeTimeRepository.findPTime();
        }
        return result;
    }

    public List<PlaceCauseDTO>findPCause(String placeName){
        List<PlaceCauseDTO>result =new ArrayList<>();
        if (!placeName.isEmpty()){
            result=placeCauseRepository.findPCauseName(placeName);
        }
        else {
            result=placeCauseRepository.findPCause();
        }
        return result;
    }

    public List<PlacePOIDTO>findPPOI(String placeName){
        List<PlacePOIDTO>result =new ArrayList<>();
        if (!placeName.isEmpty()){
            result=placePOIRepository.findPPOIName(placeName);
        }
        else {
            result=placePOIRepository.findPPOI();
        }
        return result;
    }

    public List<PlacePersonDTO>findPPerson(String placeName){
        List<PlacePersonDTO>result =new ArrayList<>();
        if (!placeName.isEmpty()){
            result=placePersonRepository.findPPersonName(placeName);
        }
        else {
            result=placePersonRepository.findPPerson();
        }
        return result;
    }
    public List<PersonTripModeDTO>findPTripMode(){
        return personTripModeRepository.findPTripMode();
    }

}
