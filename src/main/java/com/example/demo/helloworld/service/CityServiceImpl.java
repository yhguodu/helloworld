package com.example.demo.helloworld.service;

import com.example.demo.helloworld.common.City;
import com.example.demo.helloworld.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityMapper cityMapper;

    @Override
    public City getCityByCityName(String cityName) {
        return cityMapper.findCityByCityName(cityName);
    }
}
