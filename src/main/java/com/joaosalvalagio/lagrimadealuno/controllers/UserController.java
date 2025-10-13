package com.joaosalvalagio.lagrimadealuno.controllers;

import com.joaosalvalagio.lagrimadealuno.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
}
