package com.example.demo.helloworld.service;


import com.example.demo.helloworld.common.City;

public interface CityService {
    /**
     * get City by its name
     * @param cityName
     * @return
     */
    City getCityByCityName(String cityName);
}
