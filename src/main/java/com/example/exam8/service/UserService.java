package com.example.exam8.service;

import com.example.exam8.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


    void registerUser(UserDto userDto);
}
