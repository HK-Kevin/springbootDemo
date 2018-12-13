package com.example.demo.dao;

import com.example.demo.domain.City;

import java.util.List;

public interface ICityDAO {
    int add(City city);

    int update(City city);

    int delete(int ID);

    City findCityByID(int ID);

    List<City> findAllCity();
}
