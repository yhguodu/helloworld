package com.example.demo.helloworld.controller;

import com.example.demo.helloworld.common.City;
import com.example.demo.helloworld.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value="/city/{cityName}",method= RequestMethod.GET)
    public City gitCity(@PathVariable("cityName") String cityName) {
        return cityService.getCityByCityName(cityName);
    }
}
