package com.example.exam8.controller;

import com.example.exam8.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("auth")
public class AuthController {

    @GetMapping("login")
    public String login(Model model) {
        return "auth/login";
    }

    @PostMapping("login")
    public String authLogin(UserDto user) {
        log.info(user.toString());
        System.out.println(user);
        return "redirect:/";
    }
}
