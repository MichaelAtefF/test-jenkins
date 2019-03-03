package com.demo.jenkins.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public ResponseEntity<Object> test(){

        return ResponseEntity.ok().body(null);
    }
}
