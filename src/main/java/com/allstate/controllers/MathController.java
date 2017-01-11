package com.allstate.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import com.allstate.models.Math;

/**
 * Created by localadmin on 11/01/17.
 */

@RestController
public class MathController {
    @RequestMapping(value = "/math/square/{x}")
    public Map<String,Integer> square(@PathVariable int x){
        int result = Math.square(x);
        Map<String,Integer> map = new HashMap<>();
        map.put("square",result);
        return  map;
    }
}
