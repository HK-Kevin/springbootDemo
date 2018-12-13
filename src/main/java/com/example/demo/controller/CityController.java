package com.example.demo.controller;

import com.example.demo.domain.City;
import com.example.demo.service.CityService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ApiOperation(value = "通过Id查找城市", notes = "获取单个城市")
    @RequestMapping(value = "/city/{id}", method = RequestMethod.GET)
    public City getOneCity(@PathVariable("id") int id) {
        return cityService.findCityById(id);
    }

    @ApiOperation(value = "获取所有城市", notes = "获取所有城市")
    @RequestMapping(value = "/allList", method = RequestMethod.GET)
    public List<City> getAllList() {
        return cityService.findAllCity();
    }

    @ApiOperation(value = "删除城市", notes = "删除城市")
    @RequestMapping(value = "/city/{id}", method = RequestMethod.DELETE)
    public int deleteCity(@PathVariable("id") int id) {
        return cityService.delete(id);
    }

    @ApiOperation(value = "更新城市", notes = "更新城市")
    @RequestMapping(value = "/city/{id}", method = RequestMethod.PUT)
    public String updateCity(@PathVariable("id") int id, @RequestParam(value = "name") String name) {
        City city = new City();
        city.setName(name);
        city.setID(id);
        int t = cityService.update(city);
        if (t == 1) {
            return city.toString();
        } else {
            return "fail";
        }
    }
}
