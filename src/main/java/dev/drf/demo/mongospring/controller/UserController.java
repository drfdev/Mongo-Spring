package dev.drf.demo.mongospring.controller;

import dev.drf.demo.mongospring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    public UserController() {
    }
}
