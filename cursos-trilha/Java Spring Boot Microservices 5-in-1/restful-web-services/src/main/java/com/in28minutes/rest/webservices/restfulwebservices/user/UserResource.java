package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/user/{id}")
    public User retrieveUser(@PathVariable int id){
        return userService.findOne(id);
    }

    // POST /users
    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        userService.save(user);
    }
}
