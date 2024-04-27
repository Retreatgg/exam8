package com.example.exam8.service.impl;

import com.example.exam8.dao.UserDao;
import com.example.exam8.dto.UserDto;
import com.example.exam8.model.User;
import com.example.exam8.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;
    private final PasswordEncoder encoder;

    @Override
    public void registerUser(UserDto userDto) {
        User user = new User();
        userDao.registerUser(transformDtoUser(user, userDto));
    }

    private User transformDtoUser(User user, UserDto userDto) {
        user.setEmail(userDto.getEmail());
        user.setPassword(encoder.encode(userDto.getPassword()));
        user.setEnabled(true);

        return user;
    }
}
