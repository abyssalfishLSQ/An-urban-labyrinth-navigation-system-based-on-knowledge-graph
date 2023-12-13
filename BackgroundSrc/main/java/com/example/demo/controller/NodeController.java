package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Node")
public class NodeController {
    @Autowired
    private NodeService nodeService;

    @PostMapping("/findAllPlace")
    public RespBean findAllPlace(){ return RespBean.success("查询成功",nodeService.findAllPlace());}

    @PostMapping("/findAllArea")
    public RespBean findAllArea(){
        return RespBean.success("查询成功",nodeService.findAllArea());
    }

    @PostMapping("/findAllCity")
    public RespBean findAllCity(){
        return RespBean.success("查询成功",nodeService.findAllCity());
    }

    @PostMapping("/findAllProvince")
    public RespBean findAllProvince(){
        return RespBean.success("查询成功",nodeService.findAllProvince());
    }

    @PostMapping("/findAllWeather")
    public RespBean findAllWeather(){
        return RespBean.success("查询成功",nodeService.findAllWeather());
    }

    @PostMapping("/findAllTime")
    public RespBean findAllTime(){
        return RespBean.success("查询成功",nodeService.findAllTime());
    }

    @PostMapping("/findAllCause")
    public RespBean findAllCause(){
        return RespBean.success("查询成功",nodeService.findAllCause());
    }

    @PostMapping("/findAllPOI")
    public RespBean findAllPOI(){
        return RespBean.success("查询成功",nodeService.findAllPOI());
    }

    @PostMapping("/findAllPerson")
    public RespBean findAllPerson(){
        return RespBean.success("查询成功",nodeService.findAllPerson());
    }

    @PostMapping("/findAllTripMode")
    public RespBean findAllTripMode(){
        return RespBean.success("查询成功",nodeService.findAllTripMode());
    }

    @PostMapping("/findByProvinceName")
    public RespBean findByProvinceName(@RequestParam("ProvinceName") String ProvinceName) {
        if (ProvinceName == null) {
            return RespBean.error("ProvinceName 不能为空", null);
        }

        List<ProvinceEntity> result = nodeService.findByProvinceName(ProvinceName);
        if (result.isEmpty()) {
            return RespBean.error("未找到匹配的区域", null);
        }

        return RespBean.success("成功查询", result);
    }

    @PostMapping("/findByCityName")
    public RespBean findByCityName(@RequestParam("CityName") String CityName) {
        if (CityName == null) {
            return RespBean.error("CityName 不能为空", null);
        }

        List<CityEntity> result = nodeService.findByCityName(CityName);
        if (result.isEmpty()) {
            return RespBean.error("未找到匹配的区域", null);
        }

        return RespBean.success("成功查询", result);
    }

    @PostMapping("/findByAreaName")
    public RespBean findByAreaName(@RequestParam("AreaName") String AreaName) {
        if (AreaName == null) {
            return RespBean.error("AreaName 不能为空", null);
        }

        List<AreaEntity> result = nodeService.findByAreaName(AreaName);
        if (result.isEmpty()) {
            return RespBean.error("未找到匹配的区域", null);
        }

        return RespBean.success("成功查询", result);
    }

    @PostMapping("/findByPlaceName")
    public RespBean findByPlaceName(@RequestParam("PlaceName") String PlaceName) {
        if (PlaceName == null) {
            return RespBean.error("PlaceName 不能为空", null);
        }

        List<PlaceEntity> result = nodeService.findByPlaceName(PlaceName);
        if (result.isEmpty()) {
            return RespBean.error("未找到匹配的区域", null);
        }

        return RespBean.success("成功查询", result);
    }

    @PostMapping("/findByTimeName")
    public RespBean findByTimeName(@RequestParam("TimeName") String TimeName) {
        if (TimeName == null) {
            return RespBean.error("TimeName 不能为空", null);
        }

        List<TimeEntity> result = nodeService.findByTimeName(TimeName);
        if (result.isEmpty()) {
            return RespBean.error("未找到匹配的区域", null);
        }

        return RespBean.success("成功查询", result);
    }

    @PostMapping("/findByWeatherName")
    public RespBean findByWeatherName(@RequestParam("WeatherName") String WeatherName) {
        if (WeatherName == null) {
            return RespBean.error("WeatherName 不能为空", null);
        }

        List<WeatherEntity> result = nodeService.findByWeatherName(WeatherName);
        if (result.isEmpty()) {
            return RespBean.error("未找到匹配的区域", null);
        }

        return RespBean.success("成功查询", result);
    }

    @PostMapping("/findByPersonName")
    public RespBean findByPersonName(@RequestParam("PersonName") String PersonName) {
        if (PersonName == null) {
            return RespBean.error("PersonName 不能为空", null);
        }

        List<Person> result = nodeService.findByPersonName(PersonName);
        if (result.isEmpty()) {
            return RespBean.error("未找到匹配的区域", null);
        }

        return RespBean.success("成功查询", result);
    }

    @PostMapping("/findByPOIName")
    public RespBean findByPOIName(@RequestParam("POIName") String POIName) {
        if (POIName == null) {
            return RespBean.error("POIName 不能为空", null);
        }

        List<POI> result = nodeService.findByPOIName(POIName);
        if (result.isEmpty()) {
            return RespBean.error("未找到匹配的区域", null);
        }

        return RespBean.success("成功查询", result);
    }

    @PostMapping("/findByCauseName")
    public RespBean findByCauseName(@RequestParam("CauseName") String CauseName) {
        if (CauseName == null) {
            return RespBean.error("CauseName 不能为空", null);
        }

        List<CauseEntity> result = nodeService.findByCauseName(CauseName);
        if (result.isEmpty()) {
            return RespBean.error("未找到匹配的区域", null);
        }

        return RespBean.success("成功查询", result);
    }

    @PostMapping("/findByTripModeName")
    public RespBean findByTripModeName(@RequestParam("TripModeName") String TripModeName) {
        if (TripModeName == null) {
            return RespBean.error("TripModeName 不能为空", null);
        }

        List<TripMode> result = nodeService.findByTripModeName(TripModeName);
        if (result.isEmpty()) {
            return RespBean.error("未找到匹配的区域", null);
        }

        return RespBean.success("成功查询", result);
    }

    @PostMapping("findPlacesByCityName")
    public RespBean findPlacesByCityName(@RequestParam("CityName")String CityName){
        if(CityName.isEmpty()){
            return RespBean.error("城市名不能为空");
        }
        List<PlaceEntity>result=nodeService.findPlacesByCityName(CityName);
        if(result.isEmpty()){
            return RespBean.error("该城市没有迷路地点",result);
        }
        else return RespBean.success("成功查询",result);
    }
}
