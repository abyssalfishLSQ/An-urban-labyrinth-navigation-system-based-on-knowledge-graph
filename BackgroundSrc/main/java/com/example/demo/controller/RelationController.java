package com.example.demo.controller;

import com.example.demo.RelationDTO.*;
import com.example.demo.model.RespBean;
import com.example.demo.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Relation")
public class RelationController {

    @Autowired
    private RelationService relationService;

    @PostMapping("/findPWeather")
    public RespBean findPWeather(@RequestParam(required = false)String placeName){
        List<PlaceWeatherDTO> result=relationService.findPWeather(placeName);
        if(placeName.isEmpty())
            return RespBean.error("placeName 不能为空",result);

        return RespBean.success("成功查询",result);
    }
    @PostMapping("/findPCause")
    public RespBean findPCause(@RequestParam(required = false)String placeName){
        List<PlaceCauseDTO>result=relationService.findPCause(placeName);
        if(placeName.isEmpty())
            return RespBean.error("placeName 不能为空",result);

        return RespBean.success("成功查询",result);
    }
    @PostMapping("/findPPerson")
    public RespBean findPPerson(@RequestParam(required = false)String placeName){
        List<PlacePersonDTO>result=relationService.findPPerson(placeName);
        if(placeName.isEmpty())
            return RespBean.error("placeName 不能为空",result);

        return RespBean.success("成功查询",result);
    }
    @PostMapping("/findPTime")
    public RespBean findPTime(@RequestParam(required = false)String placeName){
        List<PlaceTimeDTO>result=relationService.findPTime(placeName);
        if(placeName.isEmpty())
            return RespBean.error("placeName 不能为空",result);

        return RespBean.success("成功查询",result);
    }
    @PostMapping("/findPPOI")
    public RespBean findPPOI(@RequestParam(required = false)String placeName){
        List<PlacePOIDTO>result=relationService.findPPOI(placeName);
        if(placeName.isEmpty())
            return RespBean.error("placeName 不能为空",result);

        return RespBean.success("成功查询",result);
    }
    @PostMapping("/findPTripMode")
    public RespBean findPTripMode(){
        List<PersonTripModeDTO>result=relationService.findPTripMode();
        return RespBean.success("成功查询",result);
    }
    @PostMapping("/findPCity")
    public RespBean findPCity(@RequestParam(required = false)String placeName){
        List<PlaceCityDTO>result=relationService.findPCity(placeName);
        if(placeName.isEmpty())
            return RespBean.error("placeName 不能为空",result);

        return RespBean.success("成功查询",result);
    }
    @PostMapping("/findPArea")
    public RespBean findPArea(@RequestParam(required = false)String placeName){
        List<PlaceAreaDTO>result=relationService.findPArea(placeName);
        if(placeName.isEmpty())
            return RespBean.error("placeName 不能为空",result);

        return RespBean.success("成功查询",result);
    }
    @PostMapping("/findPProvince")
    public RespBean findPProvince(@RequestParam(required = false)String placeName){
        List<PlaceProvinceDTO>result=relationService.findPProvince(placeName);
        if(placeName.isEmpty())
            return RespBean.error("placeName 不能为空",result);

        return RespBean.success("成功查询",result);
    }
    @PostMapping("/findACity")
    public RespBean findACity(){
        List<AreaCityDTO>result=relationService.findACity();
        return RespBean.success("成功查询",result);
    }
    @PostMapping("/findCProvince")
    public RespBean findCProvince(){
        List<CityProvinceDTO>result=relationService.findCProvince();
        return RespBean.success("成功查询",result);
    }
    @PostMapping("/findAProvince")
    public RespBean findAProvince(){
        List<AreaProvinceDTO>result=relationService.findAProvince();
        return RespBean.success("成功查询",result);
    }
}
