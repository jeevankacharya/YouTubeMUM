package org.mumyoutube.youtube_controllers;

import org.mumyoutube.model.User;
import org.mumyoutube.youtube_service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;


    @GetMapping("/test")
    public String test(){
        return "I am up and running";
    }

    @GetMapping("/allUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @RequestMapping(value = "/adduser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

}
