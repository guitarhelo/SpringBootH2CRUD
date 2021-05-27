package com.learn.aws.controller;

import com.learn.aws.model.User;
import com.learn.aws.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/allUsers")
    public List<User> getAllusers(){
       return userRepository.findAll();
    }

    @PostMapping("/addUser")
    public User adduser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/findUser/{name}")
    public User getUserByName(@PathVariable String name){
        return userRepository.findByName(name);
    }
}
