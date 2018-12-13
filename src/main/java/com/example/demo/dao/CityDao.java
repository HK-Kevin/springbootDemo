package com.example.demo.dao;

import com.example.demo.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityDao implements ICityDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(City city) {
        return jdbcTemplate.update("insert into city(Name,CountryCode,District，Population) values(?,?,?,?)",
                city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation());
    }

    @Override
    public List<City> findAllCity() {
        String sql = "select * from city";
        return jdbcTemplate.query(sql, new Integer[]{}, new BeanPropertyRowMapper(City.class));
    }

    @Override
    public int update(City city) {
        String sql = "UPDATE city set Name = ? WHERE ID = ? ";
        return jdbcTemplate.update(sql, city.getName(), city.getID());
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE from city where id = ?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public City findCityByID(int ID) {
        System.out.println(ID);
        List<City> list = jdbcTemplate.query("select * from city where id = ?", new Integer[]{ID}, new BeanPropertyRowMapper(City.class));
        if (list != null && list.size() > 0) {
            City city = list.get(0);
            return city;
        } else {
            return null;
        }
    }


}
