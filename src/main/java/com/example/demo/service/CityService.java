package com.example.demo.service;

import com.example.demo.dao.CityDao;
import com.example.demo.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    CityDao cityDAO;

    public City findCityById(int id) {
        return cityDAO.findCityByID(id);
    }

    public List<City> findAllCity() {
        return cityDAO.findAllCity();
    }

    public int update(City city) {
        return cityDAO.update(city);
    }
    public int delete(int id) {
        return cityDAO.delete(id);
    }
}
