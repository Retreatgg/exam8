package com.example.exam8.controller;

import com.example.exam8.model.User;
import com.example.exam8.service.FileService;
import com.example.exam8.util.UserUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("profile")
public class ProfileController {

    private final FileService fileService;
    private final UserUtil userUtil;

    @GetMapping("")
    public String profile(Authentication auth, Model model) {
        User user = userUtil.getUserByAuth(auth);
        model.addAttribute("user", user);
        model.addAttribute("files", fileService.getFilesByAuthorId(user.getId()));
        return "profile/myProfile";
    }
}
