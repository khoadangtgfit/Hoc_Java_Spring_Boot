package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/rest")
public class TestRestController {
    @RequestMapping("/hello/{param}")
    public String sayHello(@PathVariable("param") String param){
        return "hello"+param;
    }
}
