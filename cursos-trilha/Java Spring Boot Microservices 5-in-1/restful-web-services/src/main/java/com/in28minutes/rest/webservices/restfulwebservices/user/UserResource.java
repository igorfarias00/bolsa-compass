package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {
    private UserDaoService userService;

    public UserResource(UserDaoService service){
        this.userService = service;
    }
    //GET /users
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return userService.findAll();
    }
}
