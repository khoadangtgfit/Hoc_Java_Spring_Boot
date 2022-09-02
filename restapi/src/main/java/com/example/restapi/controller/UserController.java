package com.example.restapi.controller;
import com.example.restapi.model.user;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private List<user> users=new ArrayList<user>();
    @PostMapping("/user")
    public user create(@RequestBody user user){
        users.add(user);
        return  user;
    }
    @GetMapping("/users")
    public  List<user> getAll(){
        return users;
    }

}
