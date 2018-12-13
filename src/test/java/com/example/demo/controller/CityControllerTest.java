package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CityControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getOneCity() {
    }

    @Test
    public void getAllList() {
    }

//    @Test
//    public void deleteCity() throws Exception{
//        mvc.perform(MockMvcRequestBuilders.get("/city/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
////                .andExpect(MockMvcResultMatchers.content(1));  //测试接口返回内容
//    }

    @Test
    public void updateCity() {
    }
}