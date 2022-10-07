package com.nikitin.springproject.controller;

import com.nikitin.springproject.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/sign_up/reg")
    public void saveUser(@ModelAttribute("userDto") UserDto userDto) {
        System.out.println("save");
    }


}
