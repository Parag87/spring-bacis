package com.allstate.controllers;

import com.allstate.models.Geomatry;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GeomatryController {

    @RequestMapping(value="/geomatry/distance", method = RequestMethod.POST)
    public Map<String,Double> distance(@RequestBody List<Geomatry> geomatry){
        double result = Geomatry.distance(geomatry);
        Map<String,Double> map = new HashMap<>();
        map.put("distance", result);
        return map;
        //return  triangle;
    }
}
