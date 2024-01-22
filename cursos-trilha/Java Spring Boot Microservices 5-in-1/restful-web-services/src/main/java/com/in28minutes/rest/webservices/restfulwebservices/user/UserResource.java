package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user = userService.findOne(id);
        if(user == null){
            throw new UserNotFoundException(String.format("id:"+id));
        }

        return user;
    }


    // POST /users
    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User save = userService.save(user);

        // /users/4 => /users{id}, user.getID
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                                .path("/{id}")
                                                .buildAndExpand(save.getId())
                                                .toUri();
        // location = /users/4
        return ResponseEntity.created(location).build();
    }
}
