package com.sourin.UserManagementSystem.controller;

import com.sourin.UserManagementSystem.model.User;
import com.sourin.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;



    @GetMapping("users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("getUser/{id}")
    public List<User> getUserById(@PathVariable Integer id){
         return userService.getUserById(id);
    }

    @PostMapping("adduser")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @DeleteMapping("deleteUser/{id}")
    public String removeUser(@PathVariable Integer id){
        return userService.removeUser(id);
    }

     @PutMapping("user/id/{id}/username/{userName}")
    public String updateUser(@PathVariable Integer id,@PathVariable String userName){

        return userService.updateUser(id,userName);

    }



}
