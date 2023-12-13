package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import org.neo4j.driver.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeService {
    @Autowired
    private CauseRepository causeRepository;
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private AreaRepository areaRepository;
    @Autowired
    private PlaceRepository placeRepository;
    @Autowired
    private POIRepository poiRepository;
    @Autowired
    private ProvinceRepository provinceRepository;
    @Autowired
    private TimeRepository timeRepository;
    @Autowired
    private WeatherRepository weatherRepository;
    @Autowired
    private TripModeRepository tripModeRepository;

    public List<PlaceEntity> findAllPlace() {
        return placeRepository.findAllPlace();
    }

    public List<AreaEntity> findAllArea() {
        return areaRepository.findAllArea();
    }

    public List<CityEntity> findAllCity() {
        return cityRepository.findAllCity();
    }

    public List<ProvinceEntity> findAllProvince() {
        return provinceRepository.findAllProvince();
    }

    public List<WeatherEntity> findAllWeather() {
        return weatherRepository.findAllWeather();
    }

    public List<TimeEntity> findAllTime() {
        return timeRepository.findAllTime();
    }

    public List<Person> findAllPerson() {
        return personRepository.findAllPerson();
    }

    public List<CauseEntity> findAllCause() {
        return causeRepository.findAllCause();
    }

    public List<POI> findAllPOI() {
        return poiRepository.findAllPOI();
    }

    public List<TripMode> findAllTripMode() {
        return tripModeRepository.findAllTripMode();
    }

    public List<ProvinceEntity> findByProvinceName(String ProvinceName) {
        return provinceRepository.findByProvinceName(ProvinceName); }

    public List<CityEntity> findByCityName(String CityName) {
        return cityRepository.findByCityName(CityName); }

    public List<AreaEntity> findByAreaName(String AreaName) {
        return areaRepository.findByAreaName(AreaName); }

    public List<PlaceEntity> findByPlaceName(String PlaceName) {
        return placeRepository.findByPlaceName(PlaceName); }

    public List<TimeEntity> findByTimeName(String TimeName) {
        return timeRepository.findByTimeName(TimeName); }

    public List<WeatherEntity> findByWeatherName(String WeatherName) {
        return weatherRepository.findByWeatherName(WeatherName); }

    public List<Person> findByPersonName(String PersonName) {
        return personRepository.findByPersonName(PersonName); }

    public List<POI> findByPOIName(String POIName) {
        return poiRepository.findByPOIName(POIName); }

    public List<CauseEntity> findByCauseName(String CauseName) {
        return causeRepository.findByCauseName(CauseName); }

    public List<TripMode> findByTripModeName(String TripModeName) {
        return tripModeRepository.findByTripModeName(TripModeName); }

    public List<PlaceEntity>findPlacesByCityName(String CityName){
        return cityRepository.findPlaceByCityName(CityName);
    }
}