package com.started.proyect.controllers;

import com.started.proyect.models.User;
import com.started.proyect.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/phiinvestment/login")
    public Map<String, Object> prueba(){
        Map<String, Object> res = new HashMap<>();
        List<User> users = userService.findAll();
        for(User user : users){
            res.put("user", user);
        }
        res.put("status", 200);
        return res;
    }
}
