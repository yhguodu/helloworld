package com.example.demo.helloworld.mapper;

import com.example.demo.helloworld.common.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {
    @Select("Select * from city where name=#{cityName}")
    City findCityByCityName(String cityName);
}
