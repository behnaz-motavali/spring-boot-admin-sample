package com.behsazan.actuator.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by motavali
 */
@RestController
public class ActuatorController {

    @PostMapping(value = "/getMessage")
    public String handle(){
        return "Hello";
    }
}
