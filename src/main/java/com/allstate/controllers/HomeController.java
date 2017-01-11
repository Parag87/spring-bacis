package com.allstate.controllers;

import com.allstate.models.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by localadmin on 11/01/17.
 */
@RestController
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Hello home(){
        Hello h = new Hello("Hello Spring",4);
        return h;
    }
}
