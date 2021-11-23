package com.project.novepus.controller;

import com.project.novepus.model.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Hellocontroller {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/hashMap")
    public Map<String, Object> hashMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "xxx");
        map.put("age", 20);
        return map;
    }


}